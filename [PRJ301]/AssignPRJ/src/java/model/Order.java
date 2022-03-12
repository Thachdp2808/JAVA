/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Happy-2001
 */
public class Order {
    private int id;
    private int accountId;
    private double totalPrice;
    private String note;
    private String createdDate;
    private int ShippingId;
    public Order(){
        
    }
    public Order( int accountId, double totalPrice, String note, int ShippingId) {
        this.accountId = accountId;
        this.totalPrice = totalPrice;
        this.note = note;
        this.ShippingId = ShippingId;
    }
    public Order(int id, int accountId, double totalPrice, String note, String createdDate, int ShippingId) {
        this.id = id;
        this.accountId = accountId;
        this.totalPrice = totalPrice;
        this.note = note;
        this.createdDate = createdDate;
        this.ShippingId = ShippingId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getShippingId() {
        return ShippingId;
    }

    public void setShippingId(int ShippingId) {
        this.ShippingId = ShippingId;
    }
    
}
