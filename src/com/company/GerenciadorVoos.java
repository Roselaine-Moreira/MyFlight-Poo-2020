package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    private GerenciadorVoos() {//inicializa a lista de voos
        voos = new ArrayList<>();//lista de voos
    }

    //atributo da Classe
    private static GerenciadorVoos instance;

    public static GerenciadorVoos getGerenciadorVoos() {
        if (instance == null) {
            instance = new GerenciadorVoos();
        }
        return instance;
    }

    //public void adicionar(LocalDateTime umaDataHora, Duration umaDuracao, Rota umaRota, Voo.Status umStatus) {
    //    voos.add(new Voo(umaDataHora, umaDuracao, umaRota, umStatus));
    //}

    public void adicionar (Voo voo){
        voos.add (voo);
    }

    public ArrayList<Voo> listarTodos(){
        return voos;
    }

    //buscarData

    public String toString() {
        String aux = "\n Gerenciador de Voos\n";
        for (Voo v : voos) {
            aux = aux + v.toString() + "\n";
        }
        return aux;
    }

}

