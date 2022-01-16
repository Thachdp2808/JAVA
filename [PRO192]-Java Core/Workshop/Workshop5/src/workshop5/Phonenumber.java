/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop5;

/**
 *
 * @author Dell
 */
public class Phonenumber {
    private int area;
    private String number;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    /**
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    public Phonenumber() {
    }

    public Phonenumber(int area, String number) {
        this.area = area;
        this.number = number;
    }
}
