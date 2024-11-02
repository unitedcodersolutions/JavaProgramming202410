package com.unitedcoder.datatype;

public class DataTypeConversionDemo1 {
    public static void main(String[] args) {
        //Widening casting- implicit casting  convert small type to large ones
        //byte->short->int->long->float->double
        int i1=100;
        long l1=i1;
        System.out.println(String.format("i1=%d",i1));
        System.out.println(String.format("l1=%d",l1));
        double d1=l1;
        float f1=l1;
        System.out.println(f1);
        System.out.println(d1);

        //Narrowing casting-convert large type to small
        long l2=20961;
        int  i2=(int)l2;
        System.out.println(i2);

        double d2=345.9876;
        int i3=(int)d2;
        System.out.println(i3);
        double d3=349.9999;
        int i4=(int)d3;
        System.out.println(i4+1);

        double d4=100.0528765456789;//15
        float  f4=(float)d4;//5-9
        System.out.println(f4);
        System.out.println(String.format("f4=%.2f",f4));





    }
}
