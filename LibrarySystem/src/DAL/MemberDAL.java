/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Member;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rom
 */
public class MemberDAL {

    private Member member;

    private ArrayList<Member> queryMemberList(String sqlQuery) throws Exception {

        ArrayList<Member> memberList = new ArrayList<Member>();
        Database db = new Database();
        Connection conn = db.getConnection();

        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlQuery);

            while (rs.next()) {
                member = new Member(rs.getInt("member_id"), rs.getString("first_name"), rs.getString("last_name"),
                         rs.getDate("birthdate"), rs.getString("email_address"), rs.getString("contact_number"),
                         rs.getString("address"), rs.getString("suburb"), rs.getString("city"), rs.getString("postal_code"), rs.getBoolean("activated"));
                memberList.add(member);
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }

        return memberList;
    }

    public ArrayList<Member> showAllMembers() throws Exception {
        ArrayList<Member> members = queryMemberList("SELECT * FROM member");
        return members;
    }

    public void addMember(Member member) throws Exception {
        
    }

    public boolean deleteMember(int id) {
        try {
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
