package com.company;

public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double umaLatitude, double umaLongitude) {
        latitude = umaLatitude;
        longitude = umaLongitude;
    }

    @Override
    public String toString() {
        return "Latitude: " + latitude +
                "Longitude: " + longitude;
    }
}

