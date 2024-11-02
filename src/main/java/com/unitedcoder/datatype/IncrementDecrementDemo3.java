package com.unitedcoder.datatype;

public class IncrementDecrementDemo3 {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=50;
        //=,+,++
        int sum1=100+(a++);
        System.out.println("sum1="+sum1);//200
        System.out.println(a);//101
        int sum2=200+(++a);
        System.out.println("sum2="+sum2);//302
        System.out.println(a);//102
        //=,-
        int minus1=500-(b--);
        System.out.println("minus1="+minus1);//300
        System.out.println(b);//199
        int minus2=(--b)-50;
        System.out.println("minus2="+minus2);//148
        System.out.println(b);//198
        int multi=5*(++c);
        System.out.println("multi="+multi);

    }
}
