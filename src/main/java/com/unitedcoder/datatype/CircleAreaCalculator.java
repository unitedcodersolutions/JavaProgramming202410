package com.unitedcoder.datatype;

import java.util.Scanner;

public class CircleAreaCalculator {
    // write an application to calculate an area of any circle
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please type a radius of a circle");
        int radius=input.nextInt();
        System.out.println(String.format("You entered the radius of a circle: %d ",radius));
        double area=Math.PI*radius*radius;
        System.out.printf("Area of a circle with radius %d is %.2f",radius,area);
    }
}
