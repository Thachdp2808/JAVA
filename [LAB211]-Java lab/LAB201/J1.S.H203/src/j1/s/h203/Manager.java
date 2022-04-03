/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h203;

import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class Manager {

    private final static Scanner sc = new Scanner(System.in);
    public static String checkInputString(String msg, String regex) {
        String input ;
        Scanner SC = new Scanner (System.in);
        do {
            System.out.print(msg);
            input = SC.nextLine().trim();
            if (!input.isEmpty()) {
                if (input.matches(regex)) {
                    break;
                } else {
                    System.err.println("Incorrect Valid Data - Enter Again");
                }
            } 
            System.err.println("Please Input again");
        } while (true);
        return input;
    }   
    public static String getStringReverse(String title){
        String result = "";    
        String result1 ="";
        String []arr = title.split("\\."); 
        String []arr1 = title.split("\\s+");
        for(int  i = 0 ;i<arr1.length; i++){    
               result1 += arr1[arr1.length-i-1]+" ";    
        }
        for(int  i = 0 ;i<arr.length; i++){    
               result += arr[arr.length-i-1]+"."+" ";    
        } 
        result = result.substring(0, 1).toUpperCase() 
                + result.substring(1);              
        return result+result1.trim();
    }
    public static void main (String[] args){      
        String input = checkInputString("input to string : " , "[A-Za-z ]+[ -~]+");
        String reverse = getStringReverse(input);
        System.out.println(reverse);
    }
   
    //testcase: hello there  > There hello
}  
