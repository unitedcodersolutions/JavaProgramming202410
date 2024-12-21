package com.unitedcoder.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        //first in, first out
        //maintain the order
        Queue<String> cities=new LinkedList<>();
        cities.offer("Istanbul");
        cities.offer("Tokyo");
        cities.offer("Washington DC");
        cities.offer("New York");
        while (cities.size()>0)
        {
            System.out.print(cities.remove()+"          ");
        }

    }
}
