/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.baitap2;

import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class Main {
    public static void main(String[] args) {
        //-------------------sinh viên 1-------------------
 
        SinhVien sv1 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên 1: ");
        sv1.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 1: ");
        sv1.setTenSV(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv1.setDiemTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv1.setDiemTH(sc.nextFloat());
 
        //-------------------sinh viên 2----------------------
 
        SinhVien sv2 = new SinhVien();
        System.out.println("Nhập mã sinh viên 2: ");
        sv2.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 2: ");
        sv2.setTenSV(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv2.setDiemTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv2.setDiemTH(sc.nextFloat());
 
        //---------------------sinh viên 3------------------------
 
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhập mã sinh viên 3: ");
        sv3.setMaSV(sc.nextInt());sc.nextLine();
        System.out.println("Nhập tên sinh viên 3: ");
        sv3.setTenSV(sc.nextLine());
        System.out.println("Nhập điểm lý thuyết: ");
        sv3.setDiemTL(sc.nextFloat());
        System.out.println("Nhập điểm thực hành: ");
        sv3.setDiemTH(sc.nextFloat());
 
        //in theo format
        System.out.printf("%6s %10s %20s %10s %10s \n","Mã sinh viên","Họ tên","Điểm lý thuyết","Điểm thực hành","Điểm trung bình");
        //gọi phương thức in đã được viết ở class SinhVien cho các sinh viên để hiển thị kết quả đã nhập
        sv1.inSV();
        sv2.inSV();
        sv3.inSV();
        System.out.println("--------------------------end-----------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}

