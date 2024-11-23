package com.unitedcoder.loop;

public class ForeverLoopAndBreakDemo {
    public static void main(String[] args) {
        /*
        Example: You want to count from 1 to infinite
        when you count up to 5000, you stop counting
         */
        for(int i=1;;i++)
        {
            System.out.print(i+" ");
            if(i%50==0)
            {
                System.out.println();
            }
            if(i>=5000)
                break;
        }
    }
}
