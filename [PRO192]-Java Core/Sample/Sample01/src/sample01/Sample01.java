/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample01;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Sample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
//        Scanner scanner= new Scanner(System.in);
//          int a,b;
//          System.out.println("Nhap a= ");
//          a= scanner.nextInt();
//          System.out.println("Nhap b= ");
//          b= scanner.nextInt();
//          
//          int sum=a +b;
//          System.out.printf("Sum of %d and %d is %d ",a,b, sum);
//          Celendar c= Calendar.getInstance();
//          System.out.printf("Hom nay la ngay %1$te", c);
        
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap ten: ");
//        String name = scanner.nextLine();
//        
//        System.out.println("Welcome " + name);
    }
    
}
