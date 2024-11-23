package com.unitedcoder.loop;

import java.util.Scanner;

public class MultiplicationDemo1 {
        public static void main(String[] args) {
            System.out.println("Please enter the max number for the multiplication table");
            Scanner input=new Scanner(System.in);
            int number=input.nextInt();
            for(int x=1;x<=number;x++)  //loop the rows
            {
                for(int y=1;y<=number;y++)  //loop the columns
                {
                    int multiply=x*y;
                    System.out.print(String.format("%d*%d=%d      ",x,y,multiply));
                }
                System.out.println(); //add a new line
            }
        }

}
