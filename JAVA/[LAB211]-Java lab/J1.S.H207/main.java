/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h207;

import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class main {
    public static String checkInputString(String msg, String regex) {
        Scanner sc= new Scanner(System.in);
        String input  ;
        do {
            System.out.print(msg);
            input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                if (input.matches(regex)) {
                    break;
                } else {
                    System.err.println("Incorrect Valid Data - Enter Again");
                }
            } else {
                break;
            }
        } while (true);
        return input;
    }
    
    
    public static int secondHalfLetter(String input) {
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if( input.charAt(i) >= 'n' && input.charAt(i) <='z' ) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String input = checkInputString("Enter String You Want to Count: ","[A-Za-z ]+");
        int countRS = secondHalfLetter(input); 
        System.out.println("Value count: " + countRS);
    }
    
    
    
}
