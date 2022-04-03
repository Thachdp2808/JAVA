/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskManagement;

/**
 *
 * @author MANH HUNG
 */
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception {
        Function m=new Function();
        int a;// a is use as a integer value for menu input case
        m.menu();
        int id = 1;
        ArrayList<Employee> em = new ArrayList<>();
        do{
        a=m.menuInputCase();
        switch(a){
            case 1:
               m.addTask();
               id++;
               break;
            case 2:
               m.deleteTask();
               id--; 
               break;
            case 3:
               m.getDataTasks();
                break; 
            default:
                break;
            }                            
        }while (a!=4);  
    }    
}

