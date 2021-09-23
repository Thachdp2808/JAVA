/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Buta
 */
public class BeeColony extends Colony implements Role {
    String honey;

    public BeeColony() {
    }

    public BeeColony(int size,String honey, String place) {
        super(place, size);
        this.honey = honey;
    }

  

    @Override
    public String getType() {
        return type;
    }

    public String getHoney() {
        return honey;
    }

    public void setHoney(String honey) {
        this.honey = honey;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    
    

    @Override
    public String toString() {
        return String.format( "\nthe colony’s type is: " + this.honey+ "\nsize is about: " + super.size + "\nand the place is:" + super.place );
    }

    
    @Override
    public String createWorker() {
        return String.format("\nWorker bees perform all the work of the bees");
    }
}
