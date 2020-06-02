package com.company;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("------------------Cadastro de Companhias Aéreas----------------------------------");
        //add Companhias Aéreas
        // GerenciadorCias ciasAereas = GerenciadorCias.getGerenciadorCias();
        CiaAerea cia1 = new CiaAerea("JJ", "LATAM Linhas Aéreas");
        CiaAerea cia2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
        CiaAerea cia3 = new CiaAerea("TP", "TAP Portugal");
        CiaAerea cia4 = new CiaAerea("AD", "Azul Linhas Aéreas");

        System.out.println(cia1.toString());
        System.out.println(cia2.toString());
        System.out.println(cia3.toString());
        System.out.println(cia4.toString());
        System.out.println("Total de empresas: "+ CiaAerea.getTotalCias());
        System.out.println("\n");


        System.out.println("-------------------Cadastro de Aeronaves----------------------------------");
        //add Aeronaves
        // GerenciadorAeronaves aeronave = GerenciadorAeronaves.getGerenciadorAeronaves();
        Aeronave nave1 = new Aeronave("733", "Boeing 737-300", 140);
        Aeronave nave2 = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave nave3 = new Aeronave("320", "Airbus Industrie A380", 644);
        Aeronave nave4 = new Aeronave("764", "Boeing 767-400", 304);

        System.out.println(nave1.toString());
        System.out.println(nave2.toString());
        System.out.println(nave3.toString());
        System.out.println(nave4.toString());
        System.out.println("Total de Aeronaves: " + Aeronave.getTotalAeronaves());
        System.out.println("\n");

        System.out.println("------------------Cadastro de Aeroportos----------------------------------");
        //add Aeroportos
        // double umaLatitude, double umaLongitude
        Geo geo1 = new Geo(-29.9939, -51.1711);
        Geo geo2 = new Geo(-23.4356, -46.4731);
        Geo geo3 = new Geo(-38.7742, -9.1342);
        Geo geo4 = new Geo(-25.7933, -80.2906);

        //Aeroporto(String umCodigo, String umNome, Geo umLoc)
        Aeroporto poa = new Aeroporto("POA", "Salgado Filho Intl Apt", geo1);
        Aeroporto sp = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", geo2);
        Aeroporto lisboa = new Aeroporto("LIS", "Lisbon", geo3);
        Aeroporto mia = new Aeroporto("MIA", "Miami International Apt", geo4);

        //calculando a distância,entre os aeroportos de Porto Alegre e Guarulhos
        double mostraDistancia = Geo.distancia(geo1,geo2);

        System.out.println(poa.toString());
        System.out.println(sp.toString());
        System.out.println(lisboa.toString());
        System.out.println(mia.toString());
        System.out.println("Distância entre POA e GRU: " + mostraDistancia);
        System.out.println("\n");

        System.out.println("------------------Cadastro de Rotas----------------------------------");

        //add Rotas
        //Rota(CiaAerea umaCia, Aeroporto umaOrigem, Aeroporto umDestino, Aeronave umaAeronave)
        Rota rota1 = new Rota(cia1, sp, poa, nave1);
        Rota rota2 = new Rota(cia1, poa, sp, nave1);
        Rota rota3 = new Rota(cia3, mia, lisboa, nave1);
        Rota rota4 = new Rota(cia4, sp, mia, nave4);

        System.out.println(rota1.toString());
        System.out.println(rota2.toString());
        System.out.println(rota3.toString());
        System.out.println(rota4.toString());
        System.out.println("\n");


        System.out.println("------------------Cadastro de Voos----------------------------------");
        //add Vôos
        //(ano, mes, dia, horas, minutos)
        LocalDateTime datahoraVoo1 = LocalDateTime.of(2020, 8, 10, 8, 0);
        Duration duracaoVoo1 = Duration.ofMinutes(78); // 1:30

        LocalDateTime datahoraVoo2 = LocalDateTime.of(2020, 8, 12, 15, 0);
        Duration duracaoVoo2 = Duration.ofMinutes(120); // 2 horas

        LocalDateTime datahoraVoo3 = LocalDateTime.of(2020, 07, 25, 12, 0);
        Duration duracaoVoo3 = Duration.ofMinutes(120); // 2 horas


        Voo voo1 = new Voo(rota1, datahoraVoo1,duracaoVoo1);
        Voo voo2 = new Voo(rota2,datahoraVoo2 ,duracaoVoo2);
        voo2.setStatus(Voo.Status.ATRASADO);
        Voo voo3 = new Voo(rota3,datahoraVoo3 ,duracaoVoo3);
        voo3.setStatus(Voo.Status.CANCELADO);

        System.out.println(voo1.toString());
        System.out.println(voo2.toString());
        System.out.println(voo3.toString());
        System.out.println("\n");

    }
}
