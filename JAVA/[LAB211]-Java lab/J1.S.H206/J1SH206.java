/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h206;

import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class J1SH206 {
        public static int CheckInt(String Mess){
        Scanner sc= new Scanner(System.in);
    int num;
    do{
        System.out.print(Mess);
        try {
            num=Integer.parseInt(sc.nextLine());
            if(num>=0){ 
                break;
            }
            System.out.println("Nhập >0");
        } catch (Exception e) {
            System.out.println("Invalid input, plz input again");
        }
    }while(true);
    return num;
}
    public static void CheckInput(int min, int max){
        do{
           if(max>=min ){
               break;
           } 
            System.out.println("Nhập Max > Min");
            int n= CheckInt("Bạn muốn nhập lại(Min:1, Max:2): ");
            switch(n){
                case 1:
                    min = CheckInt("Input Min: ");
                    break;
                case 2:
                    max= CheckInt("Input Max: ");
                    break;
                default:
                    
            }
        }while(true);
    }
    public static void SquareNumber(int min,int max){
        int i,j,k;
        
        for( i =min ; i<=max;i++){
            for( j=i ; j<=max;j++){
                System.out.print(j);
            }
            for(k=0;k<i-min;k++){
                System.out.print(k+min);
            }
            System.out.println();
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int min = CheckInt("Input Min: ");
        int max= CheckInt("Input Max: ");
        CheckInput(min,max);
        SquareNumber(min,max);
    }
//    12345
//    23451
//    34512
//    45123
//    51234
    
    
}
