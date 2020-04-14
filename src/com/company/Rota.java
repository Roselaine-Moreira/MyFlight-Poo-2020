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


    public CiaAerea getCia() {
        return cia;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    @Override
    public String toString() {
        return "Companhia Aérea: " + cia.getCodigo() + " " +
                "Origem: " + origem.getCodigo() + " " +
                "Destino: " + destino.getCodigo() + " " +
                "Aeronave: " + aeronave.getCodigo();
    }

}

