package com.unitedcoder.interfacetutorial;

public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator myCalculator=new Calculator();
        System.out.println(Calculator.version);
        myCalculator.printMessage("This is example of interfaces");
        System.out.println("Add multiple numbers");
        System.out.println(myCalculator.addMultipleNumber(10,20,30,50,90,100,150,200));
        System.out.println("Add two numbers");
        System.out.println(myCalculator.addTwoNumbers(10.5,30.40));
        System.out.println("Divide two numbers");
        System.out.println(myCalculator.divideTwoNumbers(30,15));
        System.out.println("Subtract two numbers");
        System.out.println(myCalculator.subtractTwoNumbers(100,40));
        System.out.println("Multiply two numbers");
        System.out.println(myCalculator.multiplyTwoNumbers(100,50));
        System.out.println("Advanced calculator");
        System.out.println(myCalculator.calculatePower(10,4));
        System.out.println(myCalculator.calculateSquareRoot(36));
    }
}
