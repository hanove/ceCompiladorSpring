package org.example.cecompiladorspring.dto;

public class ErrorDetails {
    private String simboloEncontrado;
    private String simboloEsperado;
    private int linha;
    private int coluna;

    // Construtor
    public ErrorDetails(String simboloEncontrado, String simboloEsperado, int linha, int coluna) {
        this.simboloEncontrado = simboloEncontrado;
        this.simboloEsperado = simboloEsperado;
        this.linha = linha;
        this.coluna = coluna;
    }

    // Getters e Setters
    public String getSimboloEncontrado() {
        return simboloEncontrado;
    }

    public void setSimboloEncontrado(String simboloEncontrado) {
        this.simboloEncontrado = simboloEncontrado;
    }

    public String getSimboloEsperado() {
        return simboloEsperado;
    }

    public void setSimboloEsperado(String simboloEsperado) {
        this.simboloEsperado = simboloEsperado;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
