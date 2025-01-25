package com.unitedcoder.io;

import java.util.Scanner;

public class MultiplicationTableFile {
    public static void main(String[] args) {
        System.out.println("Please enter the max number for the multiplication table");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        StringBuilder content=new StringBuilder();
        for(int x=1;x<=number;x++)  //loop the rows
        {
            for(int y=1;y<=number;y++)  //loop the columns
            {
                int multiply=x*y;
                content.append(String.format("%d*%d=%d      ",x,y,multiply));
            }
            content.append("\n");
        }
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("doc2","multiplicationtable",".txt",content.toString());
    }
}
