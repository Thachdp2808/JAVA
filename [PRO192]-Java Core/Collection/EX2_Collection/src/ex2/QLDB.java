/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class QLDB {
    private long numberphone;
    private String address;
    private String name;
    public QLDB(){
        
    }
    public QLDB(long numberphone,String address,String name){
        this.numberphone=numberphone;
        this.address=address;
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public long getNumberphone(){
        return numberphone;
    }
    public String getName(){
        return name;
    }
    public void setNumberphone(long numberphone){
        this.numberphone=numberphone;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setName(String name){
        this.name=name;
    }
    public void nhap(Scanner sc){
        System.out.print("Nhập tên(Viết liền không dấu): ");
        name=sc.next();
        System.out.print("Nhập SĐT: ");
        numberphone=sc.nextLong();
        System.out.print("Nhập địa chỉ(Viết liền không dấu): ");
        address=sc.next();
    }
    public void hienthi(){
        System.out.println("Tên: "+ name);
        System.out.println("Số điện thoại: "+numberphone);
        System.out.println("Địa chỉ: "+address);
        
    }
}
