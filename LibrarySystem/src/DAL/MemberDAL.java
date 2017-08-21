/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Member;
import Model.Person;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rom
 */
public class MemberDAL extends BaseDAL {

    public static void addMember(Member member) throws Exception {
        String sql = "call sp_addMember(?,?,?,?,?,?,?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, member.getFirstName());
        st.setString(2, member.getLastName());
        st.setString(3, member.getEmailAddress());
        st.setString(4, member.getContactNumber());
        st.setString(5, member.getBirthdate());
        st.setString(6, member.getAddress());
        st.setString(7, member.getSuburb());
        st.setString(8, member.getCity());
        st.setString(9, member.getPostalCode());

        st.executeQuery();
    }

    public static void updateMember(Member member) throws Exception {
        String sql = "call sp_updateMember(?,?,?,?,?,?,?,?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, member.getId());
        st.setString(2, member.getFirstName());
        st.setString(3, member.getLastName());
        st.setString(4, member.getEmailAddress());
        st.setString(5, member.getContactNumber());
        st.setString(6, member.getBirthdate());
        st.setString(7, member.getAddress());
        st.setString(8, member.getSuburb());
        st.setString(9, member.getCity());
        st.setString(10, member.getPostalCode());

        st.executeQuery();
    }

    public static ArrayList<Person> getAllMember() throws Exception {
        ArrayList<Person> personList = new ArrayList();

        String sql = "call sp_searchMember()";

        ResultSet rs = getStatement(sql).executeQuery();

        while (rs.next()) {
            Member member = new Member(rs.getInt("person_id"), rs.getString("birthdate"), rs.getString("address"), rs.getString("suburb"), rs.getString("city"), rs.getString("postal_code"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email_address"), rs.getString("contact_number"));
            personList.add(member);
        }

        return personList;
    }

    public static ArrayList<Person> getMemberByName(String name) throws Exception {
        ArrayList<Person> personList = new ArrayList();

        String sql = "call sp_searchMemberByName(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, name);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Member member = new Member(rs.getInt("person_id"), rs.getString("birthdate"), rs.getString("address"), rs.getString("suburb"), rs.getString("city"), rs.getString("postal_code"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email_address"), rs.getString("contact_number"));
            personList.add(member);
        }

        return personList;
    }

    public static void deactivateMember(int id) throws Exception {
        String sql = "call sp_deactivateMember(?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, id);

        st.executeQuery();
    }

    public static ArrayList<String> getAllMemberName() throws Exception {
        ArrayList<String> personList = new ArrayList();

        String sql = "call sp_searchPerson()";

        CallableStatement st = getStatement(sql);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            personList.add(rs.getString("name"));
        }

        return personList;
    }

}
