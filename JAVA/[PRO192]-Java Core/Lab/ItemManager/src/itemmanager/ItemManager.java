/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemmanager;

import itemmanager.DTO.Item;
import itemmanager.DTO.Vase;
import itemmanager.DTO.Statue;
import itemmanager.DTO.Painting;
import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class ItemManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1. Create a Vase:");
            System.out.println("2. Create a Statue:");
            System.out.println("3. Create a Painting:");
            System.out.println("4. Display the Item:");
            System.out.println("Input a choice:");
            
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    item = new Vase(); 
                    ((Vase)item).inputVase(); 	
                    break;   
                case 2:
                    item =new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item =new Painting();
	            ((Painting) item).inputPainting();
                    break;
                case 4:
                    if(item!=null){
                        if(item instanceof Vase){
                            ((Vase) item).outputVase();
                        }
                        
                        else if(item instanceof Statue){
                            ((Statue) item).outputStatue ();
                        }
                        
                        else if(item instanceof Painting){
                            ((Painting) item).outputPainting ();  
                        }
                                       
                    }
                    else System.out.println(" you need to create an object");
                    break;        
                    
            }
        }while(choice <= 4);
    }
}
    

