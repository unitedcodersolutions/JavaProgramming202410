package com.unitedcoder.inheritancetutorial;

public class Apple {
    private String color;
    private String brand;
    private String size;
    private  double price;
    //constructor
    public Apple()
    {

    }
    //constructor with parameters

    public Apple(String color, String brand, String size, double price) {
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
