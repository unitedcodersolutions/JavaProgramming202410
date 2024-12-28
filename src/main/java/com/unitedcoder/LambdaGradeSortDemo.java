package com.unitedcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaGradeSortDemo {
    public static void main(String[] args) {
        //sort students by grade
        ArrayList<String> students = new ArrayList<>();
        students.add("Mike,50");
        students.add("Alice,55");
        students.add("Maria,78");
        students.add("Nicholas,61");
        students.add("Michael,95");
        students.add("Alexander,86");
        students.add("Tony,79");
        students.add("Olivia,60");
        students.add("Brian,65");
        students.add("Aryan,98");
        students.add("Thomas,75");
        List<String> gradeList=new ArrayList<>();
        students.forEach(student->{
            String[] part=student.split(",");
            gradeList.add(part[1]+","+part[0]);  //swap the order of name and grade and add to the list
        });
        String[] sortedGrades=gradeList.toArray(new String[gradeList.size()]);
        Arrays.sort(sortedGrades);
        //print students
        for(String s: sortedGrades)
        {
            System.out.println(s);
        }
    }
}
