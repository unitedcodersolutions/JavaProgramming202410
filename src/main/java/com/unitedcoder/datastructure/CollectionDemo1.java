package com.unitedcoder.datastructure;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo1 {
    //use collection to find min and max value
    public static void main(String[] args) {
        int[] numbers=new int[100];
        for(int i=0;i<100;i++)
        {
            numbers[i]=(int)(Math.random()*100);
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        //add numbers to the set
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<numbers.length;i++)
        {
            set.add(numbers[i]);
        }
        System.out.println();
        for(int i: set)
        {
            System.out.print(i + " ");
        }
        //print min value
        System.out.println("Min value is: "+ Collections.min(set));
        //print max value
        System.out.println("Max value is "+Collections.max(set));

        //We can sort String
        String[] students=new String[]{"Mike","Jason","Bob","Emily","Adam","Wilson","Zack"};
        Set<String> studentSet=new TreeSet<>();
        for(String student:students)
        {
            studentSet.add(student);
        }
        System.out.println();
        for(String student:studentSet)
        {
            System.out.print(student+ "  ");
        }
        System.out.println();
        System.out.println("Min alphabet name: "+Collections.min(studentSet,String.CASE_INSENSITIVE_ORDER));
        System.out.println("Max alphabet name: "+Collections.max(studentSet,String.CASE_INSENSITIVE_ORDER));

    }
}
