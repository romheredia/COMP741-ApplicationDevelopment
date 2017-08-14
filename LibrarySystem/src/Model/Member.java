/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Rom
 */
public class Member extends Person {
    private int memberId;
    private Date birthdate;

    public Member(int id, String firstName, String lastName, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, boolean activated) {
        super(id, firstName, lastName, emailAddress, contactNumber, address, suburb, city, postalCode, activated);
    }

    public Member(String firstName, String lastName, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, boolean activated) {
        super(firstName, lastName, emailAddress, contactNumber, address, suburb, city, postalCode, activated);
    }

    public Member(int id, String firstName, String lastName, String address, String suburb, String city, String postalCode, boolean activated) {
        super(id, firstName, lastName, address, suburb, city, postalCode, activated);
    }

    public Member(String firstName, String lastName, String address, String suburb, String city, String postalCode, boolean activated) {
        super(firstName, lastName, address, suburb, city, postalCode, activated);
    }

    public Member(int id, String firstName, String lastName, Date birthdate, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, boolean activated) {
        super(id, firstName, lastName, emailAddress, contactNumber, address, suburb, city, postalCode, activated);
        this.birthdate = birthdate;
    }

    public Member(String firstName, String lastName, Date birthdate, String emailAddress, String contactNumber, String address, String suburb, String city, String postalCode, boolean activated) {
        super(firstName, lastName, emailAddress, contactNumber, address, suburb, city, postalCode, activated);
        this.birthdate = birthdate;
    }

    public Member(int id, String firstName, String lastName, Date birthdate, String address, String suburb, String city, String postalCode, boolean activated) {
        super(id, firstName, lastName, address, suburb, city, postalCode, activated);
        this.birthdate = birthdate;
    }

    public Member(String firstName, String lastName, Date birthdate, String address, String suburb, String city, String postalCode, boolean activated) {
        super(firstName, lastName, address, suburb, city, postalCode, activated);
        this.birthdate = birthdate;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

}
