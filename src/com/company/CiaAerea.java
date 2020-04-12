package com.company;

public class CiaAerea {
    private String codigo;
    private String nome;

    public CiaAerea(String umCodigo, String umNome) {
        codigo = umCodigo;
        nome = umNome;
    }

    @Override
    public String toString() {
        return "Nome da Cia Aérea: " + nome + " " +
                "Código da Companhia Aérea: " + codigo;
    }
}
