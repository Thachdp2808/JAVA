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

/**
 *
 * @author nguye
 */
public class AccountDAO extends DBContext {

    public ArrayList<Account> getAccount() {
        ArrayList<Account> account = new ArrayList<>();
        try {
            String sql = "select * from Account";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setAccount_id(rs.getInt("account_id"));
                a.setAccount(rs.getString("account"));
                a.setEmail(rs.getString("email"));
                a.setPassword(rs.getString("password"));
                a.setStatus(rs.getInt("status"));
                a.setEmployee_id(rs.getInt("Employeemployee_id"));

                account.add(a);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return account;
    }

    public void insert(Account u, int id) {
        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([account]\n"
                    + "           ,[email]\n"
                    + "           ,[password]\n"
                    + "           ,[status]\n"
                    + "           ,[Employeemployee_id])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, u.getAccount());
            stm.setString(2, u.getEmail());
            stm.setString(3, u.getPassword());
            stm.setInt(4, u.getStatus());
            stm.setInt(5, id);
            stm.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public Account getAccountByUsernameAndPassword(String user, String pass) {
        try {
            Account account = new Account();
            String sql = "select * from Account where account = ? and password = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, user);
            stm.setString(2, pass);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                account.setAccount_id(rs.getInt("account_id"));
                account.setAccount(rs.getString("account"));
                account.setEmail(rs.getString("email"));
                account.setPassword(rs.getString("password"));
                account.setStatus(rs.getInt("status"));
                account.setEmployee_id(rs.getInt("Employeemployee_id"));

                return account;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public Account getAccountByID(int id) {
        try {
            Account account = new Account();
            String sql = "select * from Account\n"
                    + "inner join Employee on employee_id=Employeemployee_id where employee_id=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                account.setAccount_id(rs.getInt("account_id"));
                account.setAccount(rs.getString("account"));
                account.setEmail(rs.getString("email"));
                account.setPassword(rs.getString("password"));
                account.setStatus(rs.getInt("status"));
                account.setEmployee_id(rs.getInt("Employeemployee_id"));

                return account;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean update(Account acc, int id) {
        int check = 0;
        try {
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [account] = ?\n"
                    + "      ,[email] = ?\n"
                    + "      ,[password] = ?\n"
                    + "      ,[status] = ?\n"
                    + "  where Employeemployee_id=?";
            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, acc.getAccount());
            stm.setString(2, acc.getEmail());
            stm.setString(3, acc.getPassword());
            stm.setInt(4, acc.getStatus());

            stm.setInt(5, id);

            check = stm.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check > 0;
    }

    public void delete(int Id) {
        try {
            String sql = "delete from Account where Employeemployee_id=?";
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
        AccountDAO dao = new AccountDAO();
//        ArrayList<Account> s = dao.getAccount();
//        for (Account a : s) {
//            System.out.println(a.getAccount());
//        }
//        Account a = dao.getAccountByUsernameAndPassword("admin", "12345");
//        System.out.println(a.getEmail());
//        dao.insert(new Account("abc","abc","abc",1),1);
//        dao.delete(10);
//        Account a = dao.getAccountByID(1);
//        System.out.println(a.getEmail());
            dao.update(new Account("abc","abc","abc",1), 4);
    }

}
