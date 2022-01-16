/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class ColorNoodle extends Noodle {
    public String maker;
    public ColorNoodle(){
        
    }
    public ColorNoodle(String name,String maker,double price){
        super(name,price);
        this.maker=maker;
    }
    @Override
    public double getPrice(){
        double newprice=0.0;
        if(super.getName().charAt(0)=='G' || super.getName().charAt(0)=='g'){
            newprice=super.getPrice()+(super.getPrice()*0.1);
        }else{
            newprice= super.getPrice();
        }
        return newprice;
    }
    
    public void setData(){
        Noodle np= new Noodle();
        char c="Y";
        for(int i=0; i<super.getName().length();i++){
            
            char a = super.getName().charAt(2);
        
    }
    @Override
    public String toString(){
        return super.getName()+ " " + maker + " " + super.price;
    }
}
