package ru.rosbank.javaschool;

import ru.rosbank.javaschool.repository.Car;
import ru.rosbank.javaschool.service.CarService;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Car carNumber1 = new Car(4.6, 45);
        carService.distance(carNumber1);
        Car carNumber2 = new Car(7.7, 40);
        carService.distance(carNumber2);
        Car carNumber3 = new Car(1.1, 5);
        carService.distance(carNumber3);
    }
}
