/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Bus {
    private String bcode;
    private String bus_name;
    private int seat;
    private int booked;
    private double depart_time ;
    private double arrival_time;

    public Bus() {
    }

    public Bus(String bcode, String bus_name, int seat, int booked, double depart_time, double arrival_time) {
        this.bcode = bcode;
        this.bus_name = bus_name;
        this.seat = seat;
        this.booked = booked;
        this.depart_time = depart_time;
        this.arrival_time = arrival_time;
    }

    public String getBcode() {
        return bcode;
    }

    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public double getDepart_time() {
        return depart_time;
    }

    public void setDepart_time(double depart_time) {
        this.depart_time = depart_time;
    }

    public double getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(double arrival_time) {
        this.arrival_time = arrival_time;
    }
    
    
    
    
    
}
