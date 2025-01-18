package com.unitedcoder.inheritancetutorial;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI; //area=pi*r*r;
    }
/** Return diameter */
        public double getDiameter() {
            return 2 * radius;
    }
    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    // Override the toString method defined in the superclass
    @Override
public String toString() {
         return super.toString() + "\nradius is " + radius;
        }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle)
            return radius == ((Circle)o).radius;
        else
            return false;
    }
}
