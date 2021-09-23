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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Buta
 */
public class BrandList extends ArrayList<Brand> {
    ArrayList<Brand> br=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void addBrand(){
        
            String id;
            do{
                System.out.print("Nhập ID: ");
                 id=sc.nextLine().trim();
                if(searchID(id)>0){
                    System.out.println("ID is dupicated");
                }
            }while(searchID(id)>0);
            String brandname;
            do{
                System.out.print("Nhập Brandname: ");
                brandname=sc.nextLine();
                if(brandname.isEmpty()){
                    System.out.println("Brandname is not blank");
                }
            }while(brandname.isEmpty());
            String soundBrand;
            do{
                System.out.println("Nhập Soundbrand: ");
                soundBrand=sc.nextLine();
                if(soundBrand.isEmpty()){
                    System.out.println("SoundBrand is not blank");
                }
            }while(soundBrand.isEmpty());
            int price;
            do{
                System.out.println("Nhập Price: ");
                price=sc.nextInt();
                if(price<0 ){
                    System.out.println("Nhập price > 0");
                }
            }while(price<0);
            Brand brand = new Brand(id,brandname,soundBrand,price);
            br.add(brand);
        
    }
    public void updateBrand(){
        
        System.out.print("Receive brand ID: ");
        String brandID = sc.nextLine();
        brandID = brandID.trim();
        if(searchID(brandID) < 0){
            System.out.println("Not found!");
        }else{
            int b = this.searchID(brandID);
            this.get(b);
            String brandName;
            do{
                System.out.print("Brand name: ");
                brandName = sc.nextLine();
                this.get(b).setBrandname(brandName);
                if(brandName.isEmpty()){
                    System.out.println("The brand name is not blank.");
                }
            }while(brandName.isEmpty());

            String soundBrand;
            do{
                System.out.print("Sound brand: ");
                soundBrand = sc.nextLine();
                this.get(b).setSoundBrand(soundBrand);
                if(soundBrand.isEmpty()){
                    System.out.println("The ound brand is not blank.");
                }
            }while(soundBrand.isEmpty());
            double price;
            do {            
                System.out.print("Price: ");
                price = sc.nextDouble();
                this.get(b).setPrice(price);
                if(price < 0){
                    System.out.println("Price > 0.");
                }
            } while(price < 0);

            System.out.println("Brand new has been updated");
        }
    }
    
    public void listBrands(){
        for(int i=0;i<br.size();i++){
            br.get(i).hienthi();
        }
    }
    public int searchID(String bID){
        int count=0;
        for(int i=0;i<br.size();i++){
            if(br.get(i).getBrandID().equals(bID))
                br.get(i).hienthi();
            return 1;
        }
        return -1;
        
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
            while (data != -1) {
                if (((char) data == '\n') || ((char) data == '\r')) {
                    c = sb.toString();
                    String[] s = c.split(",");
                    String brandID = s[0].trim();
                    String brandName = s[1].trim(); 
                    String[] s1 = s[2].split(":");
                    String soundBrand=s1[0].trim();            
                    double price = Double.parseDouble(s1[1].trim());
                    Brand b = new Brand(brandID,brandName,soundBrand,price);
                    this.add(b);
                    sb.delete(0, sb.length());
                    data = fis.read();
                }
                sb.append((char) data);
                data = fis.read();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BrandList.class.getName()).log(Level.SEVERE, null, ex);
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
    public Brand getUserChoice(){
        Menu mnu = new Menu();
        return (Brand)mnu.ref_getChoice(this);
    }

    
    
}
