/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author PV
 */
public class Book {

    /**
     * @param args the command line arguments
     */
 
    String author;
    String title;
    int noOfPages;
    boolean fiction;

  

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }
    
    
}