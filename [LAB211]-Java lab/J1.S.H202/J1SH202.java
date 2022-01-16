/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h202;

import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class J1SH202 {
    public static String checkText(String Mess,String regex){
        Scanner sc= new Scanner(System.in);
        String text;
        do{
            System.out.print(Mess);
            text=sc.nextLine();
            if(!text.isEmpty()) {
                if(text.matches(regex))
                    break;
                System.out.println("Invalid input, plz enter by following: '"+regex+"'");
            }else{
                break;
            }
           
        }while(true);
        return text.trim();
        
    }
    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str =checkText("Nhập Reverse: ",  "[a-zA-z ]+");
        if(!str.isEmpty()){
            String reverse="";
            for(int i=str.length()-1;i>=0;i--){
                reverse = reverse + str.charAt(i);
            }
            System.out.println(reverse.trim());
        }
        
        
    }
    //Hello there -> ereth olleH
}
