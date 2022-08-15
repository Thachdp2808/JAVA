/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.EmployeeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Employee;

/**
 *
 * @author nguye
 */
public class EmployeeController extends HttpServlet {

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
        HttpSession session = request.getSession();
        Object objacc = session.getAttribute("account");
        if (objacc == null) {
            request.getRequestDispatcher("LoginController").forward(request, response);
        }
        EmployeeDAO dao = new EmployeeDAO();
        ArrayList<Employee> emp = dao.getEmployee();
        request.setAttribute("emp", emp);
        int page = 1;
        int page_size = 4;
        //totalpage
        int totalProducts = dao.getallProbyID();
        int totalPage = totalProducts / page_size;
        if (totalProducts % page_size != 0) {
            totalPage += 1;
        }
        request.setAttribute("totalproduct", totalProducts);
        request.setAttribute("totalPage", totalPage);
        //Setpage
        String pag = request.getParameter("page");
        if (pag != null) {
            page = Integer.parseInt(pag);

        }
        ArrayList<Employee> emp1 = dao.paging(page, page_size);
        request.setAttribute("emp", emp1);
        request.setAttribute("page", page);
        request.getRequestDispatcher("ViewContent.jsp").forward(request, response);

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
        processRequest(request, response);
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
        String search = request.getParameter("search");
        EmployeeDAO emDAO = new EmployeeDAO();
        String option = request.getParameter("option");
        if (option.equals("ID")) {
            ArrayList<Employee> emp = emDAO.SearchByEmployee_id(search);
            request.setAttribute("emp", emp);
            request.getRequestDispatcher("ViewContent.jsp").forward(request, response);
        }
        if (option.equals("Name")) {
            ArrayList<Employee> emp = emDAO.SearchByName(search);
            request.setAttribute("emp", emp);
            request.getRequestDispatcher("ViewContent.jsp").forward(request, response);
        }
        
        if (option.equals("Date")) {
            ArrayList<Employee> emp = emDAO.SearchByDate(search);
            request.setAttribute("emp", emp);
            request.getRequestDispatcher("ViewContent.jsp").forward(request, response);
        }
        if (option.equals("Phone")) {
            ArrayList<Employee> emp = emDAO.SearchByPhone(search);
            request.setAttribute("emp", emp);
            request.getRequestDispatcher("ViewContent.jsp").forward(request, response);
        }
        if (option.equals("Adress")) {
            ArrayList<Employee> emp = emDAO.SearchByAdress(search);
            request.setAttribute("emp", emp);
            request.getRequestDispatcher("ViewContent.jsp").forward(request, response);
        }
        if (option.equals("Department")) {
            ArrayList<Employee> emp = emDAO.SearchByDepartment(search);
            request.setAttribute("emp", emp);
            request.getRequestDispatcher("ViewContent.jsp").forward(request, response);
        }
        
        

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
