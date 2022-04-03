
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MANH HUNG
 */
public class Main {

    public Main() {
    }
    public static String checkInputString(String msg, String regex) {
        String input ;
        do {
            System.out.print(msg);
            input = SC.nextLine().trim();
            if (!input.isEmpty()) {
                if (input.matches(regex)) {
                    break;
                } else {
                    System.err.println("Incorrect Valid Data - Enter Again");
                }
                
            }  else 
            {
                break;
            }
        } while (true);
        return input.trim();
    }   
    private static Scanner SC = new Scanner(System.in);

    public static String printReverse(String input) {
        String reverseWord = "";
        for (int i= 0 ; i< input.length() ;i++) {
            reverseWord = reverseWord + input.charAt(input.length() - 1-i );
        }
        //return the reverse word
        return reverseWord;
    }

    public static void main(String[] args) {
              
        //check empty
       String input = checkInputString("Enter String You Want to Count: ","[A-Za-z ]+[ -~]+");
       if(!input.isEmpty()){
       String RS  = printReverse(input);
        System.out.println(""+ RS);
       }
    }
// testcase : hello there!
}