package com.unitedcoder.datatype;

import java.util.Scanner;

public class SumCalculatorDemo {
    public static void main(String[] args) {
        //define a scanner object to input numbers from the console
        Scanner intput1=new Scanner(System.in);

        Scanner intput2=new Scanner(System.in);

        System.out.println("Please input the first number (int or double)");
            double n1 = intput1.nextDouble();
            System.out.println("Please input the second number (int or double)");

            double n2 = intput2.nextDouble();
            double sum = n1 + n2;
            System.out.println(String.format("sum of %.2f and %.2f is %.2f", n1, n2, sum));
        }
    }
