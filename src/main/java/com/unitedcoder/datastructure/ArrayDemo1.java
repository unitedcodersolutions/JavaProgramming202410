package com.unitedcoder.datastructure;

import java.util.Arrays;

public class ArrayDemo1 {
    //define an array
    //assign value to array
    //access array values
    public static void main(String[] args) {
        int[] numbers=new int[10]; //Initialize the array with values or define the array and then assign values
        numbers[0]=150;
        //numbers[1]=200;
        numbers[2]=100;
        numbers[3]=500;
        numbers[4]=200;
        numbers[5]=400;
        numbers[6]=50;
        numbers[7]=20;
        numbers[8]=1010;
        numbers[9]=300;
        System.out.println(numbers);
        System.out.println(numbers[9]);
        System.out.println(numbers[1]);
        //define array with initial value
        int[] ages={18,20,22,30,35,40,42,25,28,30,35,41};
        //find the length of an array
        System.out.println("Total numbers: "+numbers.length);
        System.out.println("Total ages: "+ages.length);
        //Sort an array
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        //using loop to get array elements
        //using for loop
        for(int n=0;n<ages.length;n++)
        {
            System.out.print(ages[n] +" ");
        }
        System.out.println();
        //we can use for each loop (enhanced for loop) to access array elements
        for(int age:ages)
        {
            System.out.print(age+" ");
        }
    }
}
