package com.company;

public class Rota {
    private CiaAerea cia;
    private Aeroporto origem;
    private Aeroporto destino;
    private Aeronave aeronave;

    public Rota(CiaAerea umaCia, Aeroporto umaOrigem, Aeroporto umDestino, Aeronave umaAeronave) {
        cia = umaCia;
        origem = umaOrigem;
        destino = umDestino;
        aeronave = umaAeronave;
    }

    @Override
    public String toString() {
        return "Companhia Aérea: " + cia +
                "Origem: " + origem +
                "Destino: " + destino +
                "Aeronave: " + aeronave;

    }
}
