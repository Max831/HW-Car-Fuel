package ru.rosbank.javaschool.repository;

public class Car {
    private double chargeFuel;
    private double volumeFuel;
    private int distance;

    public Car(double chargeFuel, double volumeFuel) {
        this.chargeFuel = chargeFuel;
        this.volumeFuel = volumeFuel;
    }

    public double getChargeFuel() {
        return chargeFuel;
    }

    public void setChargeFuel(double chargeFuel) {
        this.chargeFuel = chargeFuel;
    }

    public double getVolumeFuel() {
        return volumeFuel;
    }

    public void setVolumeFuel(double volumeFuel) {
        this.volumeFuel = volumeFuel;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
