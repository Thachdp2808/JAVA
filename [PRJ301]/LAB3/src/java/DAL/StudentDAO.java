package DAL;

import DAL.BaseDAO;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import model.Student;

public class StudentDAO extends BaseDAO {

    public List<Student> getStudents() {
        List<Student> t = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        xSql = "select * from Student";
        try {
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            int xID;
            String xName, xGender;
            java.sql.Date xDOB;
            Student x;
            while (rs.next()) {
                xID = rs.getInt("id");
                xName = rs.getString("name");
                xGender = rs.getByte("gender") == 1 ? "Male" : "Female";
                xDOB = rs.getDate("DOB");
                x = new Student(xID, xName, xGender, xDOB);
                t.add(x);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (t);
    }

    public Student getStudent(int Id) {
        Student x = null;
        String name, gender;
        java.sql.Date DOB;
        xSql = "select * from Student where id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            if (rs.next()) {
                name = rs.getString("name");
                gender = rs.getByte("gender") == 1 ? "Male" : "Female";
                DOB = rs.getDate("DOB");
                x = new Student(Id, name, gender, DOB);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (x);
    }

    public void insert(Student x) {
        xSql = "insert into [Student](Name,Gender,DOB) values (?,?,?)";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, x.getName());
            ps.setBoolean(2, x.getGender().equalsIgnoreCase("Male"));
            ps.setDate(3, x.getDOB());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int Id, Student x) {
        xSql = "update Student set name=?,Gender=?,DOB=? where Id=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, x.getName());
            ps.setBoolean(2, x.getGender().equalsIgnoreCase("Male"));
            ps.setDate(3, x.getDOB());
            ps.setInt(4, Id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int Id) {
        xSql = "delete from Student where ID=?";
        try {
            ps = con.prepareStatement(xSql);
            ps.setInt(1, Id);
            ps.executeUpdate();
            //con.commit();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
