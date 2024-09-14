package org.example.java16.records;

public class Exemplo {
    public static void main(String[] args) {
        Coordinate location = new Coordinate(40.7128, -74.0060);
        System.out.println("Latitude: " + location.latitude());
        System.out.println("Longitude: " + location.longitude());
    }
}
