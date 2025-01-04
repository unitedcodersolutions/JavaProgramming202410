package com.unitedcoder.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StringGroup {
    public static void main(String[] args) {
        int length = 10; // Desired length of the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // Characters to choose from
        Random random = new Random(); //Random object
        List<String> stringList = new ArrayList<>(); //list to hold random strings
        for (int n = 0; n < 500; n++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(characters.length());
                char randomChar = characters.charAt(randomIndex);
                sb.append(randomChar);
            }
            String randomString = sb.toString().toLowerCase();
            stringList.add(randomString); //add each random string to the list
        }
        //print string with lambda
        stringList.forEach(e -> System.out.print(e + "  "));
        //print an empty line
        System.out.println();
        //loop
        for (char ch = 'a'; ch <= 'z'; ch++) {
            String temp=String.valueOf(ch);
            List<String> stringGroup=stringList.stream().filter(s->s.startsWith(temp)).collect(Collectors.toUnmodifiableList());
            System.out.println("Total strings starting with " + temp + " "+stringGroup.stream().count());
            stringGroup.forEach(s -> System.out.print(s + " "));
            System.out.println();
        }
    }
}
