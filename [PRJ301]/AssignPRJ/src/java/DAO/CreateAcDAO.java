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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author Happy-2001
 */
public class CreateAcDAO {

    public Account insertsql(Account ac) {
        
        try {
            String sql = "INSERT INTO [Shopping].[dbo].[account]\n"
                    + "           ([username]\n"
                    + "           ,[password]\n"
                    + "           ,[displayname]\n"
                    + "           ,[address]\n"
                    + "           ,[email]\n"
                    + "           ,[phone])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ac.getName());
            ps.setString(2, ac.getPassword());
            ps.setString(3, ac.getDisplayname());
            ps.setString(4, ac.getAddress());
            ps.setString(5, ac.getEmail());
            ps.setInt(6, ac.getPhone());
            ps.executeUpdate();
            
            
        } catch (Exception ex) {
            Logger.getLogger(CreateAcDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ac;
    }

}
