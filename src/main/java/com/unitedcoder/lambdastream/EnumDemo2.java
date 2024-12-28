package com.unitedcoder.lambdastream;

public class EnumDemo2 {

    enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

    public static void main(String[] args) {
        for(Day day: Day.values())
        {
            System.out.println(day.name());
        }
        Day day1= Day.FRIDAY;
        Day day2=Day.THURSDAY;
        System.out.println("day1's name is "+ day1.name());
        System.out.println("day2's name is "+ day2.name());
        System.out.println("day1's ordinal "+day1.ordinal());
        System.out.println("day2's ordinal "+day2.ordinal());

        System.out.println(day1.equals(day2));

    }
}
