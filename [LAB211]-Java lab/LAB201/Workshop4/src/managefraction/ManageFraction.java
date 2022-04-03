/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managefraction;

import java.util.Scanner;

/**
 *
 * @author PV
 */

public class ManageFraction {

    /**
     * @param args the command line arguments
     */
    public static int gcd(int num1, int num2) { 
    int max = Math.abs(num1);
    int min = Math.abs(num2);
 
    while (max > 0) {
        if (max < min) {
            int x = max;
            max = min;
            min = x;
        }
        max %= min;
    }
 
    return min;
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the numerator 1: ");
        int numerator1=sc.nextInt();
        System.out.print("Enter the denominator 1: ");
        int denominator1=sc.nextInt();
        System.out.print("Enter the numerator 2: ");
        int numerator2=sc.nextInt();
        System.out.print("Enter the denominator 2: ");
        int denominator2=sc.nextInt();
        int resultdemo=gcd(denominator1,denominator2);
        System.out.println("Numerator addition: "+(numerator1*resultdemo/denominator1+numerator2*resultdemo/denominator2));
        System.out.println("Denominator addition: "+resultdemo);
        System.out.println("Numerator subtraction: "+(numerator1*resultdemo/denominator1-numerator2*resultdemo/denominator2));
        System.out.println("Denominator subtraction: "+resultdemo);
        int GCD1=gcd(numerator1*numerator2,denominator1*denominator2);
        int GCD2=gcd(numerator1*denominator2,numerator2*denominator1);
        System.out.println("Numerator mutiplication: "+(numerator1*numerator2/GCD1));
        System.out.println("Denominator mutiplication: "+(denominator1*denominator2/GCD1));
        System.out.println("Numerator division: "+(numerator1*denominator2/GCD2));
        System.out.println("Denominator division: "+(numerator2*denominator1/GCD2));
        
        
    }
    
}