package com.unitedcoder.project;

import java.util.Scanner;

public class MovieTicketSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] seats = new String[10][10];
        //define the seat
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                char row = (char) ('A' + i);
                int col = j + 1;
                seats[i][j] = row + Integer.toString(col);
            }
        }
        int time = 0;
        while (time < 10) {
            System.out.println("What would you like to do? buy, quit, check");
            //System.out.println("buy ticket (buy)");
            //System.out.println("quit the system (quit)");
            //System.out.println("check empty seats (check)");
            String choose = input.next();
            if (choose.equalsIgnoreCase("quit")) {
                break;
            }
            if (choose.equalsIgnoreCase("buy")) {
                System.out.println("Please enter your seat label:");
                int seatLabel = input.nextInt() - 1;
                System.out.println("Please enter your seat number:");
                int seatNumber = input.nextInt() - 1;
                if (seatLabel <= 9 && seatNumber <= 9) {
                    if (seats[seatLabel][seatNumber].equals("soled")) {
                        System.out.println("this seat have already soled");
                    } else {
                        System.out.println("your bought  " + seats[seatLabel][seatNumber]);
                        seats[seatLabel][seatNumber] = "sold";
                    }
                } else {
                    System.out.println("Please enter correct number");
                }
                System.out.println();
            }
            else if (choose.equalsIgnoreCase("check")) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (seats[i][j].equals("soled")) {
                            continue;
                        } else {
                            System.out.print(seats[i][j] + ", ");
                        }
                    }
                    System.out.println();
                }
            }
            else {
               // System.out.println("Please enter correctly");
                System.out.println();
            }
            time++;
        }
    }
}

