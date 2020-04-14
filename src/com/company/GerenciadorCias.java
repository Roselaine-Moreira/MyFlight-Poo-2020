package com.company;

import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;

    private GerenciadorCias() {
        empresas = new ArrayList<>();
    }

    private static GerenciadorCias instance;

    public static GerenciadorCias getGerenciadorCias() {
        if (instance == null) {
            instance = new GerenciadorCias();
        }
        return instance;
    }

    public void adicionar( CiaAerea cia){
        empresas.add(cia);
    }

    public ArrayList<CiaAerea> listarTodas() {
        return new ArrayList<>(empresas);
    }

//    public void adicionar(String umCodigo, String umNome) {
//        empresas.add(new CiaAerea(umCodigo, umNome));
//    }

    @Override
    public String toString() {
        String aux = "\nGerenciador de Cias Aéreas\n";
        for (CiaAerea cia : empresas) {
            aux = aux + cia.toString() + "\n";
        }
        return aux;
    }
}
