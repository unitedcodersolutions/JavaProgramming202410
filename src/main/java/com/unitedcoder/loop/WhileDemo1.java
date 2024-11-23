package com.unitedcoder.loop;

public class WhileDemo1 {
    public static void main(String[] args) {
       // System.out.println("Welcome to Java");
      //  System.out.println("Java programming is fun");
        int sum=0, i=1;
        while(i<10) {
            sum=sum + i;
            System.out.println("i is "+i + " sum is "+sum);
            i++;
        }
    }
}
