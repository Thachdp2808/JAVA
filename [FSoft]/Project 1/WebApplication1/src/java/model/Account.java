/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nguye
 */
public class Account {
    int account_id;
    String account;
    String email;
    String password;
    int status;
    int employee_id;
    public Account(){
        
    }

    public Account(String account, String email, String password, int status) {
        this.account = account;
        this.email = email;
        this.password = password;
        this.status = status;
    }
    
    
    public Account(int account_id, String account, String email, String password, int status, int employee_id) {
        this.account_id = account_id;
        this.account = account;
        this.email = email;
        this.password = password;
        this.status = status;
        this.employee_id = employee_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "Employee{" + "account_id=" + account_id + ", account=" + account + ", email=" + email + ", password=" + password + ", status=" + status + ", employee_id=" + employee_id + '}';
    }
}
