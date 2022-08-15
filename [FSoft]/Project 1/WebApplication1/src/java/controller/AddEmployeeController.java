/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDAO;
import dal.EmployeeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Employee;

/**
 *
 * @author nguye
 */
public class AddEmployeeController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddEmployeeController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddEmployeeController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object objacc = session.getAttribute("account");
        if (objacc == null) {
            request.getRequestDispatcher("LoginController").forward(request, response);
        }
        request.getRequestDispatcher("AddEmployee.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String last = request.getParameter("last");
        String gender = request.getParameter("gender");
        String date = request.getParameter("date");
        int gender1;
        if(!gender.equals("Male")){
            gender1=0;
        }else{
            gender1=1;
        }
        int phone =Integer.parseInt(request.getParameter("phone")) ;
        String address = request.getParameter("address");
        String department = request.getParameter("department");
        String mark = request.getParameter("remark");
        Employee e = new Employee(first,last,gender1,date,phone,address,department,mark);
        EmployeeDAO emDAO = new EmployeeDAO();
        emDAO.insert(e);
        String account = request.getParameter("account");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String status = request.getParameter("status");
        int emID=emDAO.getTop1().getEmployee_id();
        int status1;
        if(status.equals("Active")){
            status1=0;
        }else{
            status1=1;
        }
        Account ac = new Account(account,email,pass,status1);
        AccountDAO accDAO = new AccountDAO();
        accDAO.insert(ac, emID);
        response.sendRedirect("EmployeeController");
       
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
