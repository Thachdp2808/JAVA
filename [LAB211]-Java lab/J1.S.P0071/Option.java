/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author Buta
 */
public class Option {
    Scanner sc = new Scanner(System.in);
    
    public void addTask(ArrayList<Task> list){
        Validate v=new Validate();
        String date;
        int id= v.getLastID(list)+1;
        String name= Validate.InputText("Input Name: ",  "[a-zA-z ]+");
        int typeid= v.InputInt("Input TypeID: ", 1, 4,"Out of the range,plz enter in range:(from "+1+" to "+4+")");
        date=v.InputDateTimeToadd("Input date: ", "MMMM-dd-yyyy");
        Double from= v.InputDoubleToadd("Input From: ",7.5,17);
        Double to= v.InputDoubleToadd("Input To: ",from,17.5);
        String assign= Validate.InputText("Input Assignee: ", "[a-zA-z ]+");
        String review= Validate.InputText("Input Reviewer: ", "[a-zA-z ]+");
        Task t=new Task(id,name,typeid,date,from,to,assign,review);
        System.out.println("Add an task successful");
        list.add(t);
    }
    
    public void updateTask(ArrayList<Task> list){
        Validate v=new Validate();
        Task t= new Task();
        if(!list.isEmpty()){
            int id=v.InputInt("Enter ID: ",1 ,v.getLastID(list),"Code does not exit.");
        for(int j=0; j <list.size();j++){
            if(id==list.get(j).getId()){
                double from = 0,  to = 0;
                //Name
                String name= Validate.InputText("Input Name: ", "[a-zA-z ]+");
                if(!name.equalsIgnoreCase("nope")){
                    list.get(j).setName(name);
                }
                                
                //TypeID
                String typeID=v.InputTypeIDUD(1, 4);
                if(!typeID.equalsIgnoreCase("nope")){
                    int temp=Integer.parseInt(typeID);
                    list.get(j).setTypeID(temp);
                }
                
                //Date
                String date = v.InputDTUpdate("Input Date: ", "MMMM-dd-yyyy");
                if(!date.equalsIgnoreCase("nope")){
                    list.get(j).setdate(date);
                }
                
                //From
                String fromUD = v.InputDoubleUD(8.0, 17.0, "Input From: ");
                if(!fromUD.equalsIgnoreCase("nope")){
                    from=Double.parseDouble(fromUD);
                    list.get(j).setFrom(from);
                }
                
                //To
                while(true){
                    String ToUD = v.InputDoubleUD(from, 17.5, "Input To: ");
                    if(!ToUD.equalsIgnoreCase("nope")){
                        Double To=Double.parseDouble(ToUD);
                        if(To>list.get(j).getFrom()){
                            list.get(j).setTo(To);
                            break;
                        }
                        
                    }else{
                        if(list.get(j).getTo()>from){
                           break;
                        }  
                    }
                }

                //Assignee
                String assign= Validate.InputText("Input Assignee: ", "[a-zA-z ]+");
                if(!assign.equalsIgnoreCase("nope")){
                    list.get(j).setAssignee(assign);
                }
                
                //Reviewer
                String review= Validate.InputText("Input Reviewer: ", "[a-zA-z ]+");
                if(!assign.equalsIgnoreCase("nope")){
                    list.get(j).setReviewer(review);
                }
                System.out.println("Update an task successful");
                break;   
            }
               
        }
            
        }else{
            System.out.println("List is Empty");
        }        
          
    }
    
    public void delete(ArrayList<Task> list){
        Validate v=new Validate();
        if(!list.isEmpty()){
            int id=v.InputInt("Enter ID: ", 1 ,v.getLastID(list),"Code does not exit");
            int check = checkID(id,list);
            if(check!=-1){
                list.remove(check);
                System.out.println("Delete successfull");
            }else{
                System.out.println("Input again");
            }
        }else{
            System.out.println("List is Empty");
        }
       
    }
    
    public void showarr(ArrayList<Task> list){
        Task t = new Task();
        if(!list.isEmpty()){
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", 
                "ID", "Name", "Task type", "Date", "Time", "Assignee", "Reviewer");
           Collections.sort(list, (Task t1, Task t2) -> {
                if (t1.getId() < t2.getId()) {
                    return 1;
                } else {
                    if (t1.getId() > t2.getId()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
            for(Task o :list){
                System.out.println(o);
            }
        }else{
            System.out.println("List is empty");
        }
    }
    
    public int checkID(int id, ArrayList<Task> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
