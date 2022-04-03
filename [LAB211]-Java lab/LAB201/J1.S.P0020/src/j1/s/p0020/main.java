/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0020;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static int CheckInt(String Mess){
        Scanner sc=new Scanner(System.in);
    int num;
    do{
        System.out.print(Mess);
        try {
            num=Integer.parseInt(sc.nextLine());
            if(num>0){
                break;
            }
            System.out.println("Enter number of array >0");
        } catch (Exception e) {
            System.out.println("Invalid input, plz input again");
        }
    }while(true);
    return num;
    }
    
    public static int CheckInt1(){
        Scanner sc=new Scanner(System.in);
    int num = 0;
        try {
            num=Integer.parseInt(sc.nextLine());
            
        } catch (Exception e) {
            System.out.println("Invalid input, plz input again");
        }
        return num;
    
    }
    
    public static String printArrData(int[] arr,int n) {
        String rs = "[";
        for (int i = 0; i < n; i++) {
            rs += arr[i];
            if (i < n - 1) {
                rs += ", ";
            }
        }
        rs += "]\n";
        return rs;
    }
    public static void main(String[] args) {        
       Random random = new Random();
       Scanner sc = new Scanner(System.in); 
       
       int size = CheckInt("Enter number of array: ");        
        int arr[] = new int[size]; 
       for(int i=0; i<size; i++){ 
           arr[i]=CheckInt1();
       }   
       System.out.print("Unsorted array: " + printArrData(arr,size));  
       for(int i=0; i<size; i++){       
           int min=i;                                                                                                                        
            for( int j=i+1;j<size;j++){ 
              if(arr[j]<arr[min]){           
                  min=j;
              }             
          } 
            if(min!= i) {             
                int temp=arr[min];     
                arr[min]=arr[i];
                arr[i]=temp;
            }
       }   
        System.out.println("Sorted array: " + printArrData(arr,size));                  
    }
   // 4 3 7 5 9
    // 3 4 7 5 9
    // 3 4 7 5 9
    
   
}
 