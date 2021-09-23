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
public class Test {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);   
    QLPH ql= new QLPH();
    
    boolean flag = true;
    do{
    System.out.println("Menu: \n"+"1.Thêm phòng học\n"+"2.Tìm phòng học\n"+"3.In all danh sách"+"\n"
               +"4.In phòng đạt chuẩn\n"+"5.In danh sách phòng tăng dần theo cột dãy nhà\n"+"6.In danh sách giảm dần theo cột diện tích\n"+"7.In danh sách tăng dần theo cột số bóng đèn\n" 
               +"8.Cập nhât số máy tính cho phòng máy tính\n"+"9.Xóa phòng học\n"+"10.in ra tổng số phòng học\n"+"11.IN ra phòng máy có 60 máy" );
    System.out.print("Bạn chọn chức năng nào: ");
    int choose=sc.nextInt();
    switch(choose){
        case 1:
            ql.nhap(); 
            break;
        case 2:
            ql.findroom();
            break;
        case 3:
            ql.hienthiall();
            break;
        case 4:
            ql.number11();
            break;
        case 5: 
            ql.sapxepdaynh();
            break;
        case 6:
            ql.sapxepdientich();
            break;
        case 7:
            ql.sapxepbongden();
            break;
        case 9:
            ql.delroom();
            break;
        case 10:
            ql.total();
            break;
        case 11:
            ql.number11();
            break;
        default:
            System.out.println("Bye!");
            flag = false;
            break;
    }
    
    }while(flag);
}
}
