package com.unitedcoder.datatype;

public class StringDemo2 {
    public static void main(String[] args)
    {
        // a and b are string literals
        String a="Hello";
        String b="Hello";
        System.out.println(a==b);

        //string object
        String a1=new String("Hello");
        String b1=new String ("Hello");
        System.out.println(a1==b1);
    }
}
