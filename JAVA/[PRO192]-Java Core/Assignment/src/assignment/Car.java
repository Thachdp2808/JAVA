/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class Car {
    private String carID;
    Brand brand;
    private String color;
    private String frameID;
    private String engineID;
    String frID="[F][0-9][0-9][0-9][0-9][0-9]";
    String enID="[E][0-9][0-9][0-9][0-9][0-9]";
    public Car(){
        
    }
    public Car(String carID, Brand brand, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brand = brand;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }
    public String getCarID(){
        return carID;
    }
    public Brand getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public String getFrameID(){
        return frameID;
    }
    public String getEngineID(){
        return engineID;
    }
    public void setCarID(String carID){
        this.carID=carID;
    }
    public void setBrand(Brand brand){
        this.brand=brand;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFrameID(String frameID){
        this.frameID=frameID;
    }
    public void setEngineID(String engineID){
        this.engineID=engineID;
    }
    
    @Override
    public String toString(){
        Brand brands=new Brand();
        return carID + ", " + brands.getBrandID() + ", " + color + ", " + frameID
              + ", " + engineID;
    }
    public String screenString(){
        Car car= new Car();
        return brand+"\n"+carID+", "+color+", "+frameID+", "+engineID;
    }
    public void hienthi(){
        Brand brands=new Brand();
        System.out.println(carID + ", " + brands.getBrandID() + ", " + color + ", " + frameID
              + ", " + engineID);
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập CarID: ");
        carID=sc.next();
        System.out.print("Nhập Color: ");
        color=sc.next();
         boolean k=true;
        do{
        System.out.print("Nhập FrameID: ");
        frameID=sc.next();
        }while(checkFrame(k));
        boolean l=true;
        do{
        System.out.print("Nhập EngineID: ");
        engineID=sc.next();
        }while(checkEngineID(l));
    }
    public boolean checkFrame(boolean k){
        if(frameID.matches(frID)){
            k=false;
        }else{
            System.out.println("Nhập FrameID:'F00000'");
        }
        return k;
    }
    public boolean checkEngineID(boolean l){
        if(engineID.matches(enID)){
            l=false;
        }else{
            System.out.println("Nhập EngineID:'E00000'");
        }
        return l;
    }
    
 
            
            
            
}
