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
public class UserDAL extends BaseDAL{

    public static void addUser(User user) throws Exception {
        String sql = "call addUser(?,?,?,?,?,?)";

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
        String sql = "call updateUser(?,?,?,?,?,?,?,?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, user.getId());
        st.setString(2, user.getFirstName());
        st.setString(3, user.getLastName());
        st.setString(4, user.getEmailAddress());
        st.setString(5, user.getContactNumber());
        st.setString(6, user.getUsername());
        st.setString(7, user.getPassword());

        st.executeQuery();
    }

    public static ArrayList<Person> getAllUser() throws Exception {
        ArrayList<Person> personList = new ArrayList();

        String sql = "call searchUser()";

        ResultSet rs = getStatement(sql).executeQuery();

        while (rs.next()) {
            User user = new User(rs.getString("username"),  rs.getInt("user_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email_address"), rs.getString("contact_number"));
            personList.add(user);
        }

        return personList;
    }

    public static ArrayList<Person> getUserByName(String name) throws Exception {
        ArrayList<Person> personList = new ArrayList();

        String sql = "call searchUserByName(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, name);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            User user = new User(rs.getString("username"),  rs.getInt("user_id"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("email_address"), rs.getString("contact_number"));
            personList.add(user);
        }

        return personList;
    }

    public static void deactivateUser(int id) throws Exception {
        String sql = "call deactivateUser(?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, id);

        st.executeQuery();
    }
}
