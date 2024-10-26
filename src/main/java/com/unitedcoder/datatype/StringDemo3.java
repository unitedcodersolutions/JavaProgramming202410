package com.unitedcoder.datatype;

import java.util.Locale;

public class StringDemo3 {
    public static void main(String[] args) {
        //common string operations
        //upper case, lowercase, substring, indexOf
        String city="Columbia";
        String state="Maryland";
        String zipCode="21046";
        //print all strings in upper case
        System.out.println(city.toUpperCase());
        System.out.println(state.toUpperCase());
        System.out.println(zipCode.toUpperCase());
        //print city and state in lower case
        System.out.println(city.toLowerCase());
        System.out.println(state.toLowerCase(Locale.ENGLISH));
        System.out.println(state.toLowerCase());
        // get the length of a string
        System.out.println(city.length());
        System.out.println(state.length());
        System.out.println(zipCode.length());
        String s1="United Coder Professional Engineering School";
        System.out.println(s1.length());
        String s2="Selenium Master LLC";
        System.out.println(s2.length());
        //how to join string +, concat
        System.out.println(city+" "+state);
        System.out.println(city.concat(state));
        System.out.println(city.concat(" ").concat(state));
        System.out.println("My".concat(" ").concat("name").concat(" ").concat(" is Dolkun"));
        System.out.println("My"+" "+"name"+" "+ "is "+"Dolkun");

        // search in a string
        //Your creative is a limit
        String s3="Java Test Automation Framework Designing";
        System.out.println(s3.indexOf("T"));
        //In java, any index start with zero
        System.out.println(s3.indexOf("J"));
        System.out.println(s3.indexOf("Framework"));
        //what if the string does not exist
        System.out.println(s3.indexOf("z"));
        System.out.println(s3.lastIndexOf("a"));
       //contain method
        System.out.println(s3.contains("Dolkun")); //if not contains, return false
        System.out.println(s3.contains("automation"));
        System.out.println(s3.contains("Automation"));
        // substring
        String myFramework=s3.substring(21);
        System.out.println(myFramework);
        //another example
        String companyAddress="8950 State Route 108, Suite 219, Columbia, MD, 21046";
        System.out.println( companyAddress.substring(companyAddress.lastIndexOf("Columbia")));


    }
}
