/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Context.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author Happy-2001
 */
public class LoginDAO {

    public Account getAccountByUsernameAndPassword(String username, String password) {
        
        try {
            Account user = new Account();
            String sql = "select * from account where username = ? and password = ?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                user.setName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setDisplayname(rs.getString("displayname"));
                user.setId(rs.getInt("id"));
                user.setRollid(rs.getInt("roleid"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getInt("phone"));
                return user;
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public Account getAccountByMail(String mail) {
        
        try {
            Account user = new Account();
            String sql = "select * from account where email= ?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mail);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                user.setName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setDisplayname(rs.getString("displayname"));
                user.setId(rs.getInt("id"));
                user.setRollid(rs.getInt("roleid"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getInt("phone"));
                return user;
            }
        } catch (Exception ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
