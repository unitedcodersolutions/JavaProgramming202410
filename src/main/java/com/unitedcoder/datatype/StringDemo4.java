package com.unitedcoder.datatype;

import org.apache.commons.lang3.StringUtils;

public class StringDemo4 {
    public static void main(String[] args) {
        String name="Dolkun Tarim";
        System.out.println(StringUtils.reverse(name));
        String s1="How are you doing? is learning java fun?";
        System.out.println(StringUtils.abbreviate(s1,5));
        String a="Hello";
        String b="Hello";
        System.out.println(StringUtils.compare(a,b));

        String myString="kfjdkfjeorueojdlfjdlkafjladfjldsfjdklfjeldfjsldafjdlfjd;safjads";
        System.out.println(StringUtils.countMatches(myString,"a"));
        System.out.println(StringUtils.rotate(a,4));
        System.out.println(StringUtils.getCommonPrefix("Dolkun Tarim","Dolkun Tursun","Dolkun Dolkun"));
    }
}
