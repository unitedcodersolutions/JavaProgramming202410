package com.unitedcoder.lambdastream;

public class EnumDemo3 {
    enum  City {VA_COLUMBIA,MD_COLUMBIA }

    public static void main(String[] args) {
        City[] cities=City.values();
        for(City city: cities)
        {
            System.out.println(city);
        }
    }
}
