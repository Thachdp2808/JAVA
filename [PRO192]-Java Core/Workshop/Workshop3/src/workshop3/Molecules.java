/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop3;

/**
 *
 * @author Dell
 */
public class Molecules {
    private String structure;
    private String name;
    private Float weight;
    
    public void input(String structure, String name, Float weight){
        this.structure=structure;
        this.name = name;
        this.weight = weight;
    }
    
    public void display(){
         System.out.println(structure + " " + name + " " + weight);
    }
}
