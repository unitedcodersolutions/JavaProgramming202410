package com.unitedcoder.methodtutorial;

public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String accountName;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double accountBalance, String accountName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }
    //print welcome statement
    public void welcomeMessage(String message)
    {
        System.out.println(message);
    }
    //deposit money
    public double depositMoney(double depositAmount)
    {
        accountBalance=accountBalance+depositAmount;
        System.out.println("Your balance is "+accountBalance);
        return accountBalance;
    }
    //withdraw money
    public double withdrawMoney(double withdrawAmount)
    {
        if(withdrawAmount>accountBalance)
        {
            System.out.println("You do not have enough money");
            System.out.println("Your balance is "+accountBalance);
            System.out.println("Please enter a smaller amount to withdraw");
            return accountBalance;
        }
        else {
           double finalBalance=accountBalance-withdrawAmount;
            System.out.println("Your final balance is "+finalBalance);
            return finalBalance;
        }
    }
    //check balance
    public  void checkAccountBalance()
    {
        System.out.println("Your balance is "+accountBalance);
    }
    //transfer money
    public  void transferMoney(int receiveAccountNumber,double receiverBalance,double transferAmount)
    {
        if(transferAmount<accountBalance)
        {
            double finalBalance=receiverBalance+transferAmount;
            System.out.println("Receiver original balance is "+receiverBalance);
            System.out.println("Receiver final balance is "+finalBalance);
            double senderBalance=accountBalance-transferAmount;
            System.out.println("Sender balance is "+senderBalance);
        }
        else
        {
            System.out.println("We cannot perform the transfer because you do not have enough money");
            System.out.println("Your account balance is "+accountBalance);
            System.out.println("You wanted to transfer amount: "+transferAmount);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
