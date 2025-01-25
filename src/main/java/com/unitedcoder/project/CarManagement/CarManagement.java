package com.unitedcoder.project.CarManagement;

import java.util.ArrayList;
import java.util.List;

// CarManagement class to handle the car list
class CarManagement {
    private List<Car> cars;

    public CarManagement() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added: " + car);
    }

    public void listCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars found.");
        } else {
            System.out.println("List of cars:");
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

    public void removeCar(int index) {
        if (index >= 0 && index < cars.size()) {
            Car removedCar = cars.remove(index);
            System.out.println("Car removed: " + removedCar);
        } else {
            System.out.println("Invalid index. No car removed.");
        }
    }
}
