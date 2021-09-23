/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

/**
 *
 * @author Buta
 */
public class Tester {
     public static void main(String[] args) {
        System.out.println("=================================");
        Colony obj1=new BeeColony(2000,"honey","land");
        System.out.println(obj1);
        obj1.grow();
        obj1. reproduce();
        

        System.out.println("=================================");
        University obj2=new FPTUniversity(100000,"FPT","Cantho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        System.out.println("=================================");
        Role r= new BeeColony(3000,"wasp","land");
        System.out.println(r);
        System.out.println(r.createWorker());
    
        System.out.println("=================================");
        r = new FPTUniversity(100000,"Hanoi","FPT");
        System.out.println(r);
        System.out.println(r.createWorker());
            
          
            
   }
}
