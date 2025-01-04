package com.unitedcoder.classtutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarApplication {
    public static void main(String[] args) {
        Car car1=new Car(); //we create an instance of the object car using the default constructor
        car1.setType("Sports");
        car1.setColor("Red"); car1.setBrand("Toyota RAV4"); car1.setPrice(35000.00); car1.setBodyType("SUV");
        car1.setMake("Toyota");car1.setVin("1234"); car1.setModel("RAV4 2024");car1.setNew(true);
        car1.setMileAge(15);
        car1.setEngine("V6");
        car1.setFuelType("Gasoline");
        System.out.println(car1.toString());
        //define car2
        Car car2=new Car("Compact","Hunda","ModelS",26000,"Blue","V6",false);
        Car car3=new Car("Luxury","BMW","BMW X1 Drive 28",65000,"BMW12345678",10,"Black","V8","BMW","SUV","Gasoline",true);
        Car car4=new Car("Luxury","BMW","BMW X2 Drive 30",100000,"BMW6666",100,"Navy Blue","V8","BMW","SUV","Gasoline",true);
        List<Car> cars=new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        //print out the cars
        for(Car car: cars)
        {
            System.out.println(car.getBrand());
            System.out.println(car.getColor());
            System.out.println(car.getBodyType());
            System.out.println(car.getEngine());
            System.out.println(car.getMake());
            System.out.println(car.getFuelType());
            System.out.println(car.getModel());
            System.out.println(car.getMileAge());
            System.out.println(car.getType());
            System.out.println(car.getVin());
            System.out.println(car.getPrice());
            System.out.println(car.isNew()?"New":"Used");
            System.out.println();
        }
        //print cars using toString
        for(Car car: cars)
        {
            System.out.println(car.toString());
            System.out.println();
        }
        //print cars using lambda function
        System.out.println("Using lambda to print out cars");
        cars.forEach(car-> System.out.println(car.toString()));
        //filter the cars with brand BMD
        //only print BMW
        System.out.println("Need to print BMW");
        List<Car> bmwCars=new ArrayList<>();
       bmwCars= cars.stream().filter(car->car.getBrand().contains("BMW")).collect(Collectors.toUnmodifiableList());
       bmwCars.forEach(car-> System.out.println(car.toString()));
    }
}
