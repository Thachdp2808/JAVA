import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

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

    private static Scanner SC = new Scanner(System.in);
    /**
     * @param input
     * @return
     */
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
            } 
            
        } while (true);
        return input;
    }   
    public static int secondHalfLetter(String input) {
        input = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if( input.charAt(i) >= 'n' && input.charAt(i) <= 'z' ) {
                count++;
                System.out.print(input.charAt(i)+ " ,");
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = checkInputString("Enter String You Want to Count: ","[A-Za-z ]+");
        int countRS = secondHalfLetter(input); 
        System.out.println("\nValue count: " + countRS);
    }
    // testcase: ruminates

}