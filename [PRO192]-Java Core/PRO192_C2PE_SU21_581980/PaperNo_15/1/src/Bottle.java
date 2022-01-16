/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Buta
 */
public class Bottle {
    private String maker;
    private int volume;
    public Bottle(){
        
    }
    public Bottle(String maker,int volume){
        this.maker=maker;
        this.volume=volume;
    }
    public String getMaker(){
        return maker.toUpperCase();
    }
    public int getVolume(){
        return volume;
    }
    public void setMaker(String maker){
        this.maker=maker;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
}
