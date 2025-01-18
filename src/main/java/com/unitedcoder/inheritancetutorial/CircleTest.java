package com.unitedcoder.inheritancetutorial;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1=new Circle(10);
        Circle circle2=new Circle(10);
        System.out.println(circle1.toString());
        Rectangle rectangle1=new Rectangle(10,20);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(rectangle1));
        int x1=100;
        int x2=100;
        System.out.println(x1==x2);
    }
}
