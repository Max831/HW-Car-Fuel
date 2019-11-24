package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.model.Car;

public class CarService {
    public int distance(Car car) {
        if (car.getChargeFuel() <= Car.empty) {
            throw new RuntimeException("Incorrect parameters");
        } else if (car.getVolumeFuel() <= Car.empty) {
            car.setDistance(0);
            return car.getDistance();
        }
        car.setDistance((int) (car.getVolumeFuel() / car.getChargeFuel() *100));
        return car.getDistance();
    }
}
