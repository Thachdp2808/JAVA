/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class Validate {
    Scanner sc= new Scanner(System.in);
    public void menu(){
        System.out.println("1.Add task");
        System.out.println("2.Update task");
        System.out.println("3.Delete task");
        System.out.println("4.Display task");
        System.out.println("5.Exit");
    }
    
    //Add
    public static String InputText(String Mess,String regex){
    Scanner sc= new Scanner(System.in);
    String text;
    do{
        System.out.print(Mess);
        text=sc.nextLine();
        if(text.matches(regex))
            break;
        System.out.println("Invalid input, plz enter by following: '"+regex+"'");        
    }while(true);
    return text.trim();
    }
    
    public int InputInt(String Mess,int Min,int Max,String Erro){
    int num;
    do{
        System.out.print(Mess);
        try {
            num=Integer.parseInt(sc.nextLine());
            if(num >= Min && num <= Max){
                break;
            }
            System.out.println(Erro);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, plz input again");
        }
    }while(true);
    return num;
    }
    
    public double InputDoubleToadd(String Mess,double a,double b){
    double numd;
    do{
        System.out.print(Mess);
        try {
            numd=Double.parseDouble(sc.nextLine());
            if(numd> a && numd <=b){
                if(numd%0.5==0){
                    break;
                }   
            }
            System.out.println("Out of the range,plz enter in range:(from "+(a+0.5)+" to "+b+")");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, plz input again");
        }
    }while(true);
    return numd;
    }
    
    public int getLastID(ArrayList<Task> list){
        int lastID;
        if(!list.isEmpty()){
            int lastIndex= list.size()-1;
             lastID=list.get(lastIndex).getId();  
        }else{
             lastID=0;
        }
        return lastID;
    }
    
    
    
    public String InputDateTimeToadd(String Mess, String format){
    SimpleDateFormat SDF= new SimpleDateFormat(format);
    SDF.setLenient(false);
    do{
        System.out.print(Mess);
        String date=sc.nextLine();
        try {
            SDF.parse(date);
            return date;
        } catch (ParseException e) {
            System.out.println("Invalid input,plz Enter by format again: '"+format+"'");
        }
    }while(true);
    
    }
      
    //Update
    public String InputDTUpdate(String Mess,String format) {
    SimpleDateFormat SDF= new SimpleDateFormat(format);
    SDF.setLenient(false);
    do{
        System.out.print(Mess);
        String date= sc.nextLine();
        if(date.equalsIgnoreCase("nope")) return"nope";
        try {
            SDF.parse(date);
            return date;
        } catch (ParseException e) {
            System.out.println("Invalid input,plz Enter by format again: '"+format+"'");
        }
    }while(true);
    }
    
    public String InputDoubleUD(double x, double y,String mess){
        String a;
        do{
            System.out.print(mess);
            a=sc.nextLine();
            if(a.equalsIgnoreCase("Nope"))  return "nope";
            try {
                Double b=Double.parseDouble(a);  
                if(x<=b && b<=y){
                    if(b%0.5==0){
                        break;
                    }
                }
                System.out.println("Input again.");
            } catch (NumberFormatException e) {
                System.err.println("Enter Time From "+x+" -> "+y);
            }
        }while(true);
        return a;
     }
    
    public String InputTypeIDUD(int x, int y){
        String a;
        while(true){
            System.out.print("Input TypeID: ");
            a=sc.nextLine();
            if(a.equalsIgnoreCase("Nope")) return"nope";
            try {
                int b=Integer.parseInt(a);
                if(x<=b && b<=y){
                    break;
                }
                System.out.println("Re-input again.");
            } catch (NumberFormatException e) {
                System.out.println("Please, try again");
            }
        }
        return a;
    }
}

