package com.unitedcoder;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,3,5,6,7};
        try {
            System.out.println(numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Continue");
        }
        try {
            System.out.println(1/0);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        System.out.println("Hello World");
    }
}
