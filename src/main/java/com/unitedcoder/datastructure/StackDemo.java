package com.unitedcoder.datastructure;

import java.util.Stack;

public class StackDemo {
    //stack is last in, first out
    public static void main(String[] args) {
        Stack<String> books=new Stack<>();
        books.add("Uyghur History");  //1st book
        books.add("Harry Potter");    // 2nd book
        books.add("Learn Java");    // 3rd book
        books.add("Java SDET"); //4th book
        books.add(0,"C#");
        books.push("Python"); //add an item to the top of the stack
        System.out.println("Total books: "+books.size());
        //find the book on the top
        System.out.println(books.peek());
        System.out.println();

        //print out each book
        while(books.size()>0)
        {
            System.out.println(books.pop()); //get the book at the top

        }
    }
}
