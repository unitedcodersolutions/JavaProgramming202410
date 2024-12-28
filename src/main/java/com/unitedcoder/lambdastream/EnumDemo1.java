package com.unitedcoder.lambdastream;

import java.util.Scanner;

public class EnumDemo1 {
    enum MyFavoriteColor{
        RED,GREEN,BLUE,WHITE
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a color");
        String color=input.next();
        if(color.toLowerCase().equals(MyFavoriteColor.GREEN.name().toLowerCase()))
        {
            System.out.println("Hey, you like the same color as me");
        }
        else
        {
            System.out.println("Oh, my favorite color is different");
        }
        //System.out.println("My favorite color is "+MyFavoriteColor.GREEN);
        //System.out.println("My favorite color is "+ MyFavoriteColor.BLUE);
    }
}
