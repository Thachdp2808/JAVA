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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j,k;
        int min = CheckInt("Input Min: ");
        int max= CheckInt("Input Max: ");
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
        for( i =min ; i<=max;i++){  // sử dụng for i chạy từ min đến max
            for( j=i ; j<=max;j++){ // j chạy bắt đàu từ i cho đến max > in ra các phần tử
                System.out.print(j);
            }
            for(k=0;k<i-min;k++){   //k chạy từ k=0 đến k<i-min > nhưng ở for này i bằng min > i-min =0
                System.out.print(k+min);// for ko chạy 
            }
            System.out.println();
    }
    } /*
    1 đến 5
    12345
    23451
    34512
    45123
    i = min =1
        j=i=1 
            prinf :1
        j =2
            prinf : 2
        j =3
            prinf : 3
        j =4
            prinf : 4
        j =5
            prinf : 5
        
        k = 0 => k < i- min => k = 1-1=0 > ko chạy 
    i = min =2
        j =2
            prinf : 2
        j =3
            prinf : 3
        j =4
            prinf : 4
        j =5
            prinf : 5
        
        k = 0 => k < i- min => k = 2-1=1 
            k=0 > k = 
    
    
    
    
    
    
    */
}
