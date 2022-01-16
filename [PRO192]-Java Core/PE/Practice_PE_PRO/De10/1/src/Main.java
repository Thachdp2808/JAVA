
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trinh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car name: ");
        String name = sc.nextLine();
        System.out.print("Enter car price: ");
        double price = Double.parseDouble(sc.nextLine());
        Car c = new Car(name, price);
        System.out.println("1. TC = 1 - test getName()");
        System.out.println("2. TC = 2 - test setPrice()");
        System.out.print("Enter TC: ");
        int tc = Integer.parseInt(sc.nextLine());
        if(tc==1){
            System.out.println(c.getName());
        }else{
            System.out.print("Enter new car price: ");
            c.setPrice(Double.parseDouble(sc.nextLine()));
            System.out.printf("%.2f",c.getPrice());
            System.out.println();
        }
    }
}
