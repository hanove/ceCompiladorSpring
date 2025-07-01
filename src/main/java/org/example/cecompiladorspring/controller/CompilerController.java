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

@RestController
@RequestMapping("/api/compile")
@CrossOrigin(origins = "*") // Permite requisições de qualquer origem
public class CompilerController {
    @PostMapping
    public ResponseEntity<CompilerResponse> compile(@RequestBody CompileRequest request) {
        try {
            //CeCompilador parser = new CeCompilador(new StringReader(""));

            CeCompilador.ReInit(new StringReader(request.getCode())); // Re-inicializa o parser com o código recebido

            CeCompilador.main(); // Executa o parser

            return ResponseEntity.ok(new CompilerResponse("Compilação bem-sucedida!", false));
        } catch (ParseException e) {
            Token tokenErro = e.currentToken;
            String simboloEncontrado = tokenErro.image;
            String simboloEsperado = e.expectedTokenSequences != null && e.tokenImage != null
                    ? e.tokenImage[e.expectedTokenSequences[0][0]]
                    : "Desconhecido";
            int linha = tokenErro.beginLine;
            int coluna = tokenErro.beginColumn;

            ErrorDetails errorDetails = new ErrorDetails(simboloEncontrado, simboloEsperado, linha, coluna);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new CompilerResponse("Erro sintático: " + e.getMessage(), true, errorDetails));
        } catch (TokenMgrError e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new CompilerResponse("❌ Erro léxico: " + e.getMessage(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body(new CompilerResponse("⚠️ Erro interno: " + e.getMessage(), true));
        }
    }

    public static class CompilerResponse {
        private String message;
        private boolean error;
        private ErrorDetails errorDetails;

        // Construtor, getters e setters
        public CompilerResponse(String message, boolean error) {
            this.message = message;
            this.error = error;
        }

        public CompilerResponse(String message, boolean error, ErrorDetails errorDetails) {
            this.message = message;
            this.error = error;
            this.errorDetails = errorDetails;
        }

        public String getMessage() {
            return message;
        }

        public boolean isError() {
            return error;
        }

        public ErrorDetails getErrorDetails() {
            return errorDetails;
        }
    }
}
