package com.unitedcoder.datatype;

public class IncrementDecrementDemo2 {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=300;
        a++;//101
        b--;//199
        c++;
        //= assignment operator
        int sum=a++;//first perform the other operation, then will increase the value
        System.out.println("sum= "+sum);
        System.out.println(a);//102
        int sum1=++a;//first increase value, then do the other operation
        System.out.println("sum1= "+sum1);
        System.out.println(a);
        //b=199
        int minus=b--;
        System.out.println("minus: "+minus);//199
        System.out.println(b);//198
        int minus1=--b;
        System.out.println("minus1: "+minus1);//197
        System.out.println(b);//197
    }
}
