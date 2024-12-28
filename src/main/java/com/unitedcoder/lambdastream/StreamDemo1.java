package com.unitedcoder.lambdastream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> myNumbers=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            myNumbers.add((int)(Math.random()*100));
        }
        //print all numbers
        System.out.println(myNumbers);
        //use stream to collect all even numbers

        List<Integer> evenNumbers=myNumbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        List<Integer> oddNumbers=myNumbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("Even numbers");
        System.out.print(evenNumbers);
        System.out.println("Odd numbers");
        System.out.println(oddNumbers);
    }
}
