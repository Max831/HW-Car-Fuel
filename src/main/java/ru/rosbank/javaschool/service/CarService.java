package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.repository.Car;

public class CarService {
    private final static int zeroValue = 0;

    public void distance(Car car) {
        if (car.getChargeFuel() > zeroValue && car.getVolumeFuel() > zeroValue) {
                car.setDistance((int) (car.getVolumeFuel() / car.getChargeFuel() *100));
                System.out.println(car.getDistance());
        } else {
            car.setDistance(zeroValue);
            System.out.println("Incorrect parameters");
        }
    }
}
