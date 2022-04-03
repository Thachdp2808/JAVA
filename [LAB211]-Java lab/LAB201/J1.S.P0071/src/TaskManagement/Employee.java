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
public class Employee {

    String TaskTypeID, RequirementName, Date, Assignee, Expert;
    double from, to;
    int id;

    public Employee(String TaskTypeID, String RequirementName, String Date, String Assignee, String Expert, double from, double to, int id) {
        this.TaskTypeID = TaskTypeID;
        this.RequirementName = RequirementName;
        this.Date = Date;
        this.Assignee = Assignee;
        this.Expert = Expert;
        this.from = from;
        this.to = to;
        this.id = id;
    }

    public String getTaskTypeID() {
        return TaskTypeID;
    }

    public void setTaskTypeID(String TaskTypeID) {
        this.TaskTypeID = TaskTypeID;
    }

    public String getRequirementName() {
        return RequirementName;
    }

    public void setRequirementName(String RequirementName) {
        this.RequirementName = RequirementName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssign(String Assignee) {
        this.Assignee = Assignee;
    }

    public String getExpert() {
        return Expert;
    }

    public void setExpert(String Expert) {
        this.Expert = Expert;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "TaskTypeID=" + TaskTypeID + ", RequirementName=" + RequirementName + ", Date=" + Date + ", Assign=" + Assignee + ", Expert=" + Expert + ", planFrom=" + from + ", planTo=" + to + ", id=" + id + '}';
    }

}
