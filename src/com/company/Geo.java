package com.company;

public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double umaLatitude, double umaLongitude) {
        latitude = umaLatitude;
        longitude = umaLongitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    //Método que calcula a distância entre dois pontos usando a fórmula de haversine
    public static double distancia(Geo pontoA, Geo pontoB){

        int raioTerra = 6371;

        double latitude1 = pontoA.getLatitude();
        double latitude2 = pontoB.getLatitude();

        double longitude1 = pontoA.getLongitude();
        double longitude2 = pontoB.getLongitude();

        double latDistancia = toRad(latitude2-latitude1);
        double lonDistancia = toRad(longitude2-longitude1);

        double a = Math.sin(latDistancia / 2) * Math.sin(latDistancia / 2) +
                Math.cos(toRad(latitude1)) * Math.cos(toRad(latitude2)) *
                        Math.sin(lonDistancia / 2) * Math.sin(lonDistancia / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double distancia= raioTerra * c;

        return distancia;
    }

    public double distanciaAtual(Geo ponto){
        Geo atual = new Geo(latitude, longitude);
        return distancia(atual, ponto);
    }

    public static double toRad(double valor){
        return valor * Math.PI / 180;
    }

    @Override
    public String toString() {
        return "Latitude: " + latitude + ", " +
                "Longitude: " + longitude;
    }
}

