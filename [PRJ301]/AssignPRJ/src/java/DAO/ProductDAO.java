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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Product;

/**
 *
 * @author Happy-2001
 */
public class ProductDAO {

    public List<Product> getallPro() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)
                ));

            }

        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void delete(int Id) {
        try {
            String xSql = "delete from Product where id=?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(xSql);
            ps.setInt(1, Id);
            ps.executeUpdate();
            //con.commit();
            ps.close();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Product> getProbyID(int categoryid) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product where Product.Categoryid=?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)));

            }

        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Product> pageProduct(int pageIndex) {
        ArrayList<Product> lp = new ArrayList<>();
        try {

            String sql = "SELECT top 4 * \n"
                    + "FROM Product\n"
                    + "where id > ?\n"
                    + "ORDER BY id";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, (pageIndex - 1) * 4);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                lp.add(p);
            }

        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lp;
    }

    public int getallProbyID() {

        try {
            String sql = "select COUNT(*)  from Product";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }

        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public List<Product> search(String keyword) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product where name like ?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)));

            }

        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Product getOneProbyID(int ProductID) {

        try {
            String sql = "select * from Product where id=?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ProductID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8));
                return product;

            }

        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Product> getProbyCategoryid(int i, int i0) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select * from product where Categoryid = ? or  Categoryid =?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, i);
            ps.setInt(2, i0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)));

            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean update(Product product, int id) {
        int check = 0;
        try {
            String sql = "UPDATE [dbo].[Product]\n"
                    + "      SET [name] = ?\n"
                    + "      ,[quantity] = ?\n"
                    + "      ,[price] = ?\n"
                    + "      ,[description] = ?\n"
                    + "      ,[imageUrl] = ?\n"
                    + "      ,[create_date] = ?\n" 
                    +  "      ,[Categoryid] = ?\n"
                    + " WHERE id=?";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, product.getName());
            ps.setInt(2, product.getQuantity());
            ps.setDouble(3, product.getPrice());
            ps.setString(4, product.getDescription());
            ps.setString(5, product.getImageURL());
            ps.setString(6, product.getCreatedDate());
            ps.setInt(7, product.getCategoryid());

            ps.setInt(8, id);

            check = ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check > 0;
    }

    public void insert(Product product) {
        try {
            String sql = "INSERT INTO [Shopping].[dbo].[Product]\n"
                    + "           ([id]\n"
                    + "           ,[name]\n"
                    + "           ,[quantity]\n"
                    + "           ,[price]\n"
                    + "           ,[description]\n"
                    + "           ,[imageUrl]\n"
                    + "           ,[create_date]\n"
                    + "           ,[Categoryid]\n)"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?,?)";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, product.getId());
            ps.setString(2, product.getName());
            ps.setInt(3, product.getQuantity());
            ps.setDouble(4, product.getPrice());
            ps.setString(5, product.getDescription());
            ps.setString(6, product.getImageURL());
            ps.setString(7, product.getCreatedDate());
            ps.setInt(8, product.getCategoryid());
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public ArrayList<Product> paging(int page, int page_size) {
        ArrayList<Product> employee = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Product ORDER BY id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
            Connection conn = new DBConnect().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, (page - 1) * page_size);
            ps.setInt(2, page_size);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product a = new Product();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setQuantity(rs.getInt(3));
                a.setPrice(rs.getInt(4));
                a.setDescription(rs.getString(5));
                a.setImageURL(rs.getString(6));
                a.setCreatedDate(rs.getString(7));
                a.setCategoryid(rs.getInt(8));

                employee.add(a);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employee;
    }

    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
//        List<Product> list = dao.getallPro();
//        for (Product o : list) {
//            System.out.println(o);
//        }
        Product x = new Product(51,"a", 1, 1,"b","c", "03/27/2002",1);
         dao.insert(x);
    }

}
