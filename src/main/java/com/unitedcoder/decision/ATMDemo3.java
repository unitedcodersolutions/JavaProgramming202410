package com.unitedcoder.decision;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ATMDemo3 {
    public static void main(String[] args) throws IOException {
      String  bankName="Test Bank";
      String  accountName = "John Smith";
      String password= FileUtils.readFileToString(new File("doc/pin.txt"));
       long cardNumber=1122334455667788L;
        double accountBalance=1050.50;
        System.out.print("Please enter your pin ");
        Scanner input=new Scanner(System.in);
        int pin=input.nextInt();
        if(pin==Integer.parseInt(password))  //conver password string to int
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
                System.out.println("Please take your cash from the cash dispenser");
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
