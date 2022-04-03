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
public class part2 {
    public static void main(String[] args){
        boolean cout=false;
        do{
            String s;
            String S = "[S][E][0-9][0-9][0-9]";
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the string: ");
            s= sc.next();
            if(s.matches(S)){
                System.out.println("The string is "+ s);
                cout=false;
            } else {
                System.out.println("The string is invalid");
                cout= true;
            }
        }while(cout);
    }
}
