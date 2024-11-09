package com.unitedcoder.datatype;

public class MathDemo {
    public static void main(String[] args)
    {
        //using Math object to find square root, power, absolute value, min , max
        int n1=10;
        //System.out.println("Square root of "+n1+"=" + Math.sqrt(n1));
        //Round up (if a number after the decimal point is greater than 5)
        //Round down (if a number after the decimal point is less than 5)
        double squareRootValue=Math.sqrt(n1);
        System.out.println(String.format("Square root of %d is %.1f",n1,squareRootValue));
        System.out.printf("Square root of %d is %.3f",n1,Math.sqrt(n1));
        //calculate an area of a circle
        //PI R2
        System.out.println();
        int radius=10;
        double circleArea=Math.PI*Math.pow(radius,2); //Math.pow(radius, 2) == radius * radius
        System.out.println("Area of the Circle " + circleArea);

        // get an absolute value
        System.out.println(Math.abs(-250));
        //find max and min numbers
        int maxNumber=Math.max(25,20);
        int minNumber=Math.min(25,20);
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}
