package com.unitedcoder.project;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ReceiptGenerator {
    // design a java application to print out the receipt for multiple items
    public static void main(String[] args) throws IOException {
        Scanner shoppingCart=new Scanner(System.in);
        final String storeName="Taklimakan Market";
        String itemName;
        double itemPrice;
        double itemQuantity;
        double total=0;
        double totalItems=0;
        final double TAX=0.06; // In the U.S.A, most states have sales tax 6%
        System.out.println("------  Welcome to Taklimakan Market------- ");
        System.out.println("Today is "+LocalDateTime.now());
        StringBuilder receiptBuilder=new StringBuilder();
        receiptBuilder.append(" ------  Welcome to ").append(storeName).append("------- \n");
        receiptBuilder.append(LocalDateTime.now()).append("\n");
        receiptBuilder.append("Payment Method: Cash").append("\n");
        String symbol="--------";
        receiptBuilder.append("Item").append(symbol).append("Quantity").append(symbol).append("Price").
                append(symbol).append("Sub Total").append(symbol).append("\n");
        while(true)
        {
            System.out.println("Enter the item name (or 'done' to finish)");
            itemName=shoppingCart.next();
            if(itemName.equals("done"))
            {
                break;
            }
            System.out.println("Enter the price of " + itemName);
            itemPrice=shoppingCart.nextDouble();
            System.out.println("Enter the quantity of " + itemName);
            itemQuantity=shoppingCart.nextDouble();
            double subTotal=itemPrice*itemQuantity;
            totalItems=totalItems+itemQuantity;
            total=total+subTotal;
            receiptBuilder.append(itemName).append(symbol).append(itemQuantity).append(symbol).append(itemPrice)
                    .append(symbol).append(subTotal).append("\n");
        }
        double totalTax=total*TAX;
       double grandTotal=total+totalTax;
       receiptBuilder.append("-------------------------");
       receiptBuilder.append("Total Items: ").append(totalItems).append("\n");
       receiptBuilder.append("Total Tax: ").append(totalTax).append("\n");
       receiptBuilder.append("Final Amount").append(grandTotal).append("\n");
        System.out.println(receiptBuilder);
        FileUtils.write(new File("doc/receipt.txt"),receiptBuilder);
    }
}
