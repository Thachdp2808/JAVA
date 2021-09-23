/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Workshop3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of Molecule: ");
        int n =scanner.nextInt();
        Molecules [] list = new Molecules[n];
        System.out.println("Molucule Information");
        System.out.println("====================");
        for(int i=0;i<n;i++){
            System.out.print("Structure: ");
            String str= scanner.next();
            System.out.print("Name: ");
            String na= scanner.next();
            System.out.print("Weight: ");
            Float we= scanner.nextFloat();
            list[i]= new Molecules();
            list[i].input(str, na, we);
        }
        for(int x=0;x<n;x++){
            list[x].display();
        }
        
        
        System.out.println("Number of Atoms: ");
        int m = scanner.nextInt();
        Atoms[] a=new Atoms[m];
        System.out.println("Atoms Information");
        System.out.println("=================");
        for(int i=0;i<m;i++){
            System.out.print("Enter atomic number : ");
            int numb = scanner.nextInt();
            System.out.print("Enter symbol : ");
            String sym = scanner.next();
            System.out.print("Enter fullname : ");
            String fname = scanner.next();
            System.out.print("Enter atomic weight : ");
            Float wei = scanner.nextFloat();
            System.out.print("\n");
            a[i]= new Atoms();
            a[i].Atoms(numb, sym, fname, wei);
        }
        for(int z=0; z<m ;z++){
            a[z].display();
        }
    }
    
}
