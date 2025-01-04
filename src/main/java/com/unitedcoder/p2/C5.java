package com.unitedcoder.p2;

import com.unitedcoder.p1.C1;

public class C5 extends  C1 {

    public static void main(String[] args) {

        C5 c5=new C5();
        c5.x=10;
        c5.y=20;
        c5.m();
        System.out.println(c5.toString());
        System.out.println(VERSION);
    }

    @Override
    public String toString() {
        return "C5{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
