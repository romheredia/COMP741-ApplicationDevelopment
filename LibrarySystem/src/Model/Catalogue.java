/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Rom
 */
public abstract class Catalogue {

    private int id;
    private String title;
    private String description;
    private String releaseDate;
    private String status;
    private String note;
    private String language;

    public Catalogue(String title, String description, String releaseDate, String status, String note, String language) {
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.status = status;
        this.note = note;
        this.language = language;
    }

     public Catalogue(int id, String title, String description, String releaseDate, String status, String note, String language) {
         this.id = id;
        this.title = title;
        this.description = description;
        this.releaseDate = releaseDate;
        this.status = status;
        this.note = note;
        this.language = language;
    }
     
    public Catalogue() {

    }

    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws Exception {
        if (status.equals("Available") || status.equals("Borrowed") || status.equals("Under Maintenance") || status.equals("Not in Stock")) {
            this.status = status;
        } else {
            throw new Exception("Please enter correct status");
        }
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public abstract void  Add() throws Exception;
    
    public abstract void Update() throws Exception;
    
    public abstract void Delete(int id) throws Exception;
    
    public abstract ArrayList<Catalogue> Search() throws Exception;
    
    public abstract ArrayList<Catalogue> SearchByTitle(String title) throws Exception;
    
    public abstract ArrayList<Catalogue> SearchAvailableItems() throws Exception;
    
    public abstract ArrayList<Catalogue> SearchAvailableItemsByTitle(String title) throws Exception;
    
    @Override
    public boolean equals(Object other){
        if(!(other instanceof Catalogue)){
            return false;
        }
        
        Catalogue cat = (Catalogue) other;
        
        return this.title.equals(cat.getTitle()) && 
                    this.description.equals(cat.getDescription()) &&
                    this.releaseDate.equals(cat.getReleaseDate()) &&
                    this.status.equals(cat.getStatus()) &&
                    this.note.equals(cat.getNote()) &&
                    this.language.equals(cat.getLanguage());
    }
}
