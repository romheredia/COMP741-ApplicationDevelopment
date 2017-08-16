/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAL.BookDAL;
import java.util.ArrayList;

/**
 *
 * @author Rom
 */
public class Book extends Catalogue {

    private int id;
    private String author;
    private String genre;
    private String isbn;

    public Book(String author, String genre, String isbn, String title, String description, String releaseDate, String status, String note, String language) {
        super(title, description, releaseDate, status, note, language);
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Book(int id, String author, String genre, String isbn, String title, String description, String releaseDate, String status, String note, String language) {
        super(title, description, releaseDate, status, note, language);
        this.id = id;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void Add() throws Exception {
        BookDAL.addBook(this);
    }

    @Override
    public void Update() throws Exception {
        BookDAL.updateBook(this);
    }

    @Override
    public void Delete(int id) throws Exception {
        BookDAL.deleteBook(id);
    }

    @Override
    public ArrayList<Catalogue> Search() throws Exception {
        return BookDAL.getAllBook();
    }

    @Override
    public ArrayList<Catalogue> SearchByTitle(String title) throws Exception {
        return BookDAL.getBookByTitle(title);
    }
}
