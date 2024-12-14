package com.unitedcoder.datastructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    //we have many students; let's write a java code to store the grade and find the average grade
    public static void main(String[] args) {
        //define a list
        //int -> Integer, short -> Short , long -> Long, double -> Double , char - Char; boolean - Boolean
        //String -> String
        //List is an interface; ArrayList is an implementation (class)
        List<Integer> studentGrades=new ArrayList<Integer>();
        studentGrades.add(95);
        studentGrades.add(92);
        studentGrades.add(85);
        studentGrades.add(90);
        studentGrades.add(87);
        studentGrades.add(98);
        studentGrades.add(75);
        studentGrades.add(90);
        studentGrades.add(89);
        studentGrades.add(99);
        System.out.println(studentGrades);
        studentGrades.add(0,80);
        studentGrades.add(studentGrades.size()-1,90);
        System.out.println(studentGrades);
        //check an element for verification
        System.out.println(studentGrades.contains(92));
        System.out.println(studentGrades.contains(100));
        //find the average grade
        int totalStudents=studentGrades.size(); //total students
        int sum=0;
        for(int grade:studentGrades)
        {
            sum=sum+grade;
        }
        double average=(double) sum/totalStudents;
        System.out.println("Average grade is "+average);
    }
}
