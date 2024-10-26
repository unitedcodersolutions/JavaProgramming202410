package com.unitedcoder.datatype;

public class StringDemo1 {
    public static void main(String[] args) {
        //city is a variable
        //String is a type
        //Common data type: String, int, short, long, double, float, boolean, char, decimal
        String city;  //define a variable
        city="Columbia";
        //String is a data type, state is a variable, = is an assignment, Maryland is a  value
        String state="Maryland";
        int zipCode=21046;
        String country="USA";
        String street="Route 108, Suite 219";
        //
        String fullAddress=street+" "+city+" "+state+" "+zipCode + " "+country;
        //System.out.println(street + " "+city+ " "+ state+ " "+ zipCode+ " "+country);
        //+ is string join or concatenation
        System.out.println(fullAddress);
        String firstName, lastName;
        firstName="Dolkun"; lastName="Tarim" ;
        System.out.println(firstName+" "+lastName);
    }
}
