package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.repository.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarServiceTest {
    private static Car car1 = new Car(0.0, 100);
    private static Car car2 = new Car(-1.0, 100);
    private static Car car3 = new Car(10.0, 0);
    private static Car car4 = new Car(-1.0, -10);
    private static Car car5 = new Car(0.0, 0.0);
    private static Car car6 = new Car(-1.0, 0.0);
    private static Car car7 = new Car(100.0, 4.6);
    private static Car car8 = new Car(9.9, 190);
    private static CarService carService = new CarService();


    @Test
    void zero() {
        carService.distance(car1);
        assertEquals(0, car1.getDistance());
        carService.distance(car3);
        assertEquals(0, car3.getDistance());
        carService.distance(car5);
        assertEquals(0, car5.getDistance());
    }

    @Test
    void negativeValue() {
        carService.distance(car2);
        assertEquals(0, car2.getDistance());
        carService.distance(car4);
        assertEquals(0, car4.getDistance());
        carService.distance(car6);
        assertEquals(0, car6.getDistance());
    }

    @Test
    void positiveValue() {
        carService.distance(car7);
        assertEquals(4, car7.getDistance());
        carService.distance(car8);
        assertEquals(1919, car8.getDistance());
    }
}