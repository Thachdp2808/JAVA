/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author MANH HUNG
 */
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void outputPainting() {
        System.out.println("Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + '}' + "Value: " + value + " Creator: " + creator);
    }

   
    
    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter width: ");
        width = sc.nextInt();
        System.out.print("Enter isWatercolour: ");
        isWatercolour = sc.nextBoolean();
        System.out.println("Enter isFramed: ");
        isFramed = sc.nextBoolean();
        System.out.print("Enter value: ");
        value = sc.nextInt();
        System.out.println("Enter creator: ");
        creator = sc.next();
    }
}