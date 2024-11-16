package com.unitedcoder.homework.week5;
import java.util.Scanner;

public class SumCalculatorDemo {
    public static void main(String[] args) {
        //this program is to add number from 1 to n
        System.out.println("please enter your max number n for calculation");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        //define a sum variable
        int sum=0;
        for(int i=1;i<=n; i++)
        {
            sum=sum+i;
            System.out.println(String.format("i=%d sum=%d",i,sum));
        }
    }
}
