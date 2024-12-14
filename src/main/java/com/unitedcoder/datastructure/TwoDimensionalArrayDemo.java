package com.unitedcoder.datastructure;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        //row A seat 1,2,3,4,5
        //row B seat 1,2,3,4,5
        //roc C seat 1,2,3,4,5
        String[][] seats=new String[][]{    //[][] two dimensional array
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        int totalRows= seats.length; //array Length
        System.out.println("Total rows: "+totalRows);
        int totalSeats=seats[1].length;
        for(int row=0;row<totalRows;row++)
        {
            for(int seat=0;seat<totalSeats;seat++)
            {
                System.out.println(String.format("row %d seat %d seatNumber %s",row+1,seat+1,seats[row][seat]));
            }
        }
    }
}
