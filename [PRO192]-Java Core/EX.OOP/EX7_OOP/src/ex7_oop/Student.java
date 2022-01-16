/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_oop;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Student {
    private int masv;
    private String name;
    private String address;
    private String numPhone;
    String num="[0-9][0-9][0-9][0-9][0-9][0-9][0-9]";

    public Student() {
    }

    public Student(int masv, String name, String address, String numPhone) {
        this.masv = masv;
        this.name = name;
        this.address = address;
        this.numPhone = numPhone;
    }
    public int getMasv(){
        return masv;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getNumPhone(){
        return numPhone;
    }
    public void setMasv(int masv){
        this.masv=masv;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setNumPhone(String numPhone){
        this.numPhone=numPhone;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        masv=sc.nextInt();
        System.out.print("Nhập họ và tên: ");
        name=sc.next();
        System.out.print("Nhập địa chỉ: ");
        address=sc.next();
        boolean k = true;
        do{
        System.out.println("Nhập số điện thoại: ");
        numPhone=sc.next();
        }while(kiemtrasdt(k));
    }
    public boolean kiemtrasdt(boolean k){
        if(numPhone.matches(num)){
            k=false;
        }else{
            System.out.print("Số điện thoại chỉ được 7 số.");
        }
        return k;
    }
    @Override
    public String toString(){
        return "Mã sinh viên: "+masv+
                "\nHọ và tên: "+name+
                "\nĐịa chỉ: "+address+
                "\nSố điện thoại: "+numPhone;
    }
    public void hienthi(){
        System.out.println("Mã sinh viên: "+masv);
        System.out.println("Họ và tên: "+name);
        System.out.println("Địa chỉ: "+address);
        System.out.println("Số điện thoại: "+numPhone);
    }
}
