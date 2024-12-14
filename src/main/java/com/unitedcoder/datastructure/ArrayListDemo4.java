package com.unitedcoder.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4 {
    //we have list of boxes
    //we have list of apples in each box
    public static void main(String[] args) {
        List<List<Integer>> boxes= new ArrayList<>();
        boxes.add(Arrays.asList(1,2,3,4));
        boxes.add(Arrays.asList(4,5,6,7));
        System.out.println(boxes);

    }
}

