package com.unitedcoder.lambdastream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaComparatorDemo {
    public static void main(String[] args) {
        Comparator<String> comparator=(s1, s2)->s1.length()-s2.length();
        List<String> list= Arrays.asList("abc","z","abcde","ab");
        Collections.sort(list,comparator);
        list.forEach(s-> System.out.println(s));
    }
}
