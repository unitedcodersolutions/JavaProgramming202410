package com.unitedcoder.datatype;

public class NumericOperators {
    public static void main(String[] args) {
        //+ - * / %
        int width=25;       int length=45;
        int area=width*length;
        System.out.println(area);
        int perimeter=2*(width+length);
        System.out.println(perimeter);

        float div=(float)length/width;
        System.out.println(div);

        //remainder  %
        System.out.println(5%2);//5/2=2.5   1
        System.out.println(8%2);//8/2=4  %=0
        System.out.println(10%3);//10/3=3....1
        System.out.println(10%6);//10/6=1.....4
        //%2=0  even number   %2!=0  odd number
        System.out.println(3+4*4+5*(4+3)-1);//3+16+35-1==53
    }
}
