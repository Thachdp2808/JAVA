/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_stackjava;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
        double width,height;
        String color;
        Rectange hcn= new Rectange();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        hcn.setHeight(sc.nextDouble());
        System.out.print("Nhập chiều rộng: ");
        hcn.setWidth(sc.nextDouble());
        System.out.print("Nhập màu: ");
        hcn.setColor(sc.next());
        System.out.println("Các thuộc tính hình chữ nhật là: ");
        System.out.println("Chiều dài: "+hcn.getHeight());
        System.out.println("Chiều rộng: "+hcn.getWidth());
        System.out.println("Màu: "+hcn.getColor());
        System.out.println("Diện tích hình chữ nhật là: "+ hcn.findArea());
        System.out.println("Chu vi hình chữ nhật là: "+hcn.findPerimeter());
    }
}
