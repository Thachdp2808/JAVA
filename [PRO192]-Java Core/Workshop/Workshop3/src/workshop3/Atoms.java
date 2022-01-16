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
public class Atoms {
    private int number;
    private String symbol;
    private String fullname;
    private Float weight;
    
    public void Atoms(int number, String symbol, String fullname, Float weight){
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this. weight = weight;
    }
    
    public void display(){
        System.out.println(number + " " + symbol + " " + fullname + " " + weight);
    }
}
    
