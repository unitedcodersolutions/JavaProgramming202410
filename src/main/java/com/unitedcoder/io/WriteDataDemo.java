package com.unitedcoder.io;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

public class WriteDataDemo {
    public static void main(String[] args) throws java.io.IOException {
        Random random=new Random();
        long randomNumber= random.nextInt(100000);
        File file = new File("doc/scores"+randomNumber+".txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }
// Create a file
        PrintWriter output = new PrintWriter(file);
// Write formatted output to the file
        StringBuilder myString=new StringBuilder();
        myString.append("Primitive Data Type").append("\n");
        myString.append("Collection Data Type").append("\n");
        myString.append("Java Class Inheritance").append("\n");
        myString.append("Java Class Error Handling").append("\n");
        myString.append("Learning Java is fun, but it is not easy to learn");
        output.println(myString);
// Close the file
        output.close();
    }
}
//outp
