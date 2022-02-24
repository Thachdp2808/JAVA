/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Loggin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Happy-2001
 */
public class Compare {
    public Connection con = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;
    
    public Loggin getUsers(String user,String pass) throws Exception {
        String query = "select * from Infor where users = ? and pass = ?";
            con = new DBConnect().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            //ps.setString(3, role);
            rs = ps.executeQuery();
            while (rs.next()) {
                Loggin a = new Loggin(rs.getString(1), rs.getString(2));
                return a;

            }
            return null;
    }
    public Loggin getUser(){
        Loggin lo =null;
        String user,pass;
        String sql = "select Users from Infor";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = rs.getString("User");
                
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Compare.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (lo);
    }
    public Loggin getPass(){
        Loggin lo =null;
        String user,pass;
        String sql = "select Users from Infor";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                pass = rs.getString("Pass");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Compare.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (lo);
    }
}
