/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Buta
 */
class CarManager {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] options = {"List all brands.\n",
                        "Add a new brand.\n",
                        "Search a brand based on its ID.\n",
                        "Update a brand.\n",
                        "Save brands to the file, named brands.txt.\n",
                        "List all cars in ascending order of brand names.\n",
                        "List cars based on a part of an input brand name.\n",
                        "Add a car.\n",
                        "Remove a car based on its ID.\n",
                        "Update a car based on its ID.\n",
                        "Save cars to file, named cars.txt.\n"};
        
        BrandList brandList = new BrandList();
        boolean a=brandList.loadFromFile("brands.txt");
        CarList carList = new CarList(brandList);
        boolean b=carList.loadFromFile("cars.txt");
        int choice = 0;
        do {       
            choice = Menu.int_getChoice(options);
            switch(choice){
                case 1: 
                    if(a==true){
                        brandList.listBrands();
                    } 
                    break;
                case 2:
                    brandList.addBrand();
                    break;
                case 3:
                    System.out.print("Search brand ID: ");
                    int x = brandList.searchID(sc.nextLine());
                    if(x == -1){
                        System.out.println("Not found!\n");
                    }else{
                        System.out.println(brandList.get(x));
                    } 
                  break;
                case 4:
                    brandList.updateBrand();
                    break;
                case 5:
                    boolean s=brandList.saveToFile("brands.txt");
                    if(s==true){
                        System.out.println("File save successful.");
                    }
                    break;
                case 6:
                    if(b==true){
                        carList.listCars();
                    } 
                    break;   
                case 7 :
                    carList.printBasedBrandName();
                    break;
                case 8:
                    carList.addCar();
                    break;
                case 9:
                    boolean k=carList.removeCar();
                    if(k==true){
                        System.out.println("Remove Successful.");
                    }
                    break;
                case 10:          
                    boolean m=carList.updateCar();
                    if(m==true){
                        System.out.println("Update Successful.");
                    }
                    break;
                case 11:
                    boolean p=carList.saveToFile("cars.txt");
                    if(p==true){
                        System.out.println("File save successful.");
                    }
                    break;
                default:
                    System.out.println("GOODBYE");
                    break;
                    
            }
        } while (choice > 0 && choice <= options.length);
    }
    
}
