/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Happy-2001
 */
public class FirstServlet extends HttpServlet {

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
            out.println("<title>Servlet FirstServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FirstServlet at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        double a1=0;
        double b1=0;
        try {
             a1 = Double.parseDouble(request.getParameter("a").trim());
             b1 = Double.parseDouble(request.getParameter("b").trim());
        } catch (NumberFormatException e) {
            response.sendRedirect("index.html");
        }
        String op = request.getParameter("option");
        String result = null;
        switch (op) {
            case "+":
                result=String.valueOf(a1 + b1);
                break;
            case "-":
                result=String.valueOf(a1 - b1);
                break;
            case "*":
                result=String.valueOf(a1 * b1);
                break;
            case "/":
                if(b1==0){
                    result="Error";
                }else{
                    result=String.valueOf(a1 / b1);
                }   break;
        }
        response.setContentType("text/html");
            
            out.println("<!DOCTYPE html>\n"
                    + "<!--\n"
                    + "To change this license header, choose License Headers in Project Properties.\n"
                    + "To change this template file, choose Tools | Templates\n"
                    + "and open the template in the editor.\n"
                    + "-->\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <title>Calculator</title>\n"
                    + "        <meta charset=\"UTF-8\">\n"
                    + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <form action=\"FirstServlet\" method=\"post\">\n"
                    + "            <table> \n"
                    + "                <tr>\n"
                    + "                    <td>First:</td><td><input type=\"text\" name=\"a\" value="+a1+"></td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>Second:</td><td><input type=\"text\" name=\"b\" value="+b1+"></td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>Operator:</td>\n"
                    + "                    <td>\n"
                    + "                        <select name=\"option\">\n"
                    + "                            <option>+</option>\n"
                    + "                            <option>-</option>\n"
                    + "                            <option>*</option>\n"
                    + "                            <option>/</option>\n"
                    + "                        </select>\n"
                    + "                    </td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td></td>\n"
                    + "                    <td><input type=\"submit\" value=\"Compute\"></td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>Results:</td><td><input type=\"text\" value="+result+"></td>\n"
                    + "                </tr>\n"
                    + "            </table>\n"
                    + "        </form>  \n"
                    + "    </body>\n"
                    + "</html>\n"
                    + "");
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
