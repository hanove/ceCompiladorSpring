package org.example.cecompiladorspring.dto;

public class CompileRequest {
    private String code;

    // Construtor vazio (obrigatório para o Spring)
    public CompileRequest() {}

    // Getters e Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
