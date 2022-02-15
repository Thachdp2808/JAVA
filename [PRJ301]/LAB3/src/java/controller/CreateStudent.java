/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;
import DAL.StudentDAO;


public class CreateStudent extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.print("<h3> "+request.getParameter("Gender")+"</h3>");
//            String name , gender;
//            String DOB;
//            StudentDAO u = new StudentDAO();
//            name = request.getParameter("name");
//            gender = request.getParameter("Gender");
//            DOB = request.getParameter("DOB");
//            if (name == null || name.trim().length() == 0) {
//                out.print("<h3> The name must not be empty!</h3>");
//                request.getRequestDispatcher("../create.jsp").include(request, response);
//                return;
//            }
//            if(DOB.isEmpty()){
//                out.print("<h3> The DOB must not be empty!</h3>");
//                request.getRequestDispatcher("../create.jsp").include(request, response);
//                return;
//            }
            request.getRequestDispatcher("../create.jsp").forward(request, response);
//            Student x = new Student(0, name, gender, java.sql.Date.valueOf(DOB));
//            u.insert(x);
//            request.getRequestDispatcher("../student/list").forward(request, response);
////            response.sendRedirect("list");
        }
//    }

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
//        processRequest(request, response);
//try (PrintWriter out = response.getWriter()) {}
String name , gender;
            String DOB;
            StudentDAO u = new StudentDAO();
            name = request.getParameter("name");
            gender = request.getParameter("Gender");
            DOB = request.getParameter("DOB");
            if (name == null || name.trim().length() == 0) {
//                out.print("<h3> The name must not be empty!</h3>");
                request.setAttribute("err", " The name must not be empty!");
                request.getRequestDispatcher("../create.jsp").forward(request, response);
                return;
            }
            if(DOB.isEmpty()){
//                out.print("<h3> The DOB must not be empty!</h3>");
                request.setAttribute("err", " The DOB must not be empty!");
                request.getRequestDispatcher("../create.jsp").forward(request, response);
                return;
            }
            Student x = new Student(0, name, gender, java.sql.Date.valueOf(DOB));
            u.insert(x);
            request.getRequestDispatcher("../student/list").forward(request, response);
    
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
