/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carmanager;

/**
 *
 * @author Dell
 */
public class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;
    public Car(){
        
    }
    public Car(String colour,int enginePower,boolean convertible, boolean parkingBrake){
        this.colour=colour;
        this.enginePower=enginePower;
        this.convertible=convertible;
        this.parkingBrake=parkingBrake;
    }
    public String getColour(){
        return colour;
    }
    public int getEnginePower(){
        return enginePower;
    }
    public boolean getConvertible(){
        return convertible;
    }
    public boolean getParkingBrake(){
        return parkingBrake;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public void setEnginePower(int enginePower){
        this.enginePower=enginePower;
    }
    public void setConvertible(boolean convertible){
        this.convertible=convertible;
    }
    public void setParkingBrake(boolean parkingBrake){
        this.parkingBrake=parkingBrake;
    }
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Colour: "+ getColour());
        System.out.println("EnginePower: "+ getEnginePower());
        System.out.println("Convertible: "+ getConvertible());
        System.out.println("ParkingBrake: "+ getParkingBrake());
           
    }
}
