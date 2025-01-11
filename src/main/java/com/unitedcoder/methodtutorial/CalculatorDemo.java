package com.unitedcoder.methodtutorial;

public class CalculatorDemo {
    public static void main(String[] args) {
      Calculator calc1=new Calculator("Simple Calculator","1.0","Standard");
        System.out.println(String.format("%s  %s  %s",calc1.getType(),calc1.getVersion(), calc1.getSize()));
        System.out.println(calc1.addNumbers(100,200));
        System.out.println(calc1.addNumbers(50.50,60.10));
        System.out.println(calc1.addNumbers(100,1234567890L));
        System.out.println(calc1.addNumbers(100,200,250,300,500,450,500,900,1000,1200,1300,1500,10000));
        Calculator calc2=new Calculator("Scientific Calculator","2.0","Standard");
        calc2.circleArea(10);
        calc2.printCalculatorType();
        //call static method
        Calculator.calculateRectangleArea(10,20);
        Calculator.calculateTriangleArea(15,8);

    }
}
