package com.unitedcoder.classtutorial;

public class ImmutableClassApplication {
    public static void main(String[] args) {
        ImmutableClassDemo immutableClassDemo=new ImmutableClassDemo(1234,"Jason");
        System.out.println(immutableClassDemo.getId());
        System.out.println(immutableClassDemo.getDateCreated());
        System.out.println(immutableClassDemo.getName());
    }
}
