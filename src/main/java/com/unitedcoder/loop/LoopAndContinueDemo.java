package com.unitedcoder.loop;

public class LoopAndContinueDemo {
    public static void main(String[] args) {
        /*
        print all numbers from 1 to 100, but ignore numbers that divided by 5
        example: 1 2 3 4 6 7 8 9 11 12 13 14
         */
        for(int i=1;i<=100;i++)
        {
            if(i%5==0)
            continue;
            System.out.print(i+  " ");

        }
    }
}
