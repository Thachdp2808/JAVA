/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
        Account tk = new Account();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập tên chủ tài khoản: ");
        tk.setNametk(sc.nextLine());
        System.out.print("Nhập số tài khoản: ");
        tk.setStk(sc.nextLong());
        tk.daohan();       
        System.out.println(tk.toString());
    }
}
