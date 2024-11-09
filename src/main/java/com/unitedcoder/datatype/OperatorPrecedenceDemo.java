package com.unitedcoder.datatype;

public class OperatorPrecedenceDemo {
    public static void main(String[] args) {

        int result=3+4*4+5*(4+3)-1;

        //evaluation order
        //Parenthesis first, multiplication/division, plus/minus
        //3+4*4+5*7-1
        //3+16+35-1
        //19+35-1
        //54-1
        //53
        System.out.println(result);
    }
}
