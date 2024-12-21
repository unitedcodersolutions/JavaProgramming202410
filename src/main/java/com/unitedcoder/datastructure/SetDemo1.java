package com.unitedcoder.datastructure;
import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        // Create a hash set
        //Set data structure does not allow duplicates
        Set<String> set = new HashSet<>();
// Add strings to the set
        set.add("London");
        set.add("Istanbul");
        set.add("Istanbul");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Tokyo");
        set.add("New York");
        System.out.println("Total items: "+set.size());

        //System.out.println(set);
// Display the elements in the hash set
        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");
        }

// Process the elements using a forEach method
        System.out.println();
        set.forEach(e -> System.out.print(e.toLowerCase() + " "));
    }


    }

