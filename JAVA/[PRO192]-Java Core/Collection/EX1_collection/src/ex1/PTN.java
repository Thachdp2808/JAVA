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
public class PTN extends PH{
    private String majors;
    private int capacity;
    private boolean bonrua;
    public PTN(){
        
    }
    public PTN(String majors,int capacity, boolean bonrua){
        this.majors=majors;
        this.capacity=capacity;
        this.bonrua=bonrua;
    }
     public boolean getBonrua(){
        return bonrua;
    }
    public void setBonrua(boolean bonrua){
        this.bonrua=bonrua;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập chuyên ngành: ");
        majors=sc.nextLine();
        System.out.print("Nhập sức chứa của phòng học; ");
        capacity=sc.nextInt();
        System.out.print("Phòng có bồn rửa hay không?(True-có,False-không): ");
        bonrua=sc.nextBoolean();
    }
    @Override
    public void hienthi(){
        System.out.println("Phòng Thí Nghiệm");
        super.hienthi();
        System.out.println("Chuyên ngành: "+ majors);
        System.out.println("Sức chứa của phòng: "+ capacity);
        if(bonrua==true){
            System.out.println("Phòng có bồn rửa.");
        }else{
            System.out.println("Phòng không có bồn rửa.");
        }
    }
    public boolean datchuan1(int getBongden, int getDientich,boolean k){
        if(getDientich/getBongden<=10 && bonrua==true){
            return true;
        }else{
            return false;
        }
    }
}
