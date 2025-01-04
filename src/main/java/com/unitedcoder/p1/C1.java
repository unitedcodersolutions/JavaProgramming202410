package com.unitedcoder.p1;

public class C1 {
    public static String VERSION="1.0";
    public  int x;   //public modifier
    protected  int y; //protected modifier
    int z;  //no modifier
    private  int u;

    protected  void m()
    {

    }

    @Override
    public String toString() {
        return "C1{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", u=" + u +
                '}';
    }
}
