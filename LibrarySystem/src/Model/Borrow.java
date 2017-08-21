/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAL.BorrowDAL;
import java.util.ArrayList;

/**
 *
 * @author massami
 */
public class Borrow {
    
    private int id;
    private String borrowDate;
    private String dueDate;
    private String returnDate;
    private int memberId;
    private int catalogueId;

    public Borrow(String borrowDate, String dueDate, String returnDate, int memberId, int catalogueId) {
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.memberId = memberId;
        this.catalogueId = catalogueId;
    }

    public Borrow(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getCatalogueId() {
        return catalogueId;
    }

    public void setCatalogueId(int catalogueId) {
        this.catalogueId = catalogueId;
    }
    
    public void addBorrow(Borrow borrow) throws Exception{
        BorrowDAL.addBorrow(borrow);
    }
    
    public void returnItem(Borrow borrow) throws Exception{
        BorrowDAL.returnItem(borrow);
    }
    
    public int searchMemberId(String name) throws Exception{
        return BorrowDAL.getMemberId(name);
    }
    
    public ArrayList<Catalogue> searchBorrowedItem(String name) throws Exception{
        return BorrowDAL.getBorrowedItem(name);
    }
}
