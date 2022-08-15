/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Employee;

/**
 *
 * @author nguye
 */
public class EmployeeDAO extends DBContext {

    public ArrayList<Employee> getEmployee() {
        ArrayList<Employee> employee = new ArrayList<>();
        try {
            String sql = "select * from employee";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Employee a = new Employee();
                a.setEmployee_id(rs.getInt("employee_id"));
                a.setFirst_name(rs.getString("first_name"));
                a.setLast_name(rs.getString("last_name"));
                a.setGender(rs.getInt("gender"));
                a.setDate(rs.getString("date_of_birth"));
                a.setPhone(rs.getInt("phone"));
                a.setAddress(rs.getString("address"));
                a.setDepartment_name(rs.getString("department_name"));
                a.setRemark(rs.getString("remark"));

                employee.add(a);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return employee;
    }

    public void insert(Employee u) {
        try {
            String sql = "INSERT INTO [dbo].[Employee]\n"
                    + "           ([first_name]\n"
                    + "           ,[last_name]\n"
                    + "           ,[gender]\n"
                    + "           ,[date_of_birth]\n"
                    + "           ,[phone]\n"
                    + "           ,[address]\n"
                    + "           ,[department_name]\n"
                    + "           ,[remark])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, u.getFirst_name());
            stm.setString(2, u.getLast_name());
            stm.setInt(3, u.getGender());
            stm.setString(4, u.getDate());
            stm.setInt(5, u.getPhone());
            stm.setString(6, u.getAddress());
            stm.setString(7, u.getDepartment_name());
            stm.setString(8, u.getRemark());
            stm.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public ArrayList<Employee> SearchByName(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where first_name  like ?  or last_name like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            stm.setString(2, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Employee> SearchByEmployee_id(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where employee_id like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Employee> SearchByGender(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where gender like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Employee> SearchByDate(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where date_of_birth like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Employee> SearchByPhone(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where phone like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Employee> SearchByAdress(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where address like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Employee> SearchByDepartment(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where department_name like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Employee> SearchByRemark(String keyword) {
        ArrayList<Employee> list = new ArrayList<>();
        try {
            String sql = "select * from Employee\n"
                    + "where remark like ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + keyword + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Employee(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)));
            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getallProbyID() {

        try {
            String sql = "select COUNT(*)  from Employee";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);

            }

        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList<Employee> paging(int page, int page_size) {
        ArrayList<Employee> employee = new ArrayList<>();
        try {

            String sql = "SELECT * FROM Employee ORDER BY employee_id OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, (page - 1) * page_size);
            stm.setInt(2, page_size);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Employee a = new Employee();
                a.setEmployee_id(rs.getInt("employee_id"));
                a.setFirst_name(rs.getString("first_name"));
                a.setLast_name(rs.getString("last_name"));
                a.setGender(rs.getInt("gender"));
                a.setDate(rs.getString("date_of_birth"));
                a.setPhone(rs.getInt("phone"));
                a.setAddress(rs.getString("address"));
                a.setDepartment_name(rs.getString("department_name"));
                a.setRemark(rs.getString("remark"));

                employee.add(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employee;
    }

    public Employee getTop1() {

        try {
            Employee a = new Employee();
            String sql = "select top 1 * from Employee order by employee_id desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                a.setEmployee_id(rs.getInt("employee_id"));
                a.setFirst_name(rs.getString("first_name"));
                a.setLast_name(rs.getString("last_name"));
                a.setGender(rs.getInt("gender"));
                a.setDate(rs.getString("date_of_birth"));
                a.setPhone(rs.getInt("phone"));
                a.setAddress(rs.getString("address"));
                a.setDepartment_name(rs.getString("department_name"));
                a.setRemark(rs.getString("remark"));

                return a;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public Employee getEmployeebyID(int id) {

        try {
            Employee a = new Employee();
            String sql = "select * from Employee where employee_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                a.setEmployee_id(rs.getInt("employee_id"));
                a.setFirst_name(rs.getString("first_name"));
                a.setLast_name(rs.getString("last_name"));
                a.setGender(rs.getInt("gender"));
                a.setDate(rs.getString("date_of_birth"));
                a.setPhone(rs.getInt("phone"));
                a.setAddress(rs.getString("address"));
                a.setDepartment_name(rs.getString("department_name"));
                a.setRemark(rs.getString("remark"));

                return a;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public boolean update(Employee em, int id) {
        int check = 0;
        try {
            String sql = "UPDATE [dbo].[Employee]\n"
                    + "   SET [first_name] = ?\n"
                    + "      ,[last_name] = ?\n"
                    + "      ,[gender] = ?\n"
                    + "      ,[date_of_birth] = ?\n"
                    + "      ,[phone] = ?\n"
                    + "      ,[address] = ?\n"
                    + "      ,[department_name] = ?\n"
                    + "      ,[remark] = ?\n"
                    + " WHERE employee_id=?";
            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, em.getFirst_name());
            stm.setString(2, em.getLast_name());
            stm.setDouble(3, em.getGender());
            stm.setString(4, em.getDate());
            stm.setInt(5, em.getPhone());
            stm.setString(6, em.getAddress());
            stm.setString(7, em.getDepartment_name());
            stm.setString(8, em.getRemark());
            stm.setInt(9, id);

            check = stm.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check > 0;
    }

    public void delete(int Id) {
        try {
            String sql = "delete from Employee where employee_id=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, Id);
            stm.executeUpdate();
            //con.commit();
            stm.close();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
//        ArrayList<Employee> s = dao.getEmployee();
//        for(Employee a: s){
//            System.out.println(a.getAddress());
//        }
//        dao.insert(new Employee("abc", "abc", 1, "2022/02/14", 123, "abc", "abc", "123"));
//            dao.delete(7);
//        Employee a = dao.getEmployeebyID(1);
//        System.out.println(a.getLast_name());
//        dao.update(new Employee("abc", "abc", 1, "2022/02/14", 123, "abc", "abc", "123"), 4);
//        ArrayList<Employee> e = dao.SearchByName("h");
//        for(Employee s : e){
//            System.out.println(s.getAddress());
//        }
//        int a = dao.getallProbyID();
//        System.out.println(a);
//            ArrayList<Employee> a = dao.paging(3, 4);
//            for(Employee b: a){
//                System.out.println(b.getEmployee_id());
//            }
        ArrayList<Employee> e = dao.SearchByEmployee_id("1");
        for (Employee s : e) {
            System.out.println(s.getAddress());
        }
    }

}
