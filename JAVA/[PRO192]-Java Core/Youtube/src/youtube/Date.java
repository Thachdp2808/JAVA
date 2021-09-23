/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube;

/**
 *
 * @author Dell
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
       this.month=month;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setDate(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public void display(){
       String day = this.day + "";
		String month = this.month + "";
		String year = this.year + "";
		if (day.length() == 1) {
			day = "0" + day;			
		}
		if (month.length() == 1) {
			month = "0" + month;			
		}
		System.out.println(day + "/" + month + "/" + year);
	
    }
}
