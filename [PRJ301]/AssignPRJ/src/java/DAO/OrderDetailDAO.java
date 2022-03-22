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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cart;

/**
 *
 * @author Happy-2001
 */
public class OrderDetailDAO {

    public void saveCart(int orderId, Map<Integer, Cart> carts) {
        

        try {
            String sql = "INSERT INTO [Shopping].[dbo].[Detail]\n"
                    + "           ([order_id]\n"
                    + "           ,[productname]\n"
                    + "           ,[productimage]\n"
                    + "           ,[productPrice]\n"
                    + "           ,[productid]\n"
                    + "           ,[quantity])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,orderId);
            for(Map.Entry<Integer,Cart> entry: carts.entrySet()){
                Integer productId = entry.getKey();
                Cart cart =entry.getValue();
                ps.setString(2,cart.getProduct().getName());
                ps.setString(3,cart.getProduct().getImageURL());
                ps.setDouble(4,cart.getProduct().getPrice());
                ps.setInt(5,cart.getProduct().getId());
                ps.setInt(6,carts.get(cart.getProduct().getId()).getQuantity());
                ps.executeUpdate();
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderDetailDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
