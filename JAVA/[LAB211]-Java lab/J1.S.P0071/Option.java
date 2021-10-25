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
public class Option {
    Scanner sc = new Scanner(System.in);
    public void showarr(ArrayList<Task> list){
        Task t = new Task();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", 
                "ID", "Name", "Task type", "Date", "Time", "Assignee", "Reviewer");
        for(Task o :list){
            System.out.println(o);
        }
    }
    public void addTask(ArrayList<Task> list){
        Validate v=new Validate();
        int id= v.getIDtoadd(list);
        String name= Validate.InputText("Input Name: ",  "[a-zA-z ]+");
        int typeid= v.InputInt("Input TypeID: ", 1, 4,"Out of the range,plz enter in range:(from "+1+" to "+4+")");
        String date=v.InputDateTimeToadd("Input Date: ","MMMM-dd-yyyy");
        Double from= v.InputDoubleToadd("Input From: ",7.5,17);
        Double to= v.InputDoubleToadd("Input To: ",from,17.5);
        String assign= Validate.InputText("Input Assignee: ", "[a-zA-z ]+");
        String review= Validate.InputText("Input Reviewer: ", "[a-zA-z ]+");
        Task t=new Task(id,name,typeid,date,from,to,assign,review);
        System.out.println("Add an task successful");
        list.add(t);
    }
    public void updateTask(ArrayList<Task> list) throws ParseException{
        Validate v=new Validate();
        Task t= new Task();
        int id=v.InputInt("Enter ID: ",1 ,v.LastID(list),"Code does not exit.");
        for(int j=0; j <list.size();j++){
            if(id==list.get(j).getId()){
                double from = 0,  to = 0;
                //Name
                String name= Validate.InputText("Input Name: ", "[a-zA-z ]+");
                if(name.equalsIgnoreCase("nope")){
                    list.get(j).getName();
                }else{
                     list.get(j).setName(name);
                }
                
                //TypeID
                String typeID=v.InputTypeIDUD(1, 4);
                if(!typeID.equalsIgnoreCase("T")){
                    int temp=Integer.parseInt(typeID);
                    list.get(j).setTypeID(temp);
                }else{
                    list.get(j).getTypeID();
                }
                

                //Date
                String date = v.InputDTUpdate("Input Date: ", "MMMM-dd-yyyy");
                if(!date.equalsIgnoreCase("T")){
                    list.get(j).setdate(date);
                }else{
                    list.get(j).getdate();
                }
                //From
                String fromUD = v.InputDoubleUD(8.0, 17.0, "Input From: ");
                if(!fromUD.equalsIgnoreCase("T")){
                    from=Double.parseDouble(fromUD);
                    list.get(j).setFrom(from);
                }else{
                    list.get(j).getFrom();
                }
                
                //To
                while(true){
                    String ToUD = v.InputDoubleUD(from, 17.5, "Input To: ");
                    if(!ToUD.equalsIgnoreCase("T")){
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
                if(assign.equalsIgnoreCase("nope")){
                    list.get(j).getAssignee();
                }else{
                    list.get(j).setAssignee(assign);
                }
                
                
                //Reviewer
                String review= Validate.InputText("Input Reviewer: ", "[a-zA-z ]+");
                if(assign.equals("nope")){
                    list.get(j).getReviewer();
                }else{
                    list.get(j).setReviewer(review);
                }
                System.out.println("Update an task successful");
                break;
            }
        }  
    }
    
    public void delete(ArrayList<Task> list){
        Validate v=new Validate();
        int id=v.InputInt("Enter ID: ",1 ,v.LastID(list),"Code does not exit");
        for(int j=1; j <list.size();j++){
            if(id==list.get(j).getId()){
                list.remove(j);      
                System.out.println("Deleted an task successful");
                break;
                }
            }
        }
    
}
