/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import static DAL.BaseDAL.getStatement;
import Model.History;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author massami
 */
public class HistoryDAL extends BaseDAL{
    public static ArrayList<History> getTransactionHistory(String name) throws Exception{
        ArrayList<History> historyList = new ArrayList();

        String sql = "call sp_searchTransactionHistory(?)";
        
        CallableStatement st = getStatement(sql);

        st.setString(1, name);

        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            History history = new History(rs.getString("title"), rs.getString("due_date"), rs.getString("borrow_date"), rs.getString("name"));
            historyList.add(history);
        }

        return historyList;
    }
}
