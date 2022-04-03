/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package workshop1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Part3 {
    public static void main(String[] args){
        int num;
    System.out.print("Enter the number of list: ");
    Scanner scanner = new Scanner (System.in);
     num = scanner.nextInt();
    System.out.println("Enter list of student name:");
    String[] list = new String[100];
        for(int i=0;i<num;i++) {
            Scanner sc = new Scanner(System.in);
            list[i] = sc.nextLine();
        }
       System.out.println("List of student name:");
        for(int i=0;i<num;i++) {
            System.out.println(list[i].toUpperCase());
        }
}
}