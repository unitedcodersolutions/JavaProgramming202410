package com.unitedcoder.lambdastream;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLettersUsingStreamJava {
    private static int count=0;
    public static void main(String[] args) {
        //generate random 100 characters

        Random random=new Random();
        Object[] chars=random.ints(100,(int)'a',(int)'z'+1).
                mapToObj(e->(char)e).toArray();
        System.out.println("The lowercase letters are: ");
        Arrays.stream(chars).forEach(e->
        {
            System.out.print(e+ (++count%10==0 ? "\n":" "));
        });

        //group letters using stream
        count=0;
        System.out.println("\n The occurrences of each letter");
        Stream.of(chars).collect(Collectors.groupingBy(e->e, TreeMap::new,Collectors.counting())).forEach((k,v)->
        {
            System.out.println(v+" "+ k+ (++count %10==0? "\n":" "));
        });
    }
}
