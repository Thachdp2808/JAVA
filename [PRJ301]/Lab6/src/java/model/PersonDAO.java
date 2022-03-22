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
import model.Person;

/**
 *
 * @author Happy-2001
 */
public class PersonDAO extends BaseDAO<Person> {

    String sql;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public ArrayList<Person> getAll() {
        ArrayList<Person> lp = new ArrayList<>();
        try {
            sql = "SELECT * FROM [DummyTBL]";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Person s = new Person();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("Name"));
                lp.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lp;
    }

    public int totalPage() {
        int total = 0;
        try {
            sql = "select COUNT(*) from DummyTBL";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return total;
    }

    public ArrayList<Person> pagePerson(int pageIndex) {
        ArrayList<Person> lp = new ArrayList<>();
        try {
            sql = "SELECT top 6 * \n"
                    + "FROM DummyTBL\n"
                    + "where id > ?\n"
                    + "ORDER BY id";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, (pageIndex-1)*6);
            rs = ps.executeQuery();
            while(rs.next()){
                Person p = new Person();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                lp.add(p);
            }
        } catch (SQLException e) {
        }
        return lp;
    }

    public int insertData(String name) {
        int rs = 0;
        try {
            sql = "INSERT INTO DummyTBL(Name) VALUES (?);";
            ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeUpdate();
        } catch (SQLException e) {
        }
        return rs;
    }

    public static void main(String[] args) throws SQLException {
        PersonDAO pd = new PersonDAO();
        ArrayList<Person> lp = pd.pagePerson(13);
        for (Person p : lp) {
            System.out.println(p);
        }
    }
}
