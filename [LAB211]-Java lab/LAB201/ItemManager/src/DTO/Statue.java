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
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void outputStatue() {
        System.out.println("Value: " + value + " Creator: " + creator);
        System.out.println("weight:" + weight);
        System.out.println("colour:" + colour);
    }
    public void inputStatue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight: ");
        weight = sc.nextInt();
        System.out.print("Enter colour: ");
        colour = sc.next();
        System.out.print("Enter value: ");
        value = sc.nextInt();
        System.out.println("Enter creator: ");
        creator = sc.next();

    }
}