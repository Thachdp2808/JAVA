/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecule;

import java.util.Scanner;

/**
 *
 * @author PV
 */
public class Main {

    public static void main(String arg[]) {
        Molecule ar[] = new Molecule[100];
        Scanner sc = new Scanner(System.in);
        int i = 0, number;
        System.out.print("Enter the number : ");
        number = Integer.parseInt(sc.next());
        while (i < number) {
            System.out.println("");
            Molecule t = new Molecule();
            System.out.print("Enter the structure : ");
            t.setStructure(sc.next());
            System.out.print("Enter the name : ");
            t.setName(sc.next());
            System.out.print("Enter the weight : ");
            t.setWeight(Float.parseFloat(sc.next()));
            if (t.getWeight() <= 0 || t.getWeight() >= 100) {
                System.out.println("Weight must be positive and below 100. Please, reenter!");
                continue;
            } else {
                ar[i] = t;
                i++;
            }

        }
        System.out.println("\n\n\n");
        for (int j = 0; j < number; ++j) {
            ar[j].display();
        }

    }

}