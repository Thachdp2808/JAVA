/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snt;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class Snt {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int j,count;
        int k=0;
        for(int i=100;i>0;i--){
            count=0;
            for(j=1;j<=i/2;j++){
		if(i%j==0){
                    count++;
		}
            }
            if(count==1){
                System.out.print(i+" ");
            }
            
        }
}
}
