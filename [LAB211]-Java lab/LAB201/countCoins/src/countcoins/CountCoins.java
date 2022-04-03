/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countcoins;

import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class CountCoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public void countCoins(Scanner sc) {
    double totalCents = 0;
    
    while(sc.hasNext()) {
        int amount = sc.nextInt();
        String type = sc.next().toLowerCase();
        
        switch (type) {
            case "pennies":
                totalCents += amount;
                break;
            case "nickels":
                totalCents += 5 * amount;
                break;
            case "dimes":
                totalCents += 10 * amount;
                break;
            case "quarters":
                totalCents += 25 * amount;
                break;
            default:
                break;
        }
    }
    
    System.out.println("Total money: $" + 
        String.format("%.2f", totalCents / 100));
}
    }
    

