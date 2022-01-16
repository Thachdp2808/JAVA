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
public class Item {
    private int value;
    private String creator;
    public Item(){
        
    }
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    public int getValue(){
        return value;
    }
    public String getCreator(){
        return creator;
    }
    public void setValue(int value){
        this.value=value;
    }
    public void setCreator(String creator){
        this.creator=creator;
    }
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập value: ");
        value=sc.nextInt();
        System.out.println("Nhập creator: ");
        creator=sc.next();
    }
    public void output(){
        System.out.println("Value: "+value);
        System.out.println("Creator: "+creator);
    }
}
