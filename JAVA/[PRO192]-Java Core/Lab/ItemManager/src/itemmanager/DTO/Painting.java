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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;
    public Painting(){
        
    }
    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public boolean getIsWatercolour(){
        return isWatercolour;
    }
    public boolean getIsFramed(){
        return isFramed;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setIsWatercolour(boolean isWatercolour){
        this.isWatercolour=isWatercolour;
    }
    public void setIsFramed(boolean isFramed){
        this.isFramed=isFramed;
    }
    public void inputPainting(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập height: ");
        height=sc.nextInt();
        System.out.println("Nhập width: ");
        width=sc.nextInt();
        System.out.println("IsWatercolour(Yes or No): ");
        isWatercolour=sc.hasNextBoolean();
        System.out.println("IsFramed(Yes or No): ");
        isFramed=sc.hasNextBoolean();
    }
    public void outputPainting(){
        super.output();
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("IsWatercolour: "+isWatercolour);
        System.out.println("IsFramed: "+isFramed);
    }
}
    
