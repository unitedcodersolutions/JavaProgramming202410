package com.unitedcoder.lambdastream;
import java.util.ArrayList;
import java.util.List;

public class LamdaDemo1 {
    public static void main(String[] args) {
        //Create an arrayList with 100 random integers
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            numbers.add((int)(Math.random()*100));
        }
        //use Lambda expression to print all numbers
        numbers.forEach(n->System.out.print(n+" ")); //lambda expression
        System.out.println();
        //use lambda to print all even numbers
        numbers.forEach(n->{if(n%2==0) System.out.print(n+ " ");});
        System.out.println();
        //use lambda to print all odd numbers
        numbers.forEach(i->{if(i%2!=0) System.out.print(i+ " ");});
    }
}
