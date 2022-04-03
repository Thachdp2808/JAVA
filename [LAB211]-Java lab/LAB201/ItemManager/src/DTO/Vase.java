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
public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void outputVase() {
        System.out.println("Value: " + value + " Creator: " + creator);
        System.out.println("Height:" + height);
        System.out.println("Material:" + material);
    }

    public void inputVase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter material: ");
        material = sc.next();
        System.out.print("Enter value: ");
        value = sc.nextInt();
        System.out.println("Enter creator: ");
        creator = sc.next();

    }
}