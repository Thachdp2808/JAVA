/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Buta
 */
public class main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<Task> list = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        list.add(new Task(1,"TH",2,"December-12-2021",10.0,12.0,"lead","lead"));
        Validate v= new Validate();
        Option o= new Option();
        Task t= new Task();
        while(true){
            v.menu();
            int choice= v.InputInt("Input your choice: ", 1, 5,"Out of the range,plz enter in range:(from "+1+" to "+5+")");
            switch(choice){
                case 1:
                    o.addTask(list);
                    break;
                case 2:
                    o.updateTask(list);
                    break;
                case 3:
                    o.delete(list);
                    break;
                case 4:
                    o.showarr(list);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
        
    }
    
}
