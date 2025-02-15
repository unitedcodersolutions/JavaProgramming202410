package com.unitedcoder.project;

public class FactorialExample {
    //factorial of 6 = 6*5*4*3*2*1=720
    //6*factorial(5)
    // 6*5*factorial(4)
    //6* 5*4*factorial(3)
    //6*5*4*3*factorial(2)
    //6*5*4*3*2*factorial(1)
    //recursive
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static long factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
            return n*factorial(n-1);
    }
}
