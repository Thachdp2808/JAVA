/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop22;

import java.util.*;

/**
 *
 * @author PV
 */
public class Workshop22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input the number of elements: ");
        n = Integer.parseInt(sc.next());
        int[] array = new int[n];
        System.out.print("The elements of the array: ");
        for (int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }
        System.out.print("Display the array: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        int temp;
        boolean check;
        for (int i = 0; i < n - 1; i++) {
            check = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    check = true;
                }
            }

            if (check == false) {
                break;
            }
        }
        System.out.println("");
        System.out.println("Maximum value of the array: " + array[n - 1]);

    }

}
