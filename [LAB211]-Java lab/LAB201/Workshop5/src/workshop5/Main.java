/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5;

import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Phonenumber[] phonelist = new Phonenumber[1000];
        IntPhonenumber[] intphonelist = new IntPhonenumber[1000];
        int listsize1 = 0;
        int listsize2 = 0;
        int flag=0;

        while (true) {
            Phonenumber p = new Phonenumber();
            IntPhonenumber ip = new IntPhonenumber();
            System.out.println("Type of phone number ? (1 – local phone, 2 – Inter phone number, 0 - exit):  ");
            flag = sc.nextInt();
            if (flag > 2 || flag < 0) {
                break;
            } else {
                switch (flag) {
                    case 0:
                        for (int i = 0; i < listsize1; ++i) {
                            System.out.println(phonelist[i].getArea() + " - " + phonelist[i].getNumber());
                        }
                        for (int i = 0; i < listsize2; ++i) {
                            System.out.println(intphonelist[i].getCountryCode() + " - " + intphonelist[i].getArea() + " - " + intphonelist[i].getNumber());
                        }
                        break;
                    case 1:

                        System.out.print("Enter area code: ");
                        int code = sc.nextInt();
                        System.out.print("Enter number: ");
                        String num = sc.next();
                        p.setArea(code);
                        p.setNumber(num);
                        phonelist[listsize1++] = p;
                        break;
                    case 2:

                        System.out.print("Enter country code: ");
                        String country = sc.next();
                        System.out.print("Enter area code: ");
                        int areacode = sc.nextInt();
                        System.out.print("Enter number: ");
                        String number = sc.next();
                        ip.setCountryCode(country);
                        ip.setArea(areacode);
                        ip.setNumber(number);
                        intphonelist[listsize2++] = ip;
                        break;

                }
            }
            if (flag == 0) {
                break;
            }

        }
    }
}
