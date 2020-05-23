package com.company;

public class CiaAerea {
    private static int totalCias = 0;//atributo da classe inicializado
    private String codigo;
    private String nome;

    public CiaAerea(String umCodigo, String umNome) {
        totalCias++;
        codigo = umCodigo;
        nome = umNome;
    }

    public static int getTotalCias() {
        return totalCias;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome da Cia Aérea: " + nome + " " +
                "Código da Companhia Aérea: " + codigo;
    }
}
