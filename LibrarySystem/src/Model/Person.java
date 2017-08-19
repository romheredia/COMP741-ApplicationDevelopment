/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Rom
 */
public abstract class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String contactNumber;
    private String address;
    private String suburb;
    private String city;
    private String postalCode;
    private int activated;

    
    public Person(int id, String firstName, String lastName, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, int activated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.address = address;
        this.suburb = suburb;
        this.city = city;
        this.postalCode = postalCode;
        this.activated = activated;
    }
    
    public Person(int id, String address, String suburb, String city, String postalCode, String firstName, String lastName, String emailAddress, String contactNumber){
        this.id = id;
        this.address = address;
        this.suburb = suburb;
        this.city = city;
        this.postalCode = postalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
    }

    public Person(int id, String firstName, String lastName, String emailAddress, String contactNumber){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
    }
    
    public Person(){
        
    }

    public int getId() {
        return id;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int  getActivated() {
        return activated;
    }

    public void setActivated(int activated) {
        this.activated = activated;
    }
    
    public abstract  void Add() throws Exception;
    
    public abstract void Update() throws Exception;
    
    public abstract void Deactivate(int id) throws Exception;
    
    public abstract ArrayList<Person> Search() throws Exception;
    
    public abstract ArrayList<Person> SearchByName(String name) throws Exception;
}
