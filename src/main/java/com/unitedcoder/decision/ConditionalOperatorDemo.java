package com.unitedcoder.decision;

import java.util.Scanner;

public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input the first number: ");
        int n1=input.nextInt();
        System.out.println("Please input the second number");
        int n2=input.nextInt();
        //int max=(n1>n2)?n1:n2;
       // if(n1>n2)
        // max=n1;
       // else
        // max=n2;
        //System.out.println("Max number is "+max);
        //conditional operators if(condition)? value1: value2
        int max= (n1>n2) ? n1: n2;
        System.out.println(String.format("Max number is %d",max));
    }
}
