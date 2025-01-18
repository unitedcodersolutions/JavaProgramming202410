package com.unitedcoder.interfacetutorial;

public interface ICalculator {
    //just include method name without implementation
  public static final String version="1.0";
  double addTwoNumbers(double d1,double d2);  //method name, return type, arguments, no implementation
    int addMultipleNumber(int... numbers);
    double multiplyTwoNumbers(double n1, double n2);
    float divideTwoNumbers(double x, double y);
    long subtractTwoNumbers(long l1, long l2);
    void printMessage(String message);
}
