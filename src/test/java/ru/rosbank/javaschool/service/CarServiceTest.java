package ru.rosbank.javaschool.service;

import org.junit.jupiter.api.Test;
import ru.rosbank.javaschool.model.Car;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarServiceTest {

    @Test
    void distanceZero() {
        CarService carService = new CarService();
        Car car = new Car(9.9, 0);
        assertEquals(0, carService.distance(car));
    }

    @Test
    void distanceThrow() {
        CarService carService = new CarService();
        Car car = new Car(0, 100);
        assertThrows(RuntimeException.class,()-> carService.distance(car));
    }

    @Test
    void distanceValid() {
        CarService carService = new CarService();
        Car car = new Car(9.9, 99);
        assertEquals(1000, carService.distance(car));
    }
}