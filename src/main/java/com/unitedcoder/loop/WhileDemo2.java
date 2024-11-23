package com.unitedcoder.loop;

import java.util.Scanner;

public class WhileDemo2 {
    public static void main(String[] args) {
        //print all even and odd numbers from 1 to n
        // n is user input
        System.out.println("Please enter an integer number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        String oddNumbers="";
        String evenNumbers="";
        while (i<=n)
        {
            if(i%2==0) // even number
                evenNumbers=evenNumbers+ i+" ";
            else {
                oddNumbers = oddNumbers + i + " ";
            }
            i++;
        }
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
