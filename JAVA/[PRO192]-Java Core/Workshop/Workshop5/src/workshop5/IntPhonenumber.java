/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class IntPhonenumber extends Phonenumber {
    private String countryCode;

    public IntPhonenumber() {
    }

    public IntPhonenumber(String countryCode, int area, String number) {
        super(area,number);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
 /*public int checkInput() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                System.out.println("Enter number of array: ");
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Must be positive number");
                }
            } catch (Exception e) {
                System.out.println("Must be input number");
            }
        }
        return n;
    }
}
