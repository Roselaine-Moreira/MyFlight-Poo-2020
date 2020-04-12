package com.company;

public class Aeronave {
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String umCodigo, String umaDescricao, int umaCapacidade) {
        codigo = umCodigo;
        descricao = umaDescricao;
        capacidade = umaCapacidade;
    }

    @Override
    public String toString() {
        return "Código da aeronave: " + codigo + " - " +
                "Descrição: " + descricao + " - " +
                "Capacidade: " + capacidade;
    }
}
