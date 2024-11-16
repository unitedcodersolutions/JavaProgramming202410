package com.unitedcoder.decision;
import java.util.Scanner;
public class ATMDemo2 {
    public static void main(String[] args) {
      String  bankName="Test Bank";
      String  accountName = "John Smith";
       int accountPin=1122;
       long cardNumber=1122334455667788L;
        double accountBalance=1050.50;
        System.out.print("Please enter your pin ");
        Scanner input=new Scanner(System.in);
        int pin=input.nextInt();
        if(pin==accountPin)
        {
            System.out.println(String.format("Welcome %s to %s \nYour account balance is %.2f",
                    accountName, bankName,accountBalance));
            System.out.println(String.format("Your card number is %d",cardNumber));
            System.out.println("Please enter the amount to withdraw");
            double withdrawAmount=input.nextDouble();
            //if you have enough fund to withdraw
            if(withdrawAmount<accountBalance)
            {
                System.out.println("You withdraw "+withdrawAmount);
                accountBalance=accountBalance-withdrawAmount;
                System.out.println("Your account balance is "+accountBalance);
            }
            else {
                System.out.println("Sorry, you do not have enough money");
                System.out.println("please try again with a smaller amount");
            }
        }
        else {
            System.out.println("Please try with a correct pin");
        }
    }
}
