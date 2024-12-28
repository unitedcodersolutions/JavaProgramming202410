package com.unitedcoder.lambdastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    //you have a list of students. You need to increase each grade by 20%
    public static void main(String[] args) {
        ArrayList<Integer> grades=new ArrayList<>();
        grades.add(60);
        grades.add(78);
        grades.add(80);
        grades.addAll(Arrays.asList(65,70,56,85,90,80));
        grades.stream().forEach(n-> System.out.print(n+ " "));
        System.out.println();
        //now we want to grace the grade by 20%
        //using stream and collection
        //transform the grade using stream map operations
        List<Integer> updatedGrades=grades.stream().map(i->i+(int)(i*0.20)).collect(Collectors.toList());
        updatedGrades.stream().forEach(n-> System.out.print (n+" "));
    }
}
