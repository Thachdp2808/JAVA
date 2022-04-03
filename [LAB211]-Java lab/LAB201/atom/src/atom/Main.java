/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atom;

import java.util.*;

/**
 *
 * @author PV
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Atomic Information");
        System.out.println("==================");
        ArrayList<Atom> list = new ArrayList<Atom>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            Atom t = new Atom();

            System.out.print("Enter atomic number : ");
            t.setNumber(sc.nextInt());
            if (!t.accept()) {
                System.out.printf("\n\n\n");
                for (Atom x : list) {
                    x.display();
                }
                break;
            } else {
                System.out.print("Enter symbol : ");
                t.setSymbol(sc.next());
                System.out.print("Enter full name : ");
                t.setFullname(sc.next());
                System.out.print("Enter atomic weight : ");
                t.setWeight(sc.nextFloat());
                list.add(t);
                System.out.println("");

            }

        }

    }
}