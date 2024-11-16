package com.unitedcoder.decision;

import java.util.Scanner;

public class GradeDemo {
    public static void main(String[] args) {
        System.out.println("Please enter a grade");
        Scanner gradeInput = new Scanner(System.in);
        String gradeLetter; //we just define a string variable without value
        int grade = gradeInput.nextInt();
        if (grade >= 90 && grade <= 100)
            gradeLetter = "A, Excellent";
        else if (grade >= 80 && grade < 90)
            gradeLetter = "B, Good";
        else if (grade >= 70 && grade < 80)
            gradeLetter = "C, Better";
        else if (grade >= 60 && grade < 70)
            gradeLetter = "D, Please try harder";
        else {
            gradeLetter = "F, You failed";
        }
        System.out.println(String.format("Your grade is %s", gradeLetter));
    }
}
