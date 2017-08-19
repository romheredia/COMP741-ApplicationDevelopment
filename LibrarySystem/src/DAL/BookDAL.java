/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Book;
import Model.Catalogue;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author massami
 */
public class BookDAL extends BaseDAL {

    public static void addBook(Book book) throws Exception {
        String sql = "call addBook(?,?,?,?,?,?,?,?,?)";
        
        CallableStatement st = getStatement(sql);

        st.setString(1, book.getAuthor());
        st.setString(2, book.getGenre());
        st.setString(3, book.getIsbn());
        st.setString(4, book.getTitle());
        st.setString(5, book.getDescription());
        st.setString(6, book.getReleaseDate());
        st.setString(7, book.getStatus());
        st.setString(8, book.getNote());
        st.setString(9, book.getLanguage());

        st.executeQuery();
    }

    public static void updateBook(Book book) throws Exception {
        String sql = "call updateBook(?,?,?,?,?,?,?,?,?,?)";
        
        CallableStatement st = getStatement(sql);

        st.setInt(1, book.getId());
        st.setString(2, book.getAuthor());
        st.setString(3, book.getGenre());
        st.setString(4, book.getIsbn());
        st.setString(5, book.getTitle());
        st.setString(6, book.getDescription());
        st.setString(7, book.getReleaseDate());
        st.setString(8, book.getStatus());
        st.setString(9, book.getNote());
        st.setString(10, book.getLanguage());

        st.executeQuery();
    }

    public static ArrayList<Catalogue> getAllBook() throws Exception {
        ArrayList<Catalogue> catalogueList = new ArrayList();

        String sql = "call searchBook()";
        
        ResultSet rs = getStatement(sql).executeQuery();

        while (rs.next()) {
            Book book = new Book(rs.getInt("catalogue_id"), rs.getInt("book_id"), rs.getString("author"), rs.getString("genre"), rs.getString("isbn"), rs.getString("title"), rs.getString("description"), rs.getString("release_date"), rs.getString("status"), rs.getString("note"), rs.getString("language"));
            catalogueList.add(book);
        }

        return catalogueList;
    }

    public static ArrayList<Catalogue> getBookByTitle(String title) throws Exception {
        ArrayList<Catalogue> catalogueList = new ArrayList();

        String sql = "call searchBookByTitle(?)";
        
        CallableStatement st = getStatement(sql);

        st.setString(1, title);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Book book = new Book(rs.getInt("catalogue_id"), rs.getInt("book_id"), rs.getString("author"), rs.getString("genre"), rs.getString("isbn"), rs.getString("title"), rs.getString("description"), rs.getString("release_date"), rs.getString("status"), rs.getString("note"), rs.getString("language"));
            catalogueList.add(book);
        }

        return catalogueList;
    }

    public static void deleteBook(int id) throws Exception {
        String sql = "call deleteBook(?)";
        
        CallableStatement st = getStatement(sql);

        st.setInt(1, id);

        st.executeQuery();
    }
}
