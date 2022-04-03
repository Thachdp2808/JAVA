/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.Scanner;

/**
 *
 * @author PV
 */
public class Main {
    public static void main(String []args){
        Book t = new Book();
        t.setAuthor("Nguyễn Mạnh Hưng");
        t.setTitle("Anh thợ sửa điều hòa may mắn");
        t.setNoOfPages(69);
        t.setFiction(false);
        System.out.println("Author : "+ t.getAuthor());
        System.out.println("Title : "+ t.getTitle());
        System.out.println("No of pages : "+t.getNoOfPages());
        System.out.print("Is Fiction? : ");
        if(t.isFiction()) System.out.println("Yes");
        else System.out.println("No");
        
    }
    
}