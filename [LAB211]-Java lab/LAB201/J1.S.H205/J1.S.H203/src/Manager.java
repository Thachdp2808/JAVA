
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MANH HUNG
 * 
 */
public class Manager {

    private final static Scanner sc = new Scanner(System.in);

    //function to get string input of users
    public static String getStringInput() {
        String title = "";
        //loop to user not input an empty string
        while (true) {
            title = sc.nextLine().trim();
            if (title.isEmpty()) {
                System.err.println("Input must not empty !");
                System.out.print("Re-input : ");
            } else {
                return title;
            }
        }
    }
    
    //function to get a reverse string
    public static String getStringReverse(String title){
        String result = "";
        String []arr = title.split("\\s");
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            result = result + arr[i] + " ";
        }
	result = result.substring(0, 1).toUpperCase()+ result.substring(1);
        return result.trim();
    }
    
    //function to print reverse string
    public static void printReverse(String title){
        String display = "String after reverse : " + title;
        System.out.println(display.trim());
    }
    
    //display function
    public static void display(){
        System.out.print("Input a string : ");
        String input = getStringInput();
        String reverse = getStringReverse(input);
        printReverse(reverse);
    }
}
