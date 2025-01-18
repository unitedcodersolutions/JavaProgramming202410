package com.unitedcoder.interfacetutorial;

public class Calculator implements ICalculator,IScienceCalculator{

    public double addTwoNumbers(double d1, double d2) {
        return d1+d2;
    }

    public int addMultipleNumber(int... numbers) {
        int sum=0;
        for(int n:numbers)
        {
            sum=sum+n;
        }
        return sum;
    }

    @Override
    public double multiplyTwoNumbers(double n1, double n2) {
        return n1*n2;
    }

    @Override
    public float divideTwoNumbers(double x, double y) {
        if(y==0)
        {
            System.out.println("The denominator cannot be zero");
            return 0;
        }
        else
        {
            float division=(float)(x/y);
            return division;
        }
    }

    @Override
    public long subtractTwoNumbers(long l1, long l2) {
        return l1-l2;
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public double calculatePower(double base, double power) {
        return Math.pow(base,power);
    }

    public double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

}
