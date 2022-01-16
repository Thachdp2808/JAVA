/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample06;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Sample06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Object obj =new Object();
//        String[] name = {"Binh","An","Thang","Hung","Huong","Cuong"};
        // Sắp xếp theo mảng tăng dần theo alphabe;
        
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số chuỗi mà bạn muốn sắp xếp theo Alphabet  :");
        count = scan.nextInt();
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Nhập giá trị cho từng chuỗi:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.print("Các chuỗi sau khi sắp xếp là:");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.print(str[i] + ", ");
        }
    }
    
    
    
}
