package com.unitedcoder.datatype;

public class PrimitiveDataTypeDemo1 {
    public static void main(String[] args) {
        //byte- smallest primitive data type
        byte age=23;
        byte score=98;
        byte sumByte= (byte) ((byte)age+(byte)score);
        System.out.println(sumByte);
        System.out.println(String.format("I am %s years old.",age));
        System.out.println(score);
        //short
        short i=Short.MIN_VALUE;
        short s=Short.MAX_VALUE;
        System.out.println(i);
        System.out.println(s);
        short salary=3500;
        short accountBalance=-1000;
        System.out.println(salary);
        System.out.println(accountBalance);

        //int  wrapper class
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println(min);
        System.out.println(max);
        int housePrice=6509876;
        int annualSalary=450987;
        System.out.println(housePrice);
        System.out.println(annualSalary);
        //long
        long min1=Long.MIN_VALUE;
        long max1=Long.MAX_VALUE;
        System.out.println(min1);
        System.out.println(max1);

        long l1=234567;
        long l2=789876543346l;

        //float
        float weight=45.89f;
        float loan=561.78f;
        System.out.println(weight);
        //double
        double d1=123.46786;
        double d2=3456.987654;
        System.out.println(d1);


    }
}
