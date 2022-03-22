/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Happy-2001
 */
@Builder
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String description;
    private String imageURL;
    private String createdDate;
    private int categoryid;
    private String suppliers;
    public Product(){
        
    }
//public Product( String name, int quantity, double price, String description, String imageURL, String createdDate, int categoryid) {
//
//        this.name = name;
//        this.quantity = quantity;
//        this.price = price;
//        this.description = description;
//        this.imageURL = imageURL;
//        this.createdDate = createdDate;
//}
    public Product(int id, String name, int quantity, double price, String description, String imageURL, String createdDate, int categoryid) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.imageURL = imageURL;
        this.createdDate = createdDate;
        this.categoryid = categoryid;
    }
    public Product(int id, String name, int quantity, double price, String description, String imageURL, String createdDate, int categoryid,String suppliers) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.imageURL = imageURL;
        this.createdDate = createdDate;
        this.categoryid = categoryid;
        this.suppliers=suppliers;
    }
    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String suppliers) {
        this.suppliers = suppliers;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", description=" + description + ", imageURL=" + imageURL + ", createdDate=" + createdDate + ", categoryid=" + categoryid + '}';
    }
    
    
}
