/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Buta
 */
public class Brand {
    private String brandID;
    private String brandname;
    private String soundBrand;
    private double price;
    public Brand(){
        
    }

    public Brand(String brandID, String brandname, String soundBrand, double price) {
        this.brandID = brandID;
        this.brandname = brandname;
        this.soundBrand = soundBrand;
        this.price = price;
    }
    public String getBrandID(){
        return brandID;
    }
    public String getBrandName(){
        return brandname;
    }
    public String getSoundbrand(){
        return soundBrand;
    }
    public double getPrice(){
        return price;
    }
    
    public void setBrandID(String brandID){
        this.brandID=brandID;
    }
    public void setBrandname(String brandname){
        this.brandname=brandname;
    }
    public void setSoundBrand(String soundBrand){
        this.soundBrand=soundBrand;
    }
    public void setPrice(double price){
        this.price=price;
    }
    @Override
    public String toString(){
        return brandID + ", " + brandname + ", " + soundBrand
             + ", " + price;
    }
    public void hienthi(){
        System.out.println(brandID + ", " + brandname + ", " + soundBrand
             + ", " + price);
    }
    
    
}
