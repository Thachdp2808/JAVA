/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class QLPH {
     ArrayList<PH> ds= new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    public void nhap(){
        PH ph= new PH();
        int choose;
        boolean flip = true;
        System.out.print("Nhập số lượng phòng học: ");
        int n=sc.nextInt();
        
        System.out.println("Nhập vào danh sách: ");
        for(int i=0;i<n;i++){
            System.out.println("Phòng học thứ " + (i+1) + " là:" );
           
            System.out.print("Bạn chọn phòng học nào(1- Phòng Lý Thuyết,2-Phòng Thí Nghiệm, 3-Phòng Máy Tính): ");
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    ph = new PLT();
                    break;
                case 2:
                    ph= new PTN();
                    break;
                case 3:
                    ph = new PMT();
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    
                   
            }
            
            ph.nhap();
            ds.add(ph);
            
           
        }
        
    }
    public void hienthiall(){
        for(int i=0;i<ds.size();i++){
            ds.get(i).hienthi();
        }
                
    }
    public void findroom(){
        System.out.println("Nhập mã phòng: ");
        String num=sc.next();
        int count =0;
        for(PH ph: ds){
            if(ph.getMaphong().equalsIgnoreCase(num)){
                ph.hienthi();
                count++;
            }
        }
        if(count==0){
            System.out.println("Không trùng khớp mã nào.");
        }
    }
    public void delroom(){
        System.out.print("Nhập mã phòng: ");
        String num= sc.next();
        int count=0;
        for(PH ph:ds){
            if(ph.getMaphong().equals(num)){
                ds.remove(ph);
                count++;
            }
        }
        if(count==0){
            System.out.println("Không trùng khớp.");
        }
    }
    public void total(){
        int count=0;
        for(int i=0;i<ds.size();i++){
            count++;
        }
        System.out.println("Tổng số phòng là: "+count);
    }
    public void sapxepdaynh(){
        Collections.sort(ds,new Comparator<PH>(){
    @Override
    public int compare(PH t, PH t1) {       
            int cmp =t.getDaynha().compareTo(t1.getDaynha());
        if(cmp>=0){
            return -1;
        }else{
            return -1;
        }    
    }
    });
     for(int i=0;i<ds.size();i++){
         ds.get(i).hienthi();
     }   
    }
    
    public void sapxepdientich(){
        Collections.sort(ds,new Comparator<PH>(){
    @Override
    public int compare(PH a, PH a1) {       
        if(a.getDientich()<a1.getDientich()){
            return -1;
        }else{
            return -1;
        }    
    }
    });
     for(int i=0;i<ds.size();i++){
         ds.get(i).hienthi();
     }   
    }
    
    public void sapxepbongden(){
        Collections.sort(ds,new Comparator<PH>(){
    @Override
    public int compare(PH b, PH b1) {       
      if(b.getBongden() > b.getBongden()){
          return -1;
      }else{
          return 1;
      }
    }
    });
     for(int i=0;i<ds.size();i++){
         ds.get(i).hienthi();
     }   
    }
    
    public void datchuann(){
        PH ph = new PMT();
        PH ph1 = new PLT();
        PH ph2 = new PTN();
        boolean k =true;
        for(int i=0;i<ds.size();i++){
            if(ph.datchuan1(k)){
                ds.get(i).hienthi();
            }else{
                System.out.println("Không trùng khớp.");
            }
        }
    }
    public void number11(){ 
        PH ph =new PMT();
        PMT pmt = new PMT();
         for(int i=0;i<ds.size();i++){
            if(pmt.getComputer()<=60){
                ds.get(i).hienthi();
            }else{
                System.out.println("Không trùng khớp.");
            }
        }
    }
//    public void roomsixten(){
//        PMT pmt =new PMT();
//        for(PH.PMT ph:ds){
//            if(ph.getComputer()==60){
//                ph.hienthi();
//            }
//        }
//    }

}
    

