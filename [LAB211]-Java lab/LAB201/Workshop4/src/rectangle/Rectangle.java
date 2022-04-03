/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author PV
 */
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    Float width;
    Float height;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the height: ");
        height = Float.parseFloat(sc.nextLine());

    }

    void display() {
        System.out.println("height and width: " + height + " - " + width);
    }

    void calculateArea() {
        System.out.println("The area of the rectangle: " + height * width);
    }

    void calculatePerimeter() {
        System.out.println("The perimeter of the rectangle: " + 2 * (height + width));
    }
}