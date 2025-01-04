package com.unitedcoder.classtutorial;

public class Circle {
    public int radius;  //class variable; instance variable , data field

    //default constructor (no argument constructor)
    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    //generate getter and setter


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(int radius)
    {
        double area=Math.PI* radius*radius;
        return  area;
    }
}
