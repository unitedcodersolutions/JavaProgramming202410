package com.unitedcoder.decision;

import java.util.Scanner;

public class ATMDemo1 {
    //Design an ATM Demo
    /*
    ATM asks you to enter a pin
    if pin is accurate, you can check account balance, deposit money , withdraw money
    else
    system will exit
     */
    public static void main(String[] args) {
        System.out.print("Please enter your pin ");
        Scanner input=new Scanner(System.in);
        int pin=input.nextInt();
        if(pin==1234)
        {
            System.out.println("You account number is 12345679");
            System.out.println("Your account balance is $1000");
        }
        else
            System.out.println("Please try again with your correct pin");

    }
}
