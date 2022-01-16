/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_collection;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class Infor {
    private String cmnd;
    private String name;
    private String gaden;
    private double price;
    public Infor(){
        
    }
    public Infor(String cmnd, String name, String gaden, double price) {
        this.cmnd = cmnd;
        this.name = name;
        this.gaden = gaden;
        this.price = price;
    }
    public String getCmnd(){
        return cmnd;
    }
    public String getName(){
        return name;
    }
     public String getGaden(){
        return gaden;
    }
     public double getPrice(){
         return price;
     }
    public void setCmnd(String cmnd){
        this.cmnd=cmnd;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGaden(String gaden){
        this.gaden=gaden;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập số CMND: ");
        cmnd=sc.next();
        System.out.print("Nhập tên khác hàng: ");
        name=sc.next();
        System.out.print("Nhập Ga đến: ");
        gaden=sc.next();
        System.out.print("Nhập giá tiền: ");
        price=sc.nextDouble();
        
    }
    public void hienthi(){
        System.out.println("Số CMND: "+cmnd);
        System.out.println("Tên khác hàng: "+name);
        System.out.println("Ga đến: "+gaden);
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println("Giá tiền: "+formatter.format(price)+" VNĐ");
        
    }
}
