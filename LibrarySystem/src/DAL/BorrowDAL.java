/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.BaseDAL.getStatement;
import Model.Book;
import Model.Borrow;
import Model.Catalogue;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author massami
 */
public class BorrowDAL extends BaseDAL{
    public static void addBorrow(Borrow borrow) throws Exception{ 
         String sql = "call sp_addBorrow(?,?,?,?,?)";
        
        CallableStatement st = getStatement(sql);

        st.setString(1, borrow.getBorrowDate());
        st.setString(2, borrow.getDueDate());
        st.setString(3, borrow.getReturnDate());
        st.setInt(4, borrow.getMemberId());
        st.setInt(5, borrow.getCatalogueId());

        st.executeQuery();
    }
    
    public static void returnItem(Borrow borrow ) throws Exception{
         String sql = "call sp_returnItem(?,?,?,?,?)";
        
        CallableStatement st = getStatement(sql);

        st.setString(1, borrow.getBorrowDate());
        st.setString(2, borrow.getDueDate());
        st.setString(3, borrow.getReturnDate());
        st.setInt(4, borrow.getMemberId());
        st.setInt(5, borrow.getCatalogueId());

        st.executeQuery();
    }
    
    public static int getMemberId(String name) throws Exception {
        String sql = "call sp_searchMemberId(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, name);

        ResultSet rs = st.executeQuery();
        
        if(rs.next())
            return rs.getInt("member_id");
        else 
            return 0;
    }    
    
    public static ArrayList<Catalogue> getBorrowedItem(String name) throws Exception{
        ArrayList<Catalogue> catalogueList = new ArrayList<Catalogue>();
        
         String sql = "call  sp_searchBorrowedItem(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, name);

        ResultSet rs = st.executeQuery();
        
        while(rs.next()){
            Catalogue catalogue = new Book();
            catalogue.setId(rs.getInt("catalogue_id"));
            catalogue.setTitle(rs.getString("title"));
            catalogue.setDescription( rs.getString("description"));
            catalogue.setReleaseDate(rs.getString("release_date"));
            catalogue.setStatus(rs.getString("status"));
            catalogue.setNote(rs.getString("note"));
            catalogue.setLanguage(rs.getString("language"));
            catalogueList.add(catalogue);
        }
        
        return catalogueList;
    }
}
