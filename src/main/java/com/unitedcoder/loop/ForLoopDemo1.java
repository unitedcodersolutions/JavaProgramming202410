package com.unitedcoder.loop;

public class ForLoopDemo1 {
    //print 1 to 1000 numbers
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++)
        {
            System.out.print(i+" ");
        }
        //print 1 to 1000 even numbers
        System.out.println();
        for(int j=2;j<=1000;j+=2)
        {
            System.out.print(j+" ");
        }
        //print 1 to 1000 odd numbers 1,3,5,7,9,11,13
        System.out.println();
        for(int x=1;x<1000;x+=2)
        {
            System.out.print(x+ " ");
        }
    }
}
