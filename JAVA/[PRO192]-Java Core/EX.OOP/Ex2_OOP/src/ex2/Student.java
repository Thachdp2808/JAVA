/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Dell
 */
public class Student {
     private int mssv;
    private String name;
    private float dLT;
    private float dTH;
    public Student(){
        
    }
    public Student(int mssv,String name,float dLT, float dTH){
        this.mssv=mssv;
        this.name=name;
        this.dLT=dLT;
        this.dTH=dTH;
    }
    public int getMssv(){
        return mssv;
    }
    public String getName(){
        return name;
    }
    public float getDLT(){
        return dLT;
    }
    public float getDTH(){
        return dTH;
    }
    public void setMssv(int mssv){
        this.mssv=mssv;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDLT(float dLT){
        this.dLT=dLT;
    }
    public void setDTH(float dTH){
        this.dTH=dTH;
    }
   
    public double DTB(){
        return (dLT+dTH)/2;
    }
}
