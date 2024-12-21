package com.unitedcoder.project;
import java.util.*;

public class GradeManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Mike,50");
        students.add("Alice,55");
        students.add("Maria,78");
        students.add("Michael,95");
        students.add("Alexander,86");
        students.add("Tony,79");
        students.add("Olivia,60");
        students.add("Brian,65");
        students.add("Aryan,98");
        students.add("Thomas,75");
        //before comparison
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("-----------------");
        ArrayList<Student> studentList = new ArrayList<Student>();
        for (String s : students) {
            String[] temp = s.split(",");
            studentList.add(new Student(temp[0], Integer.parseInt(temp[1])));
        }
        Collections.sort(studentList); //Sort object using a grade
        for (Student str : studentList) {
            System.out.println(str);
        }
    }
}
