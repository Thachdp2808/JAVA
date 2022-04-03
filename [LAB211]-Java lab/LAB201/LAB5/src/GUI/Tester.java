/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.BeeColony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

/**
 *
 * @author MANH HUNG
 */
public class Tester {

    public static void main(String[] args) {
     BeeColony obj1 = new BeeColony(2000, "honey", "land");

        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();

        University obj2 = new FPTUniversity(100000, "Cantho", "FPT" );
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();

        Role df = new BeeColony(3000, "wasp", "land");
        System.out.println(df);
        df.createWorker();

        df = new FPTUniversity(100000, "Hanoi", "FPT");
        System.out.println(df);
        df.createWorker();

    }

}