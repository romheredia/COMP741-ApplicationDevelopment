/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAL.HistoryDAL;
import java.util.ArrayList;

/**
 *
 * @author massami
 */
public class History {
    private String title;
    private String dueDate;
    private String borrowDate;
    private String name;

    public History(String title, String dueDate, String borrowDate, String name) {
        this.title = title;
        this.dueDate = dueDate;
        this.borrowDate = borrowDate;
        this.name = name;
    }
    
    public History(){
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<History> searchTransactionHistory(String name) throws Exception{
        return HistoryDAL.getTransactionHistory(name);
    }
}
