/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAL.UserDAL;
import java.util.ArrayList;

/**
 *
 * @author Rom
 */
public class User extends Person {

    private String username;
    private String password;

    public User(String username, String password, int id, String firstName, String lastName, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, int activated) {
        super(id, firstName, lastName, emailAddress, contactNumber, address, suburb, city, postalCode, activated);
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password, String address, String suburb, String city, String postalCode, String firstName, String lastName, String emailAddress, String contactNumber) {
        super(id, address, suburb, city, postalCode, firstName, lastName, emailAddress, contactNumber);
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, int id, String firstName, String lastName, String emailAddress, String contactNumber) {
        super(id, firstName, lastName, emailAddress, contactNumber);
        this.username = username;
    }

    public User(String username){
        this.username = username;
    }
    
    public User() {

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
        UserDAL.addUser(this);
    }

    @Override
    public void Update() throws Exception {
        UserDAL.updateUser(this);
    }

    @Override
    public void Deactivate(int id) throws Exception {
        UserDAL.deactivateUser(id);
    }

    @Override
    public ArrayList<Person> Search() throws Exception {
        return UserDAL.getAllUser();
    }

    @Override
    public ArrayList<Person> SearchByName(String name) throws Exception {
        return UserDAL.getUserByName(name);
    }

    public void UpdatePassword(String username, String password, String newPassword) throws Exception{
        UserDAL.updatePassword(username, password, newPassword);
    }
    
    public ArrayList<Person> CheckPassword(String username ,String password) throws Exception{
        return UserDAL.checkPassword(username, password);
    }
    
    public void ResetPassword(int id)throws Exception{
        UserDAL.resetPassword(id);
    }
}
