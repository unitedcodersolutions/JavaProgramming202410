package com.unitedcoder.project;

import java.util.Scanner;

public class RockPaperScissorsGame {
    //You design a game for Rock Paper and Scissors
    //Player 1 is your computer, Player 2 is you
    // Computer says paper, you say scissor, you won
    //Computer says paper, you say paper, it is a tie
    //Computer says scissor, you say paper, computer win
    public static void main(String[] args) {
        Scanner player1 = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        int totalGames=0;
        int totalWins=0;
        int totalLose=0;
        while (true) {
            int computerChoice = (int) (Math.random() * 3); //this will return 0, or 1 or 2
            System.out.println("Enter rock, paper or scissors (or 'quit' to stop the game)");
            String userChoice = player1.next().toLowerCase();
            if (userChoice.equals("quit")) break;
            System.out.println("Computer chose " + options[computerChoice]);
            //compare the choice between the computer and you

            if (userChoice.equals(options[computerChoice])) {
                System.out.println("It is a tie");
            } else if (
                    (userChoice.equals("rock") && options[computerChoice].equals("scissors"))
                            || (userChoice.equals("scissors") && options[computerChoice].equals("paper"))
                            || (userChoice.equals("paper") && options[computerChoice].equals("rock"))) {
                System.out.println("You Win");
            } else {
                System.out.println("You lose, computer wins");
            }
            totalGames++;
        }
        System.out.println("Total games: "+totalGames);
    }
}
