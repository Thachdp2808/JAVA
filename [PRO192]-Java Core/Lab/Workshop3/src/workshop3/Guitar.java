/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

/**
 *
 * @author Buta
 */
public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    public Guitar(){
        
    }
    public Guitar(String serialNumber, int price, String biulder, String model, String backWood, String topwood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    public String getSerialNumber(){
        return serialNumber;
    }
    public int getPrice(){
        return price;
    }
    public String getBuilder(){
        return builder;
    }
    public String getModel(){
        return model;
    }
    public String getBackWood(){
        return backWood;
    }
    public String getTopWood(){
        return topWood;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber=serialNumber;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setBuilder(String builder){
        this.builder=builder;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setBackWood(String backWood){
        this.backWood=backWood;
    }
    public void setTopWood(String topWood){
        this.topWood=topWood;
    }
    public void createSound(){
        System.out.println("serialNumber: "+serialNumber);
        System.out.println("price: "+price);
        System.out.println("builder: "+builder);
        System.out.println("model: "+model);
        System.out.println("backWood: "+backWood);
        System.out.println("topWood: "+topWood);
    }
    
}
