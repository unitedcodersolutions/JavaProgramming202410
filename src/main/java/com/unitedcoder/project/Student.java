package com.unitedcoder.project;

public class Student implements Comparable<Student> {
    // Class data members
    private String name;
    private int grade;
    // Constructor of Student class
    public Student(String name,
                   int grade) {
        // this keyword refers to current instance itself
        this.name = name;
        this.grade = grade;
    }

    // Getter and Setter methods
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() { return grade; }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    // overriding the compareTo method of Comparable class
    @Override public int compareTo(Student comparestu) {
        int compareage
                = ((Student)comparestu).getGrade();

        //  For Ascending order
        return this.grade - compareage;

        // For Descending order do like this
        // return compareage-this.studentage;
    }

    @Override public String toString() {
        return "[  name="
                + name + ", age=" + grade + "]";
    }
}
