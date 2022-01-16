/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args){
        HTP htp= new HTP();
        Scanner sc = new Scanner(System.in);
        boolean t =true;
        htp.nhap();
        do{
            System.out.println("Nhập năm, tháng, ngày sản xuất:");
            htp.setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("Nhập năm, tháng, ngày hết hạn:");
            htp.setHSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }while(htp.kiemTraNgay(t));
        htp.hienthi();
        htp.kiemTraHSD();
    }
}
