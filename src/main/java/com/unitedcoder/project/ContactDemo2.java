package com.unitedcoder.project;

import java.util.ArrayList;
import java.util.List;

public class ContactDemo2 {
    public static void main(String[] args) {
        List<Contact> myContactList=new ArrayList<>();
        myContactList.add(new Contact(1,"Json","Smith","1234",
                "WashingtondC",
                "WashingtonDC","USA","123456","TestUser"));
        Contact contact=new Contact();
        contact.addContact(myContactList,new Contact(2,"Jack","Smith",
                "334455","NewYork","NewYork","USA","123454","TestUser"));
        contact.addContact(myContactList,new Contact(3,"aaa","bbb",
                "334455","NewYork","NewYork","USA","123454","TestUser"));
        contact.addContact(myContactList,new Contact(4,"ccc","cccc",
                "334455","NewYork","NewYork","USA","123454","TestUser"));
        myContactList.stream().forEach(contact1 -> System.out.println(contact1.toString()));
        List<Contact> afterDeletingList= contact.deleteContact(myContactList,2);
        System.out.println("Contact list after removing");
        afterDeletingList.stream().forEach(contact1 -> System.out.println(contact1.toString()));
    }
}
