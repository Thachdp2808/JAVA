/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop4_2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        Student t = new Student();
        //Student ar[] = new Student[100];
        //int count=0;
        t.setName("Đào Phúc Thạch");
        t.setStudentId("HE151521");
        LocalDate temp = LocalDate.of(28, Month.AUGUST, 2001);
        t.setBirthDate(temp);   
        t.setAddress("Hưng Yên");
        t.setMajor("Software Engineering");
        t.setGpa(5.0);
        t.printAllAttributes();
        }

    }


/*
     for(int i=0;i<number;++i) {
            
            Student t = new Student();
            System.out.print("Enter Student Name: ");
            t.setName(sc.next());
            System.out.print("Enter Student ID: ");
            t.setStudentId(sc.next());
            //System.out.print("Enter Date of birth: ");
            LocalDate temp = LocalDate.of(2017, Month.MAY, 15);
            t.setBirthDate(temp);       
            System.out.print("Enter Address: ");
            t.setAddress(sc.next());
            System.out.print("Enter Major: ");
            t.setMajor(sc.next());
            System.out.print("Enter GPA: ");
            t.setGpa(sc.nextDouble());
            ar[count++]=t;
            System.out.println("");
        }
*/
     

