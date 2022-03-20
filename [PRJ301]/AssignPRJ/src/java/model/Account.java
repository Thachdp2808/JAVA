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
public class Account {
    private int id;
    private String name;
    private String password;
    private String displayname;
    private String address;
    private String email;
    private int phone;
    public int rollid;

    public Account() {
    }
    
    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public Account(String name, String password, String displayname, String address, String email, int phone) {
        this.name = name;
        this.password = password;
        this.displayname = displayname;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public int getRollid() {
        return rollid;
    }

    public void setRollid(int rollid) {
        this.rollid = rollid;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
