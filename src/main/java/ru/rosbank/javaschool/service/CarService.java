package ru.rosbank.javaschool.service;

import ru.rosbank.javaschool.repository.Car;

public class CarService {

    public void distance(Car car) {
        if (car.getChargeFuel() > 0 && car.getVolumeFuel() >= 0) {
            if (car.getVolumeFuel() == 0){
                car.setDistance(0);
                System.out.println("Empty Fuel. Distance = 0");
            } else {
                car.setDistance((int) (car.getVolumeFuel() / car.getChargeFuel() *100));
                System.out.println(car.getDistance());
            }
        } else {
            car.setDistance(0);
            System.out.println("Incorrect parameters");
        }
    }
}
