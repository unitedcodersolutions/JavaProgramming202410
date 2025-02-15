package com.unitedcoder.project;

public class SwapNumbers {
    //Give two variables x and y; swap the two variables value without using a third variable
    public static void main(String[] args) {
        int x=10;
        int y=5;
        //purpose: swap x and y; result: x=5; y=10;
        //add two numbers
        System.out.println(String.format("x=%d, y=%d",x,y));
        x=x+y;
        y=x-y; //from the sum, minus y becomes x, but we assign x value to y;
        x=x-y;//from the sum, we minus y, assign value to x
        System.out.println("After Swapping");
        System.out.println(String.format("x=%d, y=%d",x,y));
    }
}
