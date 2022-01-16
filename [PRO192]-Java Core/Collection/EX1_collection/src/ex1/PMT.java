/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PMT extends PH{
    private int computer;
    public PMT(){
        
    }
    public PMT(int computer){
        this.computer=computer;
    }
     public int getComputer(){
        return computer;
    }
    public void setComputer(int computer){
        this.computer=computer;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập số lượng máy tính: ");
        computer =sc.nextInt();              
    }
    @Override
    public void hienthi(){
        System.out.println("Phòng Máy Tính");
        super.hienthi();
        System.out.println("Số lượng máy tính trong phòng là: "+computer);
    }
    public boolean datchuan1(int getBongden, int getDientich,boolean k){
        if(getDientich/getBongden<=10 && getDientich/getBongden >0 ){
            return true;
        }else{
            return false;
        }
    }
}
