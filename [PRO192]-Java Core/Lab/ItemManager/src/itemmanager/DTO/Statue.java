/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemmanager.DTO;

import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class Statue extends Item{
    private int weight;
    private String colour;
    public Statue(){
        
    }
    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }
    public int getWeight(){
        return weight;
    }
    public String getColour(){
        return colour;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public void inputStatue(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập weight: ");
        weight=sc.nextInt();
        System.out.println("Nhập colour: ");
        colour=sc.next();
    }
    public void outputStatue(){
        super.output();
        System.out.println("Weight: "+weight);
        System.out.println("Colour: "+colour);
    }
}
