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
public class PH {
    private String maphong;
    private String daynha;
    int dientich;
    private int bongden;
    public PH(){
        
    }
    public PH(String maphong, String daynha, int dientich, int bongden) {
        this.maphong = maphong;
        this.daynha = daynha;
        this.dientich = dientich;
        this.bongden = bongden;
    }
    public String getMaphong(){
        return maphong;
    }
    public String getDaynha(){
        return daynha;
    }
    public int getDientich(){
        return dientich;
    }
    public int getBongden(){
        return bongden;
    }
    public void setMaphong(String maphong){
        this.maphong=maphong;
    }
    public void setDaynha(String daynha){
        this.daynha=daynha;
    }
    public void setDientich(int dientich){
        this.dientich=dientich;
    }
    public void setBongden(int bongden){
        this.bongden=bongden;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maphong=sc.nextLine();
        System.out.print("Nhập dãy nhà: ");
        daynha=sc.nextLine();
        System.out.print("Nhập diện tích: ");
        dientich=sc.nextInt();
        System.out.print("Nhập số bóng đèn: ");
        bongden=sc.nextInt();
    }
    public void hienthi(){
        System.out.println("Mã phòng: "+maphong);
        System.out.println("Dãy nhà: "+daynha);
        System.out.println("Diện tích: "+dientich+"m2");
        System.out.println("Số bóng đèn: "+bongden+ " bóng");
    }

    public boolean datchuan(boolean t){
        boolean k =true;
        if(PMT.datchuan1(bongden,dientich,k))
    }

    
    

   
    
}
