package com.unitedcoder.lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        //sample data
        List<String> names= Arrays.asList("Json","Mark","Michael","Christina","Ellie",
                "Tom","John","Miky","Julia","Sam");
        //use for each to print each name
        System.out.println("ForEach");
        //names.stream().forEach(System.out::println);
        names.stream().forEach(name-> System.out.print(name+ " "));
        //collect names starting with C
        List<String> namesStartingWithC=names.stream().filter(name->name.startsWith("M")).collect(Collectors.toList());
        System.out.println();
        System.out.println(namesStartingWithC);
        //total names
        long totalNames=names.stream().count();
        System.out.println("Total names: "+totalNames);
        //concatenate all names together
        String concatenatedNames=names.stream().reduce("",(patialString,element)->patialString+"|"+element);
        System.out.println("reduced names");
        System.out.println(concatenatedNames.trim());
        //find the first name in the list
        Optional<String> firstName=names.stream().findFirst();
        System.out.println(firstName);
        //all match: check if all names starts with 'S'
        boolean allStartsWithS=names.stream().allMatch(name->name.startsWith("S"));
        System.out.println("Starts with S: "+allStartsWithS);
        //do we have any names that starts with S
        boolean anyNameStartsWithS=names.stream().anyMatch(isim->isim.startsWith("S"));
        System.out.println("Any name starts with S"+anyNameStartsWithS);
        System.out.println(names.stream().filter(name->name.startsWith("S")).collect(Collectors.toList()));

    }
}
