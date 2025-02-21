package com.unitedcoder.homework.week5;

import java.util.Scanner;

public class BudgetPlanner {
    /*
    *Project Requirement : Personal Budget Planner**
- **Description**: Develop a command-line application to help users plan and track their personal budget.

- **Features**:

- Prompt users to input their total monthly income using the `Scanner` class.

- Allow users to enter multiple monthly expenses with descriptions, such as groceries, rent, utilities, and entertainment.

- Calculate the remaining balance after expenses and provide feedback on whether the user is over or under budget.

- Display a summary of all expenses along with the total expenditure and final balance.

**Example Usage**:

Enter your total monthly income: 3000

Enter your expense description (or 'done' to finish): Rent

Enter the amount for Rent: 900

Enter your expense description (or 'done' to finish): Groceries

Enter the amount for Groceries: 300

Remaining balance for the month: 1800
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your total monthly income: ");
        int income=input.nextInt();
        System.out.println("Enter your expense description: ");
        String expenseType=input.next();
        System.out.println("Enter the amount for Rent: ");
        int rent=input.nextInt();
        System.out.println("Enter your expense description: ");
        String expenseDesc=input.next();
        System.out.println("Enter the amount for Groceries: ");
        int groceries=input.nextInt();
        int balance=income-rent-groceries;

        System.out.println("Remaining balance for the month "+balance);
    }
}
