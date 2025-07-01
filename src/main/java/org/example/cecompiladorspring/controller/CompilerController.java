package org.example.cecompiladorspring.controller;

import org.example.cecompilador.compilador.CeCompilador;
import org.example.cecompilador.compilador.ParseException;
import org.example.cecompilador.compilador.Token;
import org.example.cecompilador.compilador.TokenMgrError;
import org.example.cecompiladorspring.dto.CompileRequest;
import org.example.cecompiladorspring.dto.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.StringReader;
import java.util.List;

@RestController
@RequestMapping("/api/compile")
@CrossOrigin(origins = "*")
public class CompilerController {
    @PostMapping
    public ResponseEntity<CompilerResponse> compile(@RequestBody CompileRequest request) {
        try {
            CeCompilador.reset();
            CeCompilador.ReInit(new StringReader(request.getCode()));
            CeCompilador.main();

            if (!CeCompilador.getErrors().isEmpty()) {
                List<ErrorDetails> errorDetailsList = CeCompilador.getErrors().stream()
                        .filter(error -> error instanceof ParseException)
                        .map(error -> {
                            ParseException e = (ParseException) error;
                            Token tokenErro = e.currentToken;
                            String simboloEncontrado = tokenErro.next != null ? tokenErro.next.image : "fim de arquivo";
                            String simboloEsperado = e.expectedTokenSequences != null && e.tokenImage != null
                                    ? e.tokenImage[e.expectedTokenSequences[0][0]]
                                    : "Desconhecido";
                            int linha = tokenErro.next != null ? tokenErro.next.beginLine : -1;
                            int coluna = tokenErro.next != null ? tokenErro.next.beginColumn : -1;

                            return new ErrorDetails(simboloEncontrado, simboloEsperado, linha, coluna);
                        }).toList();

                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(new CompilerResponse("Erros sintáticos encontrados:", true, errorDetailsList));
            }

            return ResponseEntity.ok(new CompilerResponse("Compilação bem-sucedida!", false));

        } catch (TokenMgrError e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new CompilerResponse("Erro léxico: " + e.getMessage(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new CompilerResponse("Erro interno: " + e.getMessage(), true));
        }
    }

    public static class CompilerResponse {
        private String message;
        private boolean error;
        private List<ErrorDetails> errorDetailsList;

        public CompilerResponse(String message, boolean error) {
            this.message = message;
            this.error = error;
        }

        public CompilerResponse(String message, boolean error, List<ErrorDetails> errorDetailsList) {
            this.message = message;
            this.error = error;
            this.errorDetailsList = errorDetailsList;
        }

        public String getMessage() {
            return message;
        }

        public boolean isError() {
            return error;
        }

        public List<ErrorDetails> getErrorDetailsList() {
            return errorDetailsList;
        }
    }
}
