/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.BaseDAL.getStatement;
import Model.Borrow;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author massami
 */
public class BorrowDAL extends BaseDAL{
    public static void addBorrow(Borrow borrow) throws Exception{ 
         String sql = "call addBorrow(?,?,?,?,?)";
        
        CallableStatement st = getStatement(sql);

        st.setString(1, borrow.getBorrowDate());
        st.setString(2, borrow.getDueDate());
        st.setString(3, borrow.getReturnDate());
        st.setInt(4, borrow.getMemberId());
        st.setInt(5, borrow.getCatalogueId());

        st.executeQuery();
    }
    
    
    public static int getMemberId(String name) throws Exception {
        String sql = "call searchMemberId(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, name);

        ResultSet rs = st.executeQuery();
        
        if(rs.next())
            return rs.getInt("member_id");
        else 
            return 0;
    }
}
