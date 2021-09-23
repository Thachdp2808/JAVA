/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<QLDB> db = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
       boolean flag =true;
       do{
        System.out.println("Menu: ");
        System.out.println("1.Thêm thông tin danh bạ."+"\n"+"2.Hiện thị danh bạ."+"\n"+"3.Tìm kiếm địa chỉ."+"\n"+"4.Tìm kiếm thông tin danh bạ");
        System.out.print("Bạn chọn phương thức nào: ");
        int choose=sc.nextInt();
        switch(choose){
            case 1:
                System.out.println("Bạn muốn thêm bao nhiêu người?: ");
                int n= sc.nextInt();
                for(int i=1;i<=n;i++){
                    QLDB qldb= new QLDB(); 
                    qldb.nhap(sc);
                    db.add(qldb);                 
                 }
                break;
            case 2:
               for(int i=0;i<db.size();i++){
                   db.get(i).hienthi();
               }
                break;
            case 3:
                System.out.print("Nhập địa chỉ cần tìm: ");
                String diachi= sc.next();
                int count =0;
                for(QLDB qldb :db){
                   if(qldb.getAddress().equalsIgnoreCase(diachi)){
                       qldb.hienthi();
                       count++;
                   }
               }
               if(count==0){
                   System.out.println("Không trùng khớp.");
               }
               break;
            case 4:
                System.out.print("Nhập số cần tìm: ");
                long num=sc.nextLong();
                 count=0;
                for(QLDB qldb: db){
                    if(qldb.getNumberphone()==num){
                        qldb.hienthi();
                        count++;
                    }
                }
                if(count==0){
                    System.out.println("Không có số nào trùng khớp.");
                }
                break;
            default:
                System.out.println("Bye!");
                flag=false;
                break;
    }
    }while(flag);
}
}
