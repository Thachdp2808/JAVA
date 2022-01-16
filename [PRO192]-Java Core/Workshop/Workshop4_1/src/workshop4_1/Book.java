/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4_1;

/**
 *
 * @author Dell
 */
public class Book {
    String author;
    String title;
    int noOfPages;
    boolean fiction;
    public void setAuthor(String author){
        this.author=author;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setNoOfPages(int noOfPages){
        this.noOfPages=noOfPages;
    }
    public void setFiction(boolean fiction){
        this.fiction=fiction;
    }
    public String getAuthor(){
        return author;
    }
    public String getTitle(){
        return title;
    }
    public int getNoOfPages(){
        return noOfPages;
    }
    public boolean getFiction(){
        return fiction;
    }
}
