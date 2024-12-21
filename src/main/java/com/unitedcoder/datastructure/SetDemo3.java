package com.unitedcoder.datastructure;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
// Create a hash set
        Set<String> set = new HashSet<>();
// Add strings to the set
        set.add("50,Mike");
        set.add("55,Alice");
        set.add("78,Maria");
        set.add("95,Michael");
        set.add("86,Alexander");
        set.add("79,Tony");
        set.add("60,Olivia");
        set.add("65,Brian");
        set.add("98,Aryan");
        set.add("75,Thomas");
        set. add("72,Sharma");
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted tree set: " + treeSet);

// Use the methods in SortedSet interface
        System.out.println("first(): " + treeSet.first());
        System.out.println("last(): " + treeSet.last());

// Use the methods in NavigableSet interface
        System.out.println("pollFirst(): " + treeSet.pollFirst());
        System.out.println("pollLast(): " + treeSet.pollLast());
        System.out.println("New tree set: " + treeSet);
    }
    }

