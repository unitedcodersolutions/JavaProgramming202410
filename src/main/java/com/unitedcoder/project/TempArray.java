package com.unitedcoder.project;

public class TempArray {
    public static void main(String[] args) {
        String[] options={"rock","paper","scissors"};
        System.out.println(options[0]);
        System.out.println(options[1]);
        System.out.println(options[2]);
        int computerChoice = (int) (Math.random() * 3);
        System.out.println(computerChoice);
    }
}
