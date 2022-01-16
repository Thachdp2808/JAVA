/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alias
 */
public class VNMotor extends Motor{
   private String  series;
    public VNMotor() {
    }
    public VNMotor(String brandName,String series,double price) {
        super(brandName,price);
        this.series=series;
    }
    public double getSalePrice(){
        double sale=0;
        if(super.getPrice()<3000){
            sale=super.getPrice() - (super.getPrice()*0.05);
        }else{
            sale=super.getPrice() -(super.getPrice()*0.1);
        }
        return sale;
    }
   @Override
    public String toString(){
        return super.getBrandName() + "\t" + series + "\t" + super.getPrice();
    }

    
    
    
    
}
