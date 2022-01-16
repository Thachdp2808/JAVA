/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Workshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bài 1: ");
        for(int i=2;i<=10;i++){
            if(i%2==1){
                continue;
            }
            System.out.printf("%d ",i);
        }
        System.out.println();
        int t=2;
        while(t<=10){
            boolean chan=t%2==0;
            if(chan){
            System.out.printf("%d ",t);
            }
            t++;
        }
        System.out.println();
        System.out.println("Bài 2: ");
        System.out.printf("Nhập số phần tử trong mảng:  ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            System.out.printf("Nhập phần tử thứ %d: ",i);
            a[i]= scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.printf("%d ",a[i]);
        }
	for(int i=0;i<=n-2;i++){
		for(int j=i+1;j<=n-1;j++){
			if(a[i]>a[j]){
				int tg=a[i];
				a[i]=a[j];
				a[j]=tg;
			}
		}
	}
	System.out.print("\nMảng sau khi được sắp xếp tăng dần là: ");
	for(int i=0;i<n;i++){
		System.out.printf("%d ",a[i]);
        }
        int max=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.printf("\nPhần tử lớn nhất trong mảng là: %d ",max);
        System.out.println();
    }
    
}
