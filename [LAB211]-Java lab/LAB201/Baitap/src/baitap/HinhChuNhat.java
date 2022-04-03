/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class HinhChuNhat {
    protected double chieuDai, chieuRong, chuVi, dienTich;
    Scanner scanner = new Scanner(System.in);
     
    public void nhap() {
        do {
            System.out.println("Chiều Dài là: ");
            chieuDai = scanner.nextDouble();
            System.out.println("Chiều Rộng là: ");
            chieuRong = scanner.nextDouble();
        } while (chieuDai < chieuRong);
    }
     
    public void hienThi(double dai, double rong) {
        System.out.println("Chiều dài và chiều rộng của hình chữ nhật lần lượt là "
                + chieuDai + " và " + chieuRong);
    }
     
    public double tinhChuVi(double dai, double rong) {
        chuVi = (dai + rong) * 2;
        return chuVi;
    }
     
    public double tinhDienTich(double dai, double rong) {
        dienTich = dai * rong;
        return dienTich;
    }
     
    public void hienThiChuViVaDienTich(double cv, double dt) {
        System.out.println("Chu vi hình chữ nhật = " + cv);
        System.out.println("Diện tích hình chữ nhật = " + dt);
    }
    
}
