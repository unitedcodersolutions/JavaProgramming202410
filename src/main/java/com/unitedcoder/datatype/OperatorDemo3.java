package com.unitedcoder.datatype;

public class OperatorDemo3 {
    //relational operator  >, <. >=, <=, ==, !=
    //comparison operator
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        boolean result = a > b;
        System.out.println(result);
        int value1=10;
        int value2=9;
        int value3=9;
        System.out.println(value1==value2); //false
        System.out.println(value1!=value2); //true
        System.out.println(value1>value2); //true
        System.out.println(value1<value2); //false
        System.out.println(value2>=value3); //true
        System.out.println(value2<=value3); //true
        System.out.println(value1!=value2); //true
        System.out.println("Selenium"=="selenium");
        System.out.println("Selenium".equalsIgnoreCase("selenium"));

        //Logical Operator
        //Logical AND (&&) Logical OR (||)
        //result is true when && both conditions should be true
        int number1=5; int number2=10;
        boolean result1=(number1==5)&&(number2==10);
        System.out.println(String.format("Result=%b",result1));

        boolean result2=(number1==5) &&(number2==9);
        System.out.println(String.format("Result=%b",result2));

        boolean result3=(number1==5) ||(number2==15);
        System.out.println(String.format("Result=%b",result3));

        //boolean operator
        //boolean AND (&&)   boolean OR (||)
        boolean b1=true;
        boolean b2=true;
        boolean b3=false;
        boolean b4=false;
        System.out.println(b1&&b2);
        System.out.println(b1&&b3);
        System.out.println(b2||b3);
        System.out.println(b3||b4);

    }
    }



