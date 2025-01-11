package com.unitedcoder.inheritancetutorial;

public class InheritanceTestDemo {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        System.out.println("A cirlce "+circle.toString());
        System.out.println("The color is "+circle.getColor());
        System.out.println("The radius is "+circle.getRadius());
        System.out.println("The area is "+circle.getArea());
        System.out.println("The perimeter is "+circle.getPerimeter());

        //check Rectangle
        System.out.println("This is for testing the rectangle");
        Rectangle rectangle1=new Rectangle(10,5);
        System.out.println("A Rectangle "+rectangle1.toString());
        System.out.println("The color is "+rectangle1.getColor());
        System.out.println("The area is "+rectangle1.getArea());
        System.out.println("The perimeter is "+rectangle1.getPerimeter());
    }
}
