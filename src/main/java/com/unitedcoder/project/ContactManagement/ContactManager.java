package com.unitedcoder.project.ContactManagement;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts;

    //initialize the contacts list in the constructor
    public ContactManager() {
        contacts = new ArrayList<>();
    }

    //adding a contact to the list
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // return contact list
    public List<Contact> getContacts() {
        return new ArrayList<>(contacts);
    }

    //search contact
    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    //delete a contact
    public boolean deleteContact(String name) {
        Contact contact = searchContact(name);
        if (contact != null) {
            contacts.remove(contact);
            return true;
        }
        return false;
    }

    //Write contacts to a file
    public void writeToFile(String filename, List<Contact> contacts) {
        StringBuilder stringBuilder = new StringBuilder();
        if (contacts.size() > 0) {
            for (Contact contact : contacts) {
                stringBuilder.append(contact.toString()).append("\n");
            }
            try {
                FileUtils.write(new File(filename), stringBuilder.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Please add at least one contact");
        }
    }
}
