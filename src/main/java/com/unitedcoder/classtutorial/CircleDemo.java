package com.unitedcoder.classtutorial;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1=new Circle(); //create an instance of the object, Circle
        circle1.setRadius(10);
        System.out.println("area: "+circle1.getArea(circle1.radius));

        Circle circle2=new Circle(15); //create an instance of the object with an initial value
        double circle2Area= circle2.getArea(circle2.radius);
        System.out.println("area : "+circle2Area);

    }
}
