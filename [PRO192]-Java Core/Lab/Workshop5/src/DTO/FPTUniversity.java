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
public class FPTUniversity extends University implements Role {
    String address;

    public FPTUniversity(int size, String name,String address ) {
        super(name, size);
        this.address = address;
    }


    public FPTUniversity() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    @Override
    public String createWorker() {
        return   String.format("providing human resources");
        
    }

    @Override
    public String toString() {
        return "\nFPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
}
