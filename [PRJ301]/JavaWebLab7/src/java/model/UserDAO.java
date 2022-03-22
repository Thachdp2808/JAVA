/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author admin
 */
public class UserDAO extends BaseDAO<User> {

    String sql;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> lu = new ArrayList<>();
        try {
            sql = "SELECT * FROM [UserTBL]";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User s = new User();
                s.setUsername(rs.getString(1));
                s.setPassword(rs.getString(2));
                lu.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lu;
    }
    
    public User login(String u, String p){
        User s = new User();
        try {
            sql = "SELECT * FROM [UserTBL] where username = ? and password = ?";
            ps = connection.prepareStatement(sql);
            ps.setString(1, u);
            ps.setString(2, p);
            rs = ps.executeQuery();
            while (rs.next()) {               
                s.setUsername(rs.getString(1));
                s.setPassword(rs.getString(2));            
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

   

    public static void main(String[] args) throws SQLException {
        UserDAO ud = new UserDAO();
        System.out.println(ud.login("username1", "password1"));
//        ArrayList<User> lu = ud.getAll();
//        for (User u : lu) {
//            System.out.println(u);
//        }
    }
}
