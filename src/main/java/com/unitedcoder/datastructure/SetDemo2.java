package com.unitedcoder.datastructure;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        // Create a Lined hashSet
        //Set data structure does not allow duplicates
        //LinkedHashSet keep the order of the data
        Set<String> cities = new LinkedHashSet<>();
// Add strings to the cities
        cities.add("London");
        cities.add("Istanbul");
        cities.add("Paris");
        cities.add("Amsterdam");
        cities.add("New York");
        cities.add("San Francisco");
        cities.add("Tokyo");
        System.out.println("Total items: "+cities.size());
        //System.out.println(cities);
// Display the elements in the hash cities
        for (String s : cities) {
            System.out.print(s.toUpperCase() + " ");
        }

// Process the elements using a forEach method
        System.out.println();
        cities.forEach(e -> System.out.print(e.toLowerCase() + " "));
    }


    }

