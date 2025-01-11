package com.unitedcoder.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManagementApplication {

    public static void main(String[] args) {

        List<Contact> contactList=new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter q to quit; add to add contact");
        if (input.next().equals("q")) {
            System.exit(0);
        }
        else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Please enter firstname? ");
                String firstName = input.next();
                System.out.println("Please enter lastname? ");
                String lastName = input.next();
                System.out.println("Please enter phoneNumber? ");
                String phoneNumber = input.next();
                System.out.println("Please enter city? ");
                String city = input.next();
                System.out.println("Please enter state? ");
                String state = input.next();
                System.out.println("Please enter Country? ");
                String country = input.next();
                System.out.println("Please enter postalCode? ");
                String postalCode = input.next();
                System.out.println("Please enter note? ");
                String note = input.next();
           contactList.add(new Contact(i,firstName,lastName,phoneNumber,city,state,country,postalCode,note))   ;
            }
            //search a contact
            System.out.println("do you want to search a contact, total contacts are: "+contactList.size());
            System.out.println("Please enter a contact Id");
            int searchId=input.nextInt();
            contactList.stream().filter(contact -> contact.getContactId()==searchId).
                    forEach(contact -> System.out.println(contact.toString()));
            //print contacts
            contactList.forEach(contact -> System.out.println(contact.toString()));

        }
    }

}
