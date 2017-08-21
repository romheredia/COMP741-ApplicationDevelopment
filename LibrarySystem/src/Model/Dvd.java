/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAL.DvdDAL;
import java.util.ArrayList;

/**
 *
 * @author Rom
 */
public class Dvd extends Catalogue {
    
    private int id;
    private String distributor;
    private String cast;
    private String credits;
    private int catalogueId;

    public Dvd(int id, String distributor, String cast, String credits, String title, String description, String releaseDate, String status, String note, String language) {
        super(title, description, releaseDate, status, note, language);
        this.id = id;
        this.distributor = distributor;
        this.cast = cast;
        this.credits = credits;
    }
    
    public Dvd(int catalogueId, int id, String distributor, String cast, String credits, String title, String description, String releaseDate, String status, String note, String language) {
        super(catalogueId, title, description, releaseDate, status, note, language);
        this.id = id;
        this.distributor = distributor;
        this.cast = cast;
        this.credits = credits;
    }
    
    public Dvd(){
        
    }
    
    public int getDvdId(){
        return id;
    }
    
    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }
    
    public int getCatalogueId(){
        return this.catalogueId;
    }
    
    public void setCatalogueId(int id){
        this.catalogueId = id;
    }
    
    @Override
    public void Add() throws Exception{
        DvdDAL.addBookDvd(this);
    }
    
    @Override
    public void Update() throws Exception{
        DvdDAL.updateDvd(this);
    }
    
    @Override
    public void Delete(int id) throws Exception{
        DvdDAL.deleteDvd(id);
    }
    
    @Override
    public ArrayList<Catalogue> Search() throws Exception {
        return DvdDAL.getAllDvd();
    }

    @Override
    public ArrayList<Catalogue> SearchByTitle(String title) throws Exception {
        return DvdDAL.getDvdByTitle(title);
    }

    @Override
    public ArrayList<Catalogue> SearchAvailableItems() throws Exception {
        return DvdDAL.getAvailableDvd();
    }

    @Override
    public ArrayList<Catalogue> SearchAvailableItemsByTitle(String title) throws Exception {
        return DvdDAL.getAvailableDvdByTitle(title);
    }
}
