package com.unitedcoder.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3 {
    //add item
    //remove items
    //set items in specific location
    //search items
    //sub list
    public static void main(String[] args) {
        System.out.println("Add 4 students to a list");
        List<String> studentList=new ArrayList<String>();
        studentList.add("Mike");
        studentList.add("Maria");
        studentList.add("Alex");
        studentList.add("Chris");
        studentList.add("Maryam");
        studentList.add("Tom");
        studentList.add("Dinesh");
        studentList.add("Eleni");
        studentList.add("Christina");
        System.out.println(studentList);
        //get total students
        int totalStudents=studentList.size();
        System.out.println("Total students: "+totalStudents);
        //remove Alex
        studentList.remove("Alex");
        System.out.println(studentList);
        //add one student to the top of the list
        studentList.add(0,"Dolkun");
        System.out.println(studentList);
        //replace a student
        studentList.set(0,"Mahmut"); //replace Dolkun at 1st place with Mahmut
        System.out.println(studentList);
        //search a student
        for(String student:studentList)
        {
            if(student.equals("Maria"))
                System.out.println("We found the student: "+student);
            System.out.println(studentList.indexOf("Maria"));
        }
        //use index number for search
        for(int i=0;i<studentList.size();i++)
        {
            if(studentList.get(i)=="Maria")
            {
                System.out.println("Found the student: "+studentList.get(i));

                System.out.print("Order: ");
                System.out.print(i+1);
                System.out.println();
                break;
            }
        }
        System.out.println(studentList);
        //search Tom and rename Tom as Michael
        for(int i=0;i<studentList.size();i++)
        {
            if(studentList.get(i)=="Tom")
            {
                studentList.set(i,"Michael");
                break;
            }
        }
        System.out.println(studentList);
        //SubList
        totalStudents=studentList.size();
        System.out.println(totalStudents);
        List<String> group1=studentList.subList(0,(int)totalStudents/2); //from index ->inclusive, to Index -> Exclusive
        System.out.println(group1);
        List<String> group2=studentList.subList((int)totalStudents/2,totalStudents);
        System.out.println(group2);

        //Use Iterator and ListIterator to print values
        //print students from the beginning
        Iterator<String> students=studentList.iterator();
        while (students.hasNext()) {
            System.out.print(students.next() + "\t");
        }
        System.out.println();
        //print student from backwards
        ListIterator<String> studentListIterator=studentList.listIterator(studentList.size());//move the position to last
        while (studentListIterator.hasPrevious())
        {
            System.out.print(studentListIterator.previous()+" \t");
        }
    }


}
