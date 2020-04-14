package com.company;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    private GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    private static GerenciadorAeronaves instance;

    public static GerenciadorAeronaves getGerenciadorAeronaves(){
        if(instance == null){
            instance = new GerenciadorAeronaves();
        }
        return instance;
    }

    public void adicionar(Aeronave aeronave){
        aeronaves.add(aeronave);
    }

    public ArrayList<Aeronave> listarTodos(){
        return aeronaves;
    }
    //buscarData
    @Override
    public String toString() {
      String aux = "\nGerenciador de Aeronaves\n";
      for(Aeronave ae : aeronaves){
          aux = aux + ae.toString() + "\n";
      }
      return aux;
    }
}
