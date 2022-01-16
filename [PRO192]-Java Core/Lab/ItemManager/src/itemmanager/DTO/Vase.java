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
public class Vase extends Item{
    private int height;
    private String material;
    public Vase(){
        
    }
    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }
    public int getHeight(){
        return height;
    }
    public String getMaterial(){
        return material;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setMaterial(String material){
        this.material=material;
    }
    public void outputVase(){
        super.input();
        System.out.println("Height: "+height);
        System.out.println("Material: "+material);
    }
    public void inputVase(){
        super.output();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập height: ");
        height=sc.nextInt();
        System.out.println("Nhập Material: ");
        material=sc.next();
    }
}
