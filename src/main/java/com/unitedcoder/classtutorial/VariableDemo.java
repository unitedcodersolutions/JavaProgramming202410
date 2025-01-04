package com.unitedcoder.classtutorial;

public class VariableDemo {
    public final static double PI=3.1415;  //final static variable cannot change value after declaration
    public static int x;  //class variable x
    public static int y;   //class variable x

    public static void main(String[] args) {
       x=10;
       y=20;
        System.out.println(x+y);
        add(5,10);

    }
    public static void add(int a, int b)  //a and b are local variable in the class
    {
        int sum=a+b;
        sum=sum+x+y;
        System.out.println("sum is "+ sum);
    }
}
