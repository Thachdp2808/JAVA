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
public class main {
    public static void main(String[] args) {
        Book book= new Book();
        book.setAuthor("Đào Phúc Thạch");
        book.setTitle("Trời hôm nay nhiều mây cực");
        book.setNoOfPages(89);
        book.setFiction(true);
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Title: "+book.getTitle());
        System.out.println("NoofPages: "+book.getNoOfPages());
        System.out.print("Is Function: ");
        if(book.getFiction())
            System.out.println("Yes");
        else System.out.println("No");
    }
}
