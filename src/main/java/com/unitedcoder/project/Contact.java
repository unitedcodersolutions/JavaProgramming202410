package com.unitedcoder.project;

import java.util.List;
import java.util.stream.Collectors;

public class Contact {
    //model of the object
    private int contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String note;
    //generate constructors

    public Contact() {
    }

    public Contact(int contactId, String firstName, String lastName, String phoneNumber, String city, String state, String country, String postalCode, String note) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.note = note;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    //add a new contact
    public List<Contact> addContact(List<Contact> contactList, Contact contact)
    {
       contactList.add(contact);
       return contactList;
    }
    public List<Contact> deleteContact(List<Contact> contactList,int contactId)
    {
    List<Contact> afterRemoveList=contactList.stream().filter(contact ->
            contact.getContactId()!=contactId).collect(Collectors.toUnmodifiableList());
        return  afterRemoveList;
    }
    //search a contact
    public List<Contact> searchContact(List<Contact> contactList,Contact contact)
    {
     List<Contact> searchResultList=   contactList.stream().filter(contact1 -> contact1.getContactId()==contact.getContactId()).collect(Collectors.toUnmodifiableList());
    return  searchResultList;
    }

    //toString

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
