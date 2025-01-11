package com.unitedcoder.methodtutorial;

public class Calculator {
    //defining instance variables
    private String type;
    private String version;
    private String size;
    //define constructor and generate getter and setter
    public Calculator(){

    }
    public Calculator(String type, String version, String size) {
        this.type = type;
        this.version = version;
        this.size = size;
    }
    //define getters

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public String getSize() {
        return size;
    }
    //design method
    public int addNumbers(int number1,int number2)
    {
        int sum=number1+number2;
        return sum;
    }
    //overload method and add two double numbers
    public double addNumbers(double d1,double d2)
    {
        return d1+d2;
    }
    public long addNumbers(int number1,long number2)
    {
        return number1+number2;
    }
    //add multiple numbers
    public long addNumbers(long... numbers)
    {
        long total=0;
        for(long eachNumber :numbers)
        {
            total=total+eachNumber;
        }
        return total;
    }
    //method to calculate an area of a circle
    public  double circleArea(double radius)
    {
        System.out.println(String.format("Area of a circle with radius=%.2f is %.2f",radius,Math.PI*radius*radius));
        return Math.PI*radius*radius;
    }
    //subtract numbers
    public int subtractNumbers(int a, int b)
    {
        System.out.println(String.format("%d-%d=%d",a,b,a-b));
        return  a-b;
    }
    //divide two numbers
    public double divideNumbers(double numerator,double denominator)
    {
        if(denominator==0)
        {
            System.out.println("You cannot divide a number by 0");
            return 0;
        }
        else
        {
            double result=numerator/denominator;
            System.out.println(String.format("%.2f / %.2f = %.2f",numerator,denominator,result));
            return result;
        }
    }
    //multiplication
    public double multiplyNumbers(double x1,double x2)
    {
        System.out.println(String.format("%d*%d=%d",x1,x2,x1*x2));
        return x1*x2;
    }
    //void method
    public void printCalculatorType()
    {
        System.out.println(getType());
    }
    //define a static method
    public static long calculateRectangleArea(long width, long height)
    {
        long area=width*height;
        System.out.println(String.format("The area of a rectangle width=%d heigh=%d is %d",width,height,area));
        return area;
    }
    public static float calculateTriangleArea(double base, double height)
    {
        float area=(float)(base*height)/2;
        System.out.println(String.format("Triangle base is %.2f and height is %.2f area is %.2f",base,height,area));
        return area;

    }

    @Override
    public String toString() {
        return "Calculator{" +
                "type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
