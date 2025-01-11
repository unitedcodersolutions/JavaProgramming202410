package com.unitedcoder.methodtutorial;

public class ATMDemo {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount(123456789,5000,"Jack Smith");
        myAccount.welcomeMessage("Welcome to Bank of America");
        myAccount.depositMoney(1000);
        System.out.println(myAccount.toString());
        myAccount.withdrawMoney(7000);
        BankAccount receiverAccount=new BankAccount(456789,1000,"Jack Junior");
        myAccount.transferMoney(receiverAccount.getAccountNumber(),1000,500);
    }
}
