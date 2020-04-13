package com.company;


public class Main {

    public static void main(String[] args) {
        //add Companhias Aéreas
        GerenciadorCias ciasAereas = GerenciadorCias.getGerenciadorCias();
        ciasAereas.adicionar("JJ", "LATAM Linhas Aéreas");
        ciasAereas.adicionar("G3", "Gol Linhas Aéreas SA");
        ciasAereas.adicionar("TP", "TAP Portugal");
        ciasAereas.adicionar("AD", "Azul Linhas Aéreas");

        System.out.println(ciasAereas.toString());

        //add Aeronaves
        GerenciadorAeronaves aeronave = GerenciadorAeronaves.getGerenciadorAeronaves();
        aeronave.adicionar("733", "Boeing 737-300", 140);
        aeronave.adicionar("73G", "Boeing 737-700", 126);
        aeronave.adicionar("380", "Airbus Industrie A380", 644);
        aeronave.adicionar("764", "Boeing 767-400", 304);

        System.out.println(aeronave.toString());

        //add Aeroportos
        GerenciadorAeroportos aeroporto = GerenciadorAeroportos.getGerenciadorAeroportos();
        // POA	Salgado Filho Intl Apt	-29.9939	-51.1711
        // GRU	São Paulo Guarulhos Intl Apt	-23.4356	-46.4731
        // LIS	Lisbon	38.7742	-9.1342
        // MIA	Miami International Apt	25.7933	-80.2906

        //add Rotas
       // GerenciadorRotas rota = GerenciadorRotas.getGerenciadorRotas();
       // rota.adicionar("G3","GRU","POA",738);
       // rota.adicionar("G3", "POA", "GRU", 738);
       // rota.adicionar("TP", "MIA", "LIS", 332);
       // rota.adicionar("JJ", "GRU", "GIG", 320);

      //  System.out.println(rota.toString());


        //add Vôos
        GerenciadorVoos voo = GerenciadorVoos.getGerenciadorVoos();
        //Data	Horário	Duração	Rota	Estado
        // 10/08/2016	8h	1:30	G3:POA-GRU	ATRASADO
        // 10/08/2016	15h	2:00	G3:POA-GIG	CONFIRMADO
        // 15/08/2016	12h	2:00	AR:POA-AEP	CANCELADO
    }
}
