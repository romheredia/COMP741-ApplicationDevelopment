/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAL.MemberDAL;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rom
 */
public class Member extends Person {

    private int memberId;
    private String birthdate;

    public Member(int id, String firstName, String lastName, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, boolean activated) {
        super(id, firstName, lastName, emailAddress, contactNumber, address, suburb, city, postalCode, activated);
    }

    public Member(int id, String birthDate, String address, String suburb, String city, String postalCode, String fistName, String lastName, String emailAddress, String contactNumber) {
        super(address, suburb, city, postalCode, fistName, lastName, emailAddress, contactNumber);
        this.memberId = id;
        this.birthdate = birthDate;
    }

    public Member() {
        super();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public void Add() throws Exception {
        MemberDAL.addMember(this);
    }

    @Override
    public void Update() throws Exception {
        MemberDAL.updateMember(this);
    }

    @Override
    public void Deactivate(int id) throws Exception {
        MemberDAL.deactivateMember(id);
    }

    @Override
    public ArrayList<Person> Search() throws Exception {
        return MemberDAL.getAllMember();
    }

    @Override
    public ArrayList<Person> SearchByName(String name) throws Exception {
        return MemberDAL.getMemberByName(name);
    }
}
