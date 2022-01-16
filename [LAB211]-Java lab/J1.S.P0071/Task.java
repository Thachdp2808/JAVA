/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Buta
 */
public class Task {
    private int id;
    private String name;
    private int typeID;
    private String date;
    private double from;
    private double to;
    private String assignee;
    private String reviewer;

    public Task() {
        
    }

    public Task(int id, String name, int typeID, String date, double from, double to, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.typeID = typeID;
        this.date=date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public void setdate(String date){
        this.date=date;
    }
    
    public String getdate(){
        return date;
    }
    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    public String typeName(){
        switch(typeID){
            case 1:
                return "Code";
            case 2:
                return "Test";
            case 3:
                return "Design";
            case 4:
                return "Review";      
        }
        return null;
    }
    @Override
    public String toString(){
        SimpleDateFormat SDF= new SimpleDateFormat("MMMM-dd-yyyy");
        Date Date1 = null;
        try {
            Date1 = SDF.parse(date);
        } catch (ParseException ex) {
            System.out.println("Erro");
        }
        SimpleDateFormat SDF1= new SimpleDateFormat("dd-MMMM-yyyy");
        String Date2 = SDF1.format(Date1);
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s",id,name,typeName(),Date2,(to-from),assignee,reviewer);
    }
    
}
   
           
           
           
