package com.unitedcoder.decision;

import java.util.Scanner;

public class ConditionalStatementDemo2 {
    public static void main(String[] args) {
        /*
        enter a number from console
        if the number is divided by 2 with a remainder 0, print even number
        else print odd number
         */
        System.out.print("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        //if the number is a negative number, system tells you to enter a positive number and exit
        if (number < 0) {
            System.out.println("Please enter a positive number");
           System.exit(1); //terminate the code
        }
        else {
            if (number % 2 == 0) {
                System.out.println(String.format("%d is an even number", number));
            } else {
                System.out.println(String.format("%d is an odd number", number));
            }
        }
    }
}
