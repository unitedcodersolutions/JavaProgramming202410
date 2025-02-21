package com.unitedcoder.project;
import java.util.Scanner;
public class CurrencyConverter {
      /*
    Creating a currency converter in Java can involve multiple aspects, such as user
    input handling, currency conversion logic, and print out the amount.
     */
      public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          //define input variables for currencies
          double USD=1.0; // Base Currency
          double EUR=0.94;double GBP=0.78;
          double JPY=150.00;double TRY=34.75;
          //print statements and prompt users
          System.out.println("Welcome to the Currency Converter");
          System.out.println("Available currency: USD, EUR, JPY, GBP, TRY");
          System.out.println("Enter Source Currency:");
          String sourceCurrency=scanner.next().toUpperCase().trim(); //Source Currency
          System.out.println("You entered source currency: "+sourceCurrency);
          System.out.println("Please Enter Target Currency:");
          String targetCurrency=scanner.next().toUpperCase().trim(); //Target Currency

          System.out.println("You entered target currency: "+targetCurrency);
          // check the validity of the source and target currency
          if((sourceCurrency.equals("USD") ||sourceCurrency.equals("GBP")||
            sourceCurrency.equals("TRY") || sourceCurrency.equals("JPY") ||
           sourceCurrency.equals("EUR")) &&
         (targetCurrency.equals("USD") || targetCurrency.equals("GBP") ||
           targetCurrency.equals("TRY")||targetCurrency.equals("JPY")||
                 targetCurrency.equals("EUR")))
          {
              System.out.println("Enter the amount to convert: ");
              double amount=scanner.nextDouble();
              //convert the amount
              double sourceToUSD=0;
              //do currency conversion

              if(!sourceCurrency.equals("USD"))
              {
                  if(sourceCurrency.equals("TRY")) sourceToUSD=amount/TRY;
                  else if(sourceCurrency.equals("EUR")) sourceToUSD=amount/EUR;
                  else if(sourceCurrency.equals("GBP")) sourceToUSD=amount/GBP;
                  else if (sourceCurrency.equals("JPY")) sourceToUSD=amount/JPY;
              }
              else
              {
                  sourceToUSD=amount*USD;
              }
              //use Target Currency for conversion
              double convertedAmount=0;
              if(targetCurrency.equals("USD"))
                  convertedAmount=sourceToUSD;
              else {
                 if(targetCurrency.equals("TRY"))  convertedAmount=sourceToUSD*TRY;
                 else if(targetCurrency.equals("EUR")) convertedAmount=sourceToUSD*EUR;
                 else if(targetCurrency.equals("GBP")) convertedAmount=sourceToUSD*GBP;
                 else if(targetCurrency.equals("JPY")) convertedAmount=sourceToUSD*JPY;
              }
              //print the converted amount
              System.out.printf("%.2f %s is %.2f %s \n",amount,sourceCurrency,convertedAmount,targetCurrency);
              scanner.close();
          }
          else
          {
              System.out.println("Please enter a valid source and target currency");
          }
      }
}
