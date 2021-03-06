/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Catalogue;
import Model.Dvd;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author massami
 */
public class DvdDAL extends BaseDAL {
    /**
     * Insert DVD information to the database
     * @param dvd
     * @throws Exception 
     */
    public static void addDvd(Dvd dvd) throws Exception {
        String sql = "call sp_addDvd(?,?,?,?,?,?,?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, dvd.getDistributor());
        st.setString(2, dvd.getCast());
        st.setString(3, dvd.getCredits());
        st.setString(4, dvd.getTitle());
        st.setString(5, dvd.getDescription());
        st.setString(6, dvd.getReleaseDate());
        st.setString(7, dvd.getStatus());
        st.setString(8, dvd.getNote());
        st.setString(9, dvd.getLanguage());

        st.executeQuery();
    }

    /**
     * Update the information of the DVD to the database
     * @param dvd
     * @throws Exception 
     */
    public static void updateDvd(Dvd dvd) throws Exception {
        String sql = "call sp_updateDvd(?,?,?,?,?,?,?,?,?,?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, dvd.getId());
        st.setString(2, dvd.getDistributor());
        st.setString(3, dvd.getCast());
        st.setString(4, dvd.getCredits());
        st.setString(5, dvd.getTitle());
        st.setString(6, dvd.getDescription());
        st.setString(7, dvd.getReleaseDate());
        st.setString(8, dvd.getStatus());
        st.setString(9, dvd.getNote());
        st.setString(10, dvd.getLanguage());

        st.executeQuery();
    }

    /**
     * Get the list of all DVDs 
     * @return list of DVDs
     * @throws Exception 
     */
    public static ArrayList<Catalogue> getAllDvd() throws Exception {
        ArrayList<Catalogue> catalogueList = new ArrayList();

        String sql = "call sp_searchDvd()";

        ResultSet rs = getStatement(sql).executeQuery();

        while (rs.next()) {
            Dvd dvd = new Dvd(rs.getInt("catalogue_id") ,rs.getInt("dvd_id"), rs.getString("distributor"), rs.getString("cast"), rs.getString("credits"), rs.getString("title"), rs.getString("description"), rs.getString("release_date"), rs.getString("status"), rs.getString("note"), rs.getString("language"));
            catalogueList.add(dvd);
        }

        return catalogueList;
    }

    /**
     * Get the list of DVDs filtered by the title
     * @param title filter
     * @return list of DVDs
     * @throws Exception 
     */
    public static ArrayList<Catalogue> getDvdByTitle(String title) throws Exception {
        ArrayList<Catalogue> catalogueList = new ArrayList();

        String sql = "call sp_searchDvdByTitle(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, title);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Dvd dvd = new Dvd(rs.getInt("catalogue_id"), rs.getInt("dvd_id"), rs.getString("distributor"), rs.getString("cast"), rs.getString("credits"), rs.getString("title"), rs.getString("description"), rs.getString("release_date"), rs.getString("status"), rs.getString("note"), rs.getString("language"));
            catalogueList.add(dvd);
        }

        return catalogueList;
    }
    
    /**
     * Get the list of available DVDs for borrowing
     * @return list of DVDs
     * @throws Exception 
     */
    public static ArrayList<Catalogue> getAvailableDvd() throws Exception {
        ArrayList<Catalogue> catalogueList = new ArrayList();

        String sql = "call sp_searchAvailableDvd()";

        ResultSet rs = getStatement(sql).executeQuery();

        while (rs.next()) {
            Dvd dvd = new Dvd(rs.getInt("catalogue_id") ,rs.getInt("dvd_id"), rs.getString("distributor"), rs.getString("cast"), rs.getString("credits"), rs.getString("title"), rs.getString("description"), rs.getString("release_date"), rs.getString("status"), rs.getString("note"), rs.getString("language"));
            catalogueList.add(dvd);
        }

        return catalogueList;
    }

    /**
     * Get the list of available DVDs filtered by title
     * @param title filter
     * @return list of DVDs
     * @throws Exception 
     */
    public static ArrayList<Catalogue> getAvailableDvdByTitle(String title) throws Exception {
        ArrayList<Catalogue> catalogueList = new ArrayList();

        String sql = "call sp_searchAvailableDvdByTitle(?)";

        CallableStatement st = getStatement(sql);

        st.setString(1, title);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Dvd dvd = new Dvd(rs.getInt("catalogue_id"), rs.getInt("dvd_id"), rs.getString("distributor"), rs.getString("cast"), rs.getString("credits"), rs.getString("title"), rs.getString("description"), rs.getString("release_date"), rs.getString("status"), rs.getString("note"), rs.getString("language"));
            catalogueList.add(dvd);
        }

        return catalogueList;
    }

    /**
     * Local delete of the DVD object
     * @param id
     * @throws Exception 
     */
    public static void deleteDvd(int id) throws Exception {
        String sql = "call sp_deleteDvd(?)";

        CallableStatement st = getStatement(sql);

        st.setInt(1, id);

        st.executeQuery();
    }
}
