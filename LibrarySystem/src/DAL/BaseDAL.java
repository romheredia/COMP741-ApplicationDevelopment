/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author massami
 */
public class BaseDAL {
    private static final String DATABASE_NAME = "jdbc:mysql://localhost:3306/librarysystem_db?useSSL=false, root, root";
    static Connection con;
    
    public static Connection getConnection() throws Exception {
        try {
            if (con == null) {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarysystem_db", "root", "root");
            }
            
            return con;
        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
    }
    
    public static CallableStatement getStatement(String sql) throws Exception{
        Connection con = getConnection();
        
        return con.prepareCall(sql);
    }
}
