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
public class PLT extends PH{
    private boolean maychieu;
    public PLT(){
        
    }
    public PLT(boolean maychieu){
        this.maychieu=maychieu;
    }
    public boolean getMaychieu(){
        return maychieu;
    }
    public void setMaychieu(boolean maychieu){
        this.maychieu=maychieu;
    }
    @Override
    public void nhap(){
        super.nhap();
        System.out.print("Phòng có máy chiếu hay không?(True - có, False-không): ");
        Scanner sc= new Scanner(System.in);
        maychieu=sc.nextBoolean();
    }
    @Override
    public void hienthi(){
        System.out.println("Phòng Lý Thuyết");
        super.hienthi();
        if(maychieu==true){
            System.out.println("Phòng này có máy chiếu");
        }else{
            System.out.println("Phòng này không có máy chiếu");
        }
    }
    public boolean datchuan1(int getBongden, int getDientich,boolean k){
        if(getDientich/getBongden<=10 && maychieu==true){
            return true;
        }else{
            return false;
        }
    }
}
