package com.company;

public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo loc;

    public Aeroporto(String umCodigo, String umNome, Geo umLoc) {
        codigo = umCodigo;
        nome = umNome;
        loc = umLoc;
    }
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Geo getLocal() {
        return loc;
    }

    @Override
    public String toString() {
        return "Código do Aeroporto: " + codigo +
                "Nome do Aeroporto: " + nome +
                "Localização: " + loc;
    }


}
