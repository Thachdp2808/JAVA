/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Account;
import Model.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Happy-2001
 */
public class AccountDAO {
    
    public Account getAccountByUsernameAndPassword(String username,String password) throws Exception{
       try{
           Account user = new Account();
           String sql = "select * from Users where username = ? and password = ?";
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
               return user;
           }
           
          
       }catch(SQLException e){
           
       }
          return null;
       
   }
}
