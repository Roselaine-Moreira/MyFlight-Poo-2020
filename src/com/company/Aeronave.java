package com.company;

public class Aeronave implements Imprimivel, Contavel{
    private static int totalAeronaves = 0;//atributo da classe inicializado
    private String codigo;
    private String descricao;
    private int capacidade;

    public Aeronave(String umCodigo, String umaDescricao, int umaCapacidade) {
        totalAeronaves++;
        codigo = umCodigo;
        descricao = umaDescricao;
        capacidade = umaCapacidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void getTotalCias(){
        System.out.println(codigo + " - " + descricao);
    }
    public static int getTotalAeronaves(){
        return totalAeronaves;
    }

    @Override
    public void imprimir() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Código da aeronave: " + codigo + " - " +
                "Descrição: " + descricao + " - " +
                "Capacidade: " + capacidade;
    }

    @Override
    public void contar() {
        System.out.println(toString());
    }
}
