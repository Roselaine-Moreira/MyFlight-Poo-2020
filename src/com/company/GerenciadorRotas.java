package com.company;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    private GerenciadorRotas() {
        rotas = new ArrayList<>();
    }

    private static GerenciadorRotas instance;

    public static GerenciadorRotas getGerenciadorRotas() {
        if (instance == null) {
            instance = new GerenciadorRotas();
        }
        return instance;
    }

    public void adicionar(Rota rota) {
        rotas.add(rota);

    }

    public ArrayList<Rota> listarTodas() {
        return rotas;//lista de rotas
    }

    //buscarData

    public String toString() {
        String aux = "\n Gerenciador de Rotas \n";
        for (Rota r : rotas) {
            aux = aux + r.toString() + "\n";
        }
        return aux;
    }

}
