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
public class User extends Person {

    private int id;
    private String username;
    private String password;

    public User(String username, String password, int id, String firstName, String lastName, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, boolean activated) {
        super(id, firstName, lastName, emailAddress, contactNumber, address, suburb, city, postalCode, activated);
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String address, String suburb, String city, String postalCode, String firstName, String lastName, String emailAddress, String contactNumber) {
        super(address, suburb, city, postalCode, firstName, lastName, emailAddress, contactNumber);
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, int id, String firstName, String lastName, String emailAddress, String contactNumber) {
        super(firstName, lastName, emailAddress, contactNumber);
        this.id = id;
        this.username = username;
    }

    public User(){
        
    }
    
    public int getId(){
        return id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void Add() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Deactivate(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Person> Search() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Person> SearchByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
