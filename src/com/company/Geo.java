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

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Latitude: " + latitude + ", " +
                "Longitude: " + longitude;
    }
}

