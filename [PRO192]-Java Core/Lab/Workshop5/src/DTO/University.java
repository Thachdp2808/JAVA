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
public class University extends Organization {
    String name;


    public University(String name, int size) {
        super(size);
        this.name = name;
    }

    public University() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @Override
    void communicateByTool() {
        System.out.println("in the university, people communicate by voice");
         
    }
    public void enroll(){
        System.out.println("\nThe registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    public void educate(){
        System.out.println("\nprovide education at university standard");
    }

    @Override
    public String toString() {
        return String.format("\nencourage the advancement and development of knowledge");
    }
}
