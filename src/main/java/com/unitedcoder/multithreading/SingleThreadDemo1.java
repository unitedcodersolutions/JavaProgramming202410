package com.unitedcoder.multithreading;

import java.util.Date;

public class SingleThreadDemo1 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            Date date=new Date();
            System.out.println("Time information: "+date);
            System.out.println(System.currentTimeMillis());
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
