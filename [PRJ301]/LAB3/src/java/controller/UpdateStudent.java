package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Student;
import DAL.StudentDAO;

public class UpdateStudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter pr = response.getWriter();
        int Id = Integer.parseInt(request.getParameter("Id"));
        StudentDAO u = new StudentDAO();
        Student x = u.getStudent(Id);
        request.setAttribute("student", x);
        request.getRequestDispatcher("../update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int Id;
        String name, gender, DOB;
        Id = Integer.parseInt(request.getParameter("Id"));
        name = request.getParameter("name");
        boolean isOk = true;
        if (name == null || name.trim().length() == 0) {
            name = "";
            isOk = false;
        }
        gender = request.getParameter("Gender");
        DOB = request.getParameter("DOB");
        Student x = new Student(Id, name, gender, java.sql.Date.valueOf(DOB));
        if (!isOk) {
            out.println("<h3>Fill the Name!</h3>");
            request.setAttribute("student", x);
            request.getRequestDispatcher("../update.jsp").include(request, response);
            return;
        }
        StudentDAO u = new StudentDAO();
        u.update(Id, x);
        response.sendRedirect("list");
    }
}
