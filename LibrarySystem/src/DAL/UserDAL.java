/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Person;
import Model.User;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author massami
 */
public class UserDAL extends BaseDAL {

    public static void addUser(User user) throws Exception {
        String sql = "call sp_addUser(?,?,?,?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, user.getFirstName());
        st.setString(2, user.getLastName());
        st.setString(3, user.getEmailAddress());
        st.setString(4, user.getContactNumber());
        st.setString(5, user.getUsername());
        st.setString(6, user.getPassword());

        st.executeQuery();
    }

    public static void updateUser(User user) throws Exception {
        String sql = "call sp_updateUser(?,?,?,?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, user.getId());
        st.setString(2, user.getFirstName());
        st.setString(3, user.getLastName());
        st.setString(4, user.getEmailAddress());
        st.setString(5, user.getContactNumber());
        st.setString(6, user.getUsername());

        st.executeQuery();
    }

    public static ArrayList<Person> getAllUser() throws Exception {
        ArrayList<Person> personList = new ArrayList();

        String sql = "call sp_searchUser()";

        ResultSet rs = getStatement(sql).executeQuery();

        while (rs.next()) {
            User user = new User(rs.getString("username"), rs.getInt("person_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email_address"), rs.getString("contact_number"));
            personList.add(user);
        }

        return personList;
    }

    public static ArrayList<Person> getUserByName(String name) throws Exception {
        ArrayList<Person> personList = new ArrayList();

        String sql = "call sp_searchUserByName(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, name);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            User user = new User(rs.getString("username"), rs.getInt("person_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email_address"), rs.getString("contact_number"));
            personList.add(user);
        }

        return personList;
    }

    public static void deactivateUser(int id) throws Exception {
        String sql = "call sp_deactivateUser(?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, id);

        st.executeQuery();
    }

    public static void updatePassword(String username, String password, String newPassword) throws Exception {
        String sql = "call sp_updatePassword(?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, username);
        st.setString(2, password);
        st.setString(3, newPassword);

        st.executeQuery();
    }

    public static ArrayList<Person> checkPassword(String username, String password) throws Exception {
        ArrayList<Person> personList = new ArrayList();

        String sql = "call sp_checkPassword(?,?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, username);
        st.setString(2, password);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            User user = new User(rs.getString("username"));
            personList.add(user);
        }

        return personList;
    }

    public static void resetPassword(int id) throws Exception {
        String sql = "call sp_resetPassword(?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, id);

        st.executeQuery();
    }
}
