package com.unitedcoder.classtutorial;

public class Car {
  //type,brand,model, price, vin, mileAge,color, engine, make, body type, fuelType,new/used
  private String type;
  private  String brand;
  private String model;
  private double price;
  private String vin;
  private  int mileAge;
  private String color;
  private String engine;
  private String make;
  private String bodyType;
  private String fuelType;
  private  boolean isNew;
  //create constructor
    //default constructor
    public Car()
    {

    }
    //constructor with some parameters
    public Car(String type, String brand, String model, double price, String color, String engine, boolean isNew) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.isNew = isNew;
    }
    //constructor with all parameters

    public Car(String type, String brand, String model, double price, String vin, int mileAge, String color, String engine, String make, String bodyType, String fuelType, boolean isNew) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.vin = vin;
        this.mileAge = mileAge;
        this.color = color;
        this.engine = engine;
        this.make = make;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.isNew = isNew;
    }
 //generate getter and setter


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    //generate to string

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", vin='" + vin + '\'' +
                ", mileAge=" + mileAge +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", make='" + make + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", isNew=" + isNew +
                '}';


    }

}
