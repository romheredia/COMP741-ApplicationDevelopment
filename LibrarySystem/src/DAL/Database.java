/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Member;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rom
 */
public class Database {

    private static final String DATABASE_NAME = "jdbc:mysql://localhost:3306/librarysystem?useSSL=false, root, 17018054c";

    public static void main(String[] args) {
        try {
//            // Get connection to the databas.
//            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarysystem?useSSL=false", "root", "17018054c");
//
//            // Create Statement 
//            Statement myStmnt = myConn.createStatement();
//
//            // Execute SQL Query
//            ResultSet myRs = myStmnt.executeQuery("SELECT * FROM member");
//
//            // Process the result set
//            while (myRs.next()) {
//                System.out.println(myRs.getString("first_name") + " " + myRs.getString("last_name") + " " + myRs.getString("email_address") + " " + myRs.getString("contact_number"));
//            }

        } catch (Exception ex) {
//            ex.printStackTrace();
        }
    }

    public Connection getConnection() throws Exception {

        try {
            Connection conn = DriverManager.getConnection("DATABASE_NAME");
            return conn;
        } catch (SQLException ex) {
            throw new Exception("Database Connection Error");
        }
    }

}
