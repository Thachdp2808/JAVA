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
public class Employee {
    int employee_id;
    String first_name;
    String last_name;
    int gender;
    String date;
    int phone;
    String address;
    String department_name;
    String remark;
    public Employee(){
        
    }

    public Employee(String first_name, String last_name, int gender, String date, int phone, String address, String department_name, String remark) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.date = date;
        this.phone = phone;
        this.address = address;
        this.department_name = department_name;
        this.remark = remark;
    }
    
    public Employee(int employee_id, String first_name, String last_name, int gender, String date, int phone, String address, String department_name, String remark) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.date = date;
        this.phone = phone;
        this.address = address;
        this.department_name = department_name;
        this.remark = remark;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Employee{" + "employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender + ", date=" + date + ", phone=" + phone + ", address=" + address + ", department_name=" + department_name + ", remark=" + remark + '}';
    }
    
    
}
