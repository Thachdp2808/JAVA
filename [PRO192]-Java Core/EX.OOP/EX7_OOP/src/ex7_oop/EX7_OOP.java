/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class EX7_OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> ql = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        boolean t=true;
        do{
        System.out.println("1.Thêm sinh viên."+"\n2.Xuất all danh sách."+
                "\n3.Xuất danh sách theo thứ tự tăng dần.");
        System.out.print("Bạn chọn lựa chọn số?: ");
        int choose=sc.nextInt();
        switch(choose){
            case 1:
                System.out.print("Nhập số lượng sinh viên: ");
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println("Sinh viên thứ " + (i+1) + " là:" );
                     Student stu = new Student();
                    stu.nhap();
                    ql.add(stu);
                }
               
            case 2:
                for(int i=0;i<ql.size();i++){
                    ql.get(i).hienthi();
                }
                break;
            case 3:
               Collections.sort(ql,new Comparator<Student>() {
            @Override
            public int compare(Student t, Student t1) {
                if(t.getMasv()<t1.getMasv()){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
              for(int i=0;i<ql.size();i++){
                  ql.get(i).hienthi();
            }
              break;
            default:
                System.out.println("Bye!");
                t=false;
                break;
        }
         
    }while(t);
        
        
        }      
}
