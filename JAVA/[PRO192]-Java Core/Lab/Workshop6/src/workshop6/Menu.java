/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop6;

import java.util.ArrayList;
import java.util.Scanner;
import static workshop6.Inputter.sc;

/**
 *
 * @author Buta
 */
public class Menu {
public static int getChoice(ArrayList options){
        for (int i = 0; i < options.size(); i++) {
            
            System.out.print((i+1) + "-" + options.get(i));
        }
        System.out.println("Choose 1 .." + options.size()+": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    public static int getChoice(Object[] options){
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + "-" + options[i]);
        }
        System.out.println("Choose 1.." +options.length+ ": ");
        return Integer.parseInt(sc.nextLine());
    }
}
