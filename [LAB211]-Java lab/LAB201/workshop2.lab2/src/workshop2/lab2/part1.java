/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2.lab2;

import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class part1 {
    public static void main(String[] args){
        boolean cout=false;
        do{
        try{
            int num;
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the number: ");
            num = sc.nextInt();
            if(num<1){
                System.out.println("The number is invalid");
                cout=true;
            } else{
                System.out.println("The number is "+ num);
                cout=false;
            }
        } catch(Exception e){
            System.out.println("The number is invalid");
            cout=true;
        }
     } while(cout);
    }
}
