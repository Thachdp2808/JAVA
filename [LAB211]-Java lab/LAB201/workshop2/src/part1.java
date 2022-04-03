/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Part1 {
    public static void main(String[] args){
        try{
            int num;
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the number: ");
            num = sc.nextInt();
            if(num<1){
                System.out.println("The number is invalid");
            } else{
                System.out.println("The number is "+ num);
            }
        } catch(Exception e){
            System.out.println("The number is invalid");
        }
    }
}
