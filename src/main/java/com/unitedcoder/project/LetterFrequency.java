package com.unitedcoder.project;
import java.util.Scanner;
public class LetterFrequency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a string (not include any number)");
        String str=scanner.nextLine();
        String result = ""; // this will hold new string
        for (int i = 0; i < str.length(); i++) { // this will hold a character till be checked by inner loop
            int count = 0; // put here so that it can be zero after each cycle for new character
            for (int j = 0; j < str.length(); j++) { // this will change
                if(str.charAt(i) == str.charAt(j)){ // this will check whether there is a same character
                    count++; // if there is a same character, count will increase
                }
            }
            if( !(result.contains(""+str.charAt(i))) ){ // this checks if result doesn't contain the checked character
                result += ""+str.charAt(i); // first if result doesn't contain the checked character, character will be added
                result += count+" "; // then the character's frequency will be added
            }
        }
        System.out.println(result);
    }
}
