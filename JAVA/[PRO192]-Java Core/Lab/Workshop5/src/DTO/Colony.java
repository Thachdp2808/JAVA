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
public class Colony extends Organization {
    String place;
    String type;

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    

    public Colony() {
    }

    public void setType(String type) {
        System.out.println("type(land/ocean)");
        this.type = type;
    }

    public String getType() {
        return type;
    }
    

    @Override
    void communicateByTool() {
        System.out.println("the colony communicate by sound");
        
    }
    public void grow(){
       System.out.println("an annual cycle of growth that begins in spring"); 
       
    }
    public void reproduce(){
        System.out.println("Colony can reproduce itself through a process");
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return String.format("\nthe colony size is\n" + super.size+"\nthe colony’s place is"+this.place);
    }
}
