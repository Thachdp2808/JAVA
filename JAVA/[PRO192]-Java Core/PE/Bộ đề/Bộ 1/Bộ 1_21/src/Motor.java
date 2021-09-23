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
    public Motor() {
    }
                //String brandName, double price

    public Motor(String brandName, double price) {
        this.brandName = brandName;
        this.price = price;
    }

    public String getBrandName() {
        brandName = brandName.toLowerCase();
        brandName = brandName.replace(brandName.charAt(0),
                       Character.toUpperCase(brandName.charAt(0)));
        Character.toUpperCase(brandName.charAt(0));//ki tu dau tien viet hoa
        for (int i = 0; i < brandName.length(); i++) {
            if(brandName.charAt(i)==' '){
                
               brandName = brandName.replace(brandName.charAt(i+1),
                       Character.toUpperCase(brandName.charAt(i+1)));
            }
        }  
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brandName+"\t"+price;
    }
    
    
    
}
