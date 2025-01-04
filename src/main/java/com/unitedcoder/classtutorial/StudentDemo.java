package com.unitedcoder.classtutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Dolkun","Tarim",40,true));
        studentList.add(new Student("Mahmut","Ali",26,true));
        studentList.add(new Student("Zeynure"," ", 20,false));
        for(Student student:studentList)
        {
            String gender=student.isMale?"boy":"girl";
            System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getAge()+" "+gender);
        }

        Student student1=new Student();
        System.out.println(student1.getFirstName().toLowerCase());
    }


}
