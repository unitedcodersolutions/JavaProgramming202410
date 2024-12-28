package com.unitedcoder.lambdastream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaDemo2 {
    //we use Lambda Consumer functional interface
    public static void main(String[] args) {
        //create array list with 100 numbers
        List<Integer> numbers=new ArrayList<>();
        for(int x=0;x<100;x++)
        {
            numbers.add((int)(Math.random()*100));
        }
        numbers.forEach(n-> System.out.print(n+ " "));

        System.out.println();
        //print all numbers that dividedBy5
        //define a consumer as a list
        Consumer<List<Integer>> myList= list->{
            for(int i=0;i<list.size();i++)
            {
                    list.set(i,list.get(i));
            }
        };
        //use consumer to display
        Consumer<List<Integer>> dispList=list->list.stream().forEach(a->
                {if(a%5==0)System.out.print(a + " ");}
        );
        myList.andThen(dispList).accept(numbers); //only accept the numbers in my logic

    }
}
