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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author Happy-2001
 */
public class CategoryDAO {
    //Thao tác với bảng Category
    public List<Category> getallCat() {
        List<Category> list = new ArrayList<>();
        try {
            String sql = "select * from Category";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//                Category category = new Category(rs.getInt(1), rs.getString(2));
//                Category category = Category.builder()
//                        .id(rs.getInt(1))
//                        .name(rs.getString(1)).build();  
                   list.add(new Category(rs.getInt(1),rs.getString(2))); 
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static void main(String[] args) {
        CategoryDAO dao =new CategoryDAO();
        List<Category> list =  dao.getallCat();
        for(Category o : list){
            System.out.println(o);
        }
    }

}
