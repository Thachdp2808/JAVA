/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Buta
 */
public class CarList extends ArrayList<Car>{
    BrandList brandList;
    public CarList(BrandList bList) {
        brandList = bList;
    }
    
    public boolean loadFromFile(String filename){
        File f = new File(filename);
        if(f == null){
            return false;
        }else{
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(f);
                int data = fis.read();
                StringBuilder sb = new StringBuilder();
                String c;
                while(data != -1){
                    if(((char)data == '\n') || ((char)data == '\r')){
                        c = sb.toString();
                        String[] s = c.split(",");
                        String carID = s[0];
                        carID = carID.trim();
                        Brand b = new Brand();
                        b = brandList.get(brandList.searchID(s[1].trim()));
                        String color = s[2].trim();
                        String frameID = s[3].trim();
                        String engineID = s[4].trim();
                        
                        Car car = new Car(carID,b,color,frameID,engineID);
                        this.add(car);
                        sb.delete(0, sb.length());
                        data = fis.read();
                    }
                    sb.append((char)data);
                    data = fis.read();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CarList.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CarList.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                try {
                    if(fis != null){
                        fis.close();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return true;
    }
    public boolean saveToFile(String filename){
         DataOutputStream dos=null;
        try {
            dos=new DataOutputStream(new FileOutputStream(filename));
            String data=new String();
            for (int i = 0; i < this.size(); i++) {               
                data+= this.get(i);
            }
            dos.writeBytes(data);   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if(dos!=null){
                    dos.close();
                }
                
            } catch (IOException ex) {
                Logger.getLogger(CarManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true; 
    }
    public int searchID(String carID){
        for (int i = 0; i < this.size() ; i++) {
            if(this.get(i).getCarID().trim().equals(carID)){
                return i;
            }
        }
        return -1;
    }
    public int searchFrame(String fID){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getFrameID().trim().equals(fID)){
                return i;
            }
        }
        return -1;
    }
    public int searchEngine(String eID){
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getEngineID().trim().equals(eID)){
                return i;
            }
        }
        return -1;
    }
    public void addCar(){
        Scanner sc = new Scanner(System.in);
        String carID;
        do {            
            System.out.print("Car ID: ");
            carID = sc.nextLine();
            carID = carID.trim();
            if(searchID(carID) >= 0){
                System.out.println("Car ID is duplicated.");
            }
        } while (searchID(carID) >= 0);
        
        Menu menu = new Menu();
        
        Brand b = (Brand)menu.ref_getChoice(brandList);
        
        String color;
        do {            
            System.out.print("Color: ");
            color = sc.nextLine();
            if(color.isEmpty()){
                System.out.println("The color not be blank.");
            }
        } while (color.isEmpty());
        
        String fID;         
        do {            
            do {     
                do {                    
                    System.out.print("Frame ID(F0000): ");
                    fID = sc.nextLine();
                    fID = fID.trim().toUpperCase();
                } while (fID.isEmpty());
                if(searchFrame(fID) >= 0){
                    System.out.println("Frame ID is duplicated.");
                }
            } while (searchFrame(fID) >= 0);
            
        } while (!fID.matches("[fF][\\d]{5}"));
        
        String eID;          
        do {            
            do {   
                do {                    
                    System.out.print("Engine ID(E0000): ");
                    eID = sc.nextLine();
                    eID = eID.trim().toUpperCase();
                } while (eID.isEmpty());
                if(searchEngine(eID) >= 0){
                    System.out.println("Engine ID is duplicated.");
                }
            } while (searchEngine(eID) >= 0);
            
        } while (!eID.matches("[eE][\\d]{5}"));
        
        Car car = new Car(carID,b,color,fID,eID);
        this.add(car);
        System.out.println("Successful.");
    }
    public void printBasedBrandName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Receive a part of brand name: ");
        String aPartOfBrandName = sc.nextLine();
        aPartOfBrandName = aPartOfBrandName.trim();
        int count = 0;
        for (int i = 0; i < this.size(); i++) {
            Car c = this.get(i);
            if(c.brand.getBrandName().contains(aPartOfBrandName)){
                System.out.println(c.screenString());
                count++;
            }
        }
        if(count == 0){
            System.out.println("No result!");
        }
    }public boolean removeCar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Remove ID: ");
        String removedID = sc.nextLine();
        removedID = removedID.trim();
        if(searchID(removedID) < 0){
            System.out.println("Not found!");
            return false;
        }else{
            this.remove(searchID(removedID));
            
        }
        return true;
    }
    public boolean updateCar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Updated ID: ");
        String updatedID = sc.nextLine();
        updatedID = updatedID.trim();
        if(searchID(updatedID) < 0){
            System.out.println("Not found!");
            return false;
        }else{
            int car = this.searchID(updatedID);
            this.get(car);
            Brand b = (Brand)Menu.ref_getChoice(BrandList);
            this.get(car).setBrand(b);
            
            String color;
            do {            
                System.out.print("Color: ");
                color = sc.nextLine();
                this.get(car).setColor(color);
                if(color.isEmpty()){
                    System.out.println("The color not be blank.");
                }
            } while (color.isEmpty());

        String fID;         
        do {            
            do {     
                do {                    
                    System.out.print("Frame ID(F0000): ");
                    fID = sc.nextLine();
                    fID = fID.trim().toUpperCase();
                    
                } while (fID.isEmpty());
                if(searchFrame(fID) >= 0){
                    System.out.println("Frame ID is duplicated.");
                }
            } while (searchFrame(fID) >= 0);
            this.get(car).setFrameID(fID);
        } while (!fID.matches("[fF][\\d]{5}"));
        
        String eID;          
        do {            
            do {   
                do {                    
                    System.out.print("Engine ID(E0000): ");
                    eID = sc.nextLine();
                    eID = eID.trim().toUpperCase();
                    
                } while (eID.isEmpty());
                if(searchEngine(eID) >= 0){
                    System.out.println("Engine ID is duplicated.");
                }
            } while (searchEngine(eID) >= 0);
            this.get(car).setEngineID(eID);
        } while (!eID.matches("[eE][\\d]{5}"));
               
        }
        return true;
    }
    public void listCars(){
        Car c=new Car();
        
        for (Car car : this) {
            System.out.println(car.screenString());
        }
    }
}
