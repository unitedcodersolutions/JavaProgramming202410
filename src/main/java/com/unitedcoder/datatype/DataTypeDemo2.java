package com.unitedcoder.datatype;

public class DataTypeDemo2 {
    public static void main(String[] args) {
        //char
        char c='A';
        System.out.println(c);
        int i=c;
        System.out.println(i);
        System.out.println(" ".length());
        char c1=' ';
        int i1=c1;
        System.out.println(i1);
        System.out.println(100+100);//200
        System.out.println("100"+100);//100100
        System.out.println(c+"B");
        System.out.println(c+10);

        //Practice
        char a1='C';
        char a2='6';
        String s1="World";
        String s2="200";
        int i3=300;
        System.out.println(a1+s2);//C200
        System.out.println(a2+s2);//6200
        System.out.println(a1+i3);//367
        System.out.println(s1+a1);//WorldC
        System.out.println(i3+(a1+i3));//667

        //boolean
        boolean b1=true;
        boolean b2=false;
        System.out.println(String.format("He got full score in the exam, that is %b",b1));
    }
}
