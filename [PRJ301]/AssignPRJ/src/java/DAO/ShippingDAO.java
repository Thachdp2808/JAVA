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
import model.Shipping;

/**
 *
 * @author Happy-2001
 */
public class ShippingDAO {

    public int returnid(Shipping shipping) {
        try {
            String sql = "INSERT INTO [Shopping].[dbo].[Shipping]\n"
                    + "           ([name]\n"
                    + "           ,[phone]\n"
                    + "           ,[address]\n"
                    + "           ,[email])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?)";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, shipping.getName());
            ps.setString(2, shipping.getPhone());
            ps.setString(3, shipping.getAddress());
            ps.setString(4, shipping.getEmail());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ShippingDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

}
