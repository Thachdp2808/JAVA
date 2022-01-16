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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student sv1= new Student();
        sv1.setDLT(7);
        sv1.setDTH(8);
        sv1.setMssv(151521);
        sv1.setName("Thach");
        System.out.println("Name: "+sv1.getName());
        System.out.println("MSSV: "+sv1.getMssv());
        System.out.println("DLT: "+sv1.getDLT());
        System.out.println("DTH: "+sv1.getDTH());
        System.out.println("DTB: "+sv1.DTB());
        
        
        Student sv2=new Student();
        Scanner sc= new Scanner(System.in);
        int mssv;
        String name;
        float dLT;
        float dTH;
        System.out.print("Nhập tên: ");
        sv2.setName(sc.next());
        System.out.print("Nhập mssv: ");
        sv2.setMssv(sc.nextInt());
        System.out.print("Nhập điểm lý thuyết: ");
        sv2.setDLT(sc.nextFloat());
        System.out.print("Nhập điểm thực hành: ");
        sv2.setDTH(sc.nextFloat());
        System.out.println("Name: "+sv2.getName());
        System.out.println("MSSV: "+sv2.getMssv());
        System.out.println("DLT: "+sv2.getDLT());
        System.out.println("DTH: "+sv2.getDTH());
        System.out.println("DTB: "+sv2.DTB());
        
        
        
        System.out.printf("%-18s%-10s%-12s%-12s%s\n","Họ và tên","MSSV","Điểm LT","Điểm TH","Điểm TB");
        System.out.printf("%-18s%-12d%-12d%-10d%.1f\n","Đào Phúc Thạch",151521,8,7,7.5);
        System.out.printf("%-18s%-12d%-12.1f%-10.1f%.1f\n",sv2.getName(),sv2.getMssv(),sv2.getDLT(),sv2.getDTH(),sv2.DTB()); 
    }
    
    
}
