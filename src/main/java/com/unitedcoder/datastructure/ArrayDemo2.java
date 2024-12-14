package com.unitedcoder.datastructure;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] students=new String[]{"Dolkun","Nusret","Rezwangul","Reza","Rena","Rehile",
                "Patigu","Nazaket","Muhammad","Mayire"};
        System.out.println(students[2]);
        for(String student:students)
        {
            System.out.print(student+" ");
        }
        System.out.println();
        int[] numbers=new int[1000]; //define number arrays
        for(int i=0;i<1000;i++)
        {
            numbers[i]=(int)(Math.random()*1000); //assign random numbers to array
        }
        for(int number:numbers)
        {
            if(number%2==0)
            {
                System.out.print(number+" ");
            }
        }
        //print array items backwards
        System.out.println();
        Arrays.sort(students); //sort with ascending order
        //print student with descending order
        for(int i=students.length-1;i>=0;i--)
        {
            System.out.print(students[i]+" ");
        }
    }
}
