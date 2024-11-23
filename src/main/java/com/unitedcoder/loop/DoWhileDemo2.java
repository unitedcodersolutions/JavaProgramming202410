package com.unitedcoder.loop;

import java.util.Scanner;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        //print all even and odd numbers from 1 to n and print the count of even and odd numbers
        // n is user input
        System.out.println("Please enter an integer number");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i=1;
        String oddNumbers="";
        String evenNumbers="";
        int evenNumberCount=0;
        int oddNumberCount=0;
        do
        {
            if(i%2==0) // even number
            {
                evenNumbers = evenNumbers + i + " ";
                evenNumberCount=evenNumberCount+1;  //evenNumberCount+=1
            }
            else {
                oddNumbers = oddNumbers + i + " ";
                oddNumberCount=oddNumberCount+1;
            }
            i++;
        }while (i<=n);
        System.out.println(evenNumbers);
        System.out.println("Total even numbers: "+evenNumberCount);
        System.out.println(oddNumbers);
        System.out.println("Total odd numbers: "+evenNumberCount);
    }
}
