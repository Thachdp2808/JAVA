package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Student;
import java.text.SimpleDateFormat;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>JSP</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
 SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
      out.write("\n");
      out.write("        ");

            ArrayList<Student> students
                    = (ArrayList<Student>) request.getAttribute("students");
        
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <form action=\"StudentServlet\"  method=\"post\">\n");
      out.write("    Number of Students: <input type=\"text\" name=\"num\" size=\"10\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${students.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("    <input type=\"submit\" value=\"Generate\" />\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <td>ID</td> \n");
      out.write("            <td>Name</td>\n");
      out.write("            <td>Gender</td>\n");
      out.write("            <td>DOB</td>\n");
      out.write("        </tr>\n");
      out.write("        ");
 for (Student s : students) {
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(s.getId());
      out.write("</td> \n");
      out.write("            <td>");
      out.print(s.getName());
      out.write("</td>\n");
      out.write("            <td><input type=\"checkbox\" ");
      out.print( s.isGender()? "checked":"" );
      out.write(" /></td>\n");
      out.write("            <td>");
      out.print(SDF.format(s.getDOB()));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </table>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
