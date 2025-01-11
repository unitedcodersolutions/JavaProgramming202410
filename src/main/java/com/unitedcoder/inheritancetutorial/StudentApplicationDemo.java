package com.unitedcoder.inheritancetutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentApplicationDemo {
    public static void main(String[] args) {
        Student student1=new Student(10001,"Mike","Smith",
                "Computer",28,"1997-01-01","Computer",
                "111 Main Street, Washington DC");
        System.out.println(student1.toString());

        GraduateStudent grad1=new GraduateStudent(20021,"Jake","Joshua","Bio Research 2025",30,"1992-05-01","Bio Engineering",
                "1234 Main Street, New York","Michael Dean","Clone Tech");
        System.out.println("Graduate Student");
        System.out.println(grad1.toString());
        //Doctor Student
        List<String> publications=new ArrayList<>();
        publications.add("Crypto Currency");
        publications.add("Doge Coin");
        DoctorStudent doc1=new DoctorStudent(90011,"David","Mike","CSC 2028",32,"1997-10-01","Computer Science","1234 Amsterdam, Netherlands",
                "David","Blocktrain Technology");
        System.out.println(doc1);

    }
}
