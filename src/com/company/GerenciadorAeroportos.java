package com.company;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    private GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    private static GerenciadorAeroportos instance;

    public static GerenciadorAeroportos getGerenciadorAeroportos() {
        if (instance == null) {
            instance = new GerenciadorAeroportos();
        }
        return instance;
    }
    //listarTodos
    public ArrayList<Aeroporto> listarTodas() {
        return new ArrayList<>(aeroportos);
    }
    //buscarData

    public void adicionar(String umCodigo, String umNome, Geo umLoc) {
        aeroportos.add(new Aeroporto(umCodigo, umNome, umLoc));
    }

    @Override
    public String toString() {
        String aux = "\n Gerenciador de Aeroportos\n";
        for(Aeroporto a : aeroportos){
            aux = aux + a.toString();
        }
        return aux;
    }
}
