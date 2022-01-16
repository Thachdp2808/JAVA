/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class main {
     public static void main(String[] args){
        
         Scanner sc= new Scanner(System.in);
         ArrayList<Infor> ql = new ArrayList<>();
         ArrayList<Infor> ql2= new ArrayList<>();
         boolean k=true;
         do{
         System.out.println("1.Thêm một khách hàng mới vào hàng đợi mua vé.");
         System.out.println("2.Bán một vé cho khách hàng.Chỉ báo cho người đăng kí trước.");
         System.out.println("3.Hiển thị danh sách khách hàng.");
         System.out.println("4.Hủy một khách hàng khỏi danh sách(khách hàng không mua vé nữa)..");
         System.out.println("5.Thống kê tình hình bán vé.");
         System.out.println("6.Lưu danh sách vào file.");
         System.out.println("7.Hiển thị danh sách các ga đang chờ mua vé.");
         System.out.println("8.HIển thị danh sách các ga đang chờ mua vé và số vé tương ứng cho ga.");
         System.out.println("0.Thoát chương trình.");
         System.out.print("Bạn lựa chọn phương thức nào?: ");
         int choose=sc.nextInt();
         switch(choose){
             case 0:
                 System.out.println("BYE!...");
                 k=false;
                 break;
             case 1:
                 System.out.print("Bạn muốn thêm mấy khách hàng?: ");
                 int n=sc.nextInt();
                 for(int i=0;i<n;i++){
                     System.out.println("Khách hàng thứ "+(i+1)+" :");
                     Infor inf= new Infor();
                     inf.nhap();
                     ql.add(inf);
                     
                 }
                 break;
             case 2:
                 System.out.print("Nhập tên khách hàng: ");
                 String f=sc.next();
                 int count=0;
                 for(Infor inf:ql){
                     if(inf.getName().equals(f)){
                         inf.hienthi();
                         ql.remove(inf);
                         ql2.add(inf);
                         count++;
                     }
                 }
                 if(count==0){
                     System.out.println("Không có trong danh sách.");
                 }
                 break;
             case 3:
                 for(int i=0;i<ql.size();i++){
                     ql.get(i).hienthi();
                 }
                 break;
             case 4:
                 System.out.print("Nhập tên khách hàng: ");
                 String q=sc.next();
                  count=0;
                 for(Infor inf:ql){
                     if(inf.getName().equals(q)){
                         ql.remove(inf);
                         
                         count++;
                     }
                 }
                 if(count==0){
                     System.out.println("Không có trong danh sách.");
                 }
                 break;
             default: 
                 System.out.println("BYE!...");
                 k=false;
                 break;
         }
         }while(k);
     }
}
