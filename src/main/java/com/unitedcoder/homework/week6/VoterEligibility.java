package com.unitedcoder.homework.week6;

import java.util.Scanner;

public class VoterEligibility {
    //if a person is over 18 and citizen, then the person is eligible for vote
    //else not eligible
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        System.out.println("Are you a citizen? type yes or no");
        String citizenship=input.next();
        if(age>=18 && citizenship.toLowerCase().equals("yes"))
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible");
    }
    //this method/function is used for Java Unit Testing
    public  boolean eligibleToVote(int age, String citizenship)
    {
        boolean eligible=false;
        if(age>=18 && citizenship.toLowerCase().equals("yes"))
        {
            eligible=true;
            System.out.println("You are eligible to vote");
        }
        else
        {
            eligible=false;
            System.out.println("You are not eligible to vote");
        }
        return  eligible;
    }
}
