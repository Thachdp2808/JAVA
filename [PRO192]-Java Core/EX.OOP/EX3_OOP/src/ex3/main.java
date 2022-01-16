/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args){
        Vehicle xe1= new Vehicle();
        xe1.setName("Nguyễn Thu Loan");
        xe1.setNamemoto("Future Neo");
        xe1.setCapacity(100);
        xe1.setPrice(35000000);
        System.out.println("tax: "+xe1.tax());
        
        
        Vehicle xe2= new Vehicle();
        Scanner sc= new Scanner(System.in);
        String name;
        String namemoto;
        int capacity;
        int price;
        System.out.print("Nhap ten chu xe: ");
        xe2.setName(sc.nextLine());
        System.out.print("Nhap ten loai xe: ");
        xe2.setNamemoto(sc.nextLine());
        System.out.print("Nhap dung tich: ");
        xe2.setCapacity(sc.nextInt());
        System.out.print("Nhap tri gia: ");
        xe2.setPrice(sc.nextInt());
       
        
        
        Vehicle xe3= new Vehicle();
        xe3.setName("Nguyễn Minh Triết");
        xe3.setNamemoto("Land Ranger");
        xe3.setCapacity(1500);
        xe3.setPrice(10000000);
        
        
        System.out.printf("%-19s%-15s%-20s%-10s%s\n","Tên chủ xe","Loại xe","Dung tích","Trị giá"," Thuế phải nộp");
        System.out.printf("==============================================================================\n");
        System.out.printf("%-19s%-21s%-11d%-18.1f%.1f\n",xe1.getName(),xe1.getNamemoto(),xe1.getCapacity(),xe1.getPrice(),xe1.tax());
        System.out.printf("%-19s%-20s%-12d%-18.1f%.1f\n",xe2.getName(),xe2.getNamemoto(),xe2.getCapacity(),xe2.getPrice(),xe2.tax());
        System.out.printf("%-19s%-20s%-12d%-18.1f%.1f\n",xe3.getName(),xe3.getNamemoto(),xe3.getCapacity(),xe3.getPrice(),xe3.tax());
    }
}
