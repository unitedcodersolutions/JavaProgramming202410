package com.unitedcoder.loop;

import java.util.Scanner;

public class ForLoopDemo2 {
    // print all numbers from 1 to n that will be divided by 5
    // n is a user input from the console
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String numbersDividedBy5="";
        int numbersDividedBy5Count=0;
        for(int i=1;i<=n;i++)
        {
            if(i%5==0)
            {
              numbersDividedBy5=numbersDividedBy5+i + " ";
              numbersDividedBy5Count++;
            }
        }
        System.out.println("Numbers divided by 5");
        System.out.println(numbersDividedBy5);
        System.out.println("Total count is "+numbersDividedBy5Count);

    }
}
