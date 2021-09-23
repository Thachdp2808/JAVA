/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alias
 */
public class Motor {
    private String brandName;
    private double price;
    
    public Motor(){
        
    }
    

    public Motor(String brandName, double price) {
        this.brandName=brandName;
        this.price=price;
    }
    public String getBrandName(){
        return brandName;
    }
    public double getPrice(){
        return price;
    }
    public void setBrandName(String brandName){
        this.brandName=brandName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return brandName + "\t" + price;
    }

    
    
    
    
}
