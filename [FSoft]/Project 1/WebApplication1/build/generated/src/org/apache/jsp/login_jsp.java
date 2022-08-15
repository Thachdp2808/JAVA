package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>Bootstrap Elegant Modal Login Modal Form with Icons</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Varela Round', sans-serif;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login {\n");
      out.write("            color: #636363;\n");
      out.write("            width: 350px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .modal-content {\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .modal-header {\n");
      out.write("            border-bottom: none;\n");
      out.write("            position: relative;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login h4 {\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 26px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .form-group {\n");
      out.write("            position: relative;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login i {\n");
      out.write("            position: absolute;\n");
      out.write("            left: 13px;\n");
      out.write("            top: 11px;\n");
      out.write("            font-size: 18px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .form-control {\n");
      out.write("            padding-left: 40px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .form-control:focus {\n");
      out.write("            border-color: #00ce81;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .form-control,\n");
      out.write("        .modal-login .btn {\n");
      out.write("            min-height: 40px;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .hint-text {\n");
      out.write("            text-align: center;\n");
      out.write("            padding-top: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .close {\n");
      out.write("            position: absolute;\n");
      out.write("            top: -5px;\n");
      out.write("            right: -5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .btn,\n");
      out.write("        .modal-login .btn:active {\n");
      out.write("            border: none;\n");
      out.write("            background: #00ce81 !important;\n");
      out.write("            line-height: normal;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .btn:hover,\n");
      out.write("        .modal-login .btn:focus {\n");
      out.write("            background: #00bf78 !important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .modal-footer {\n");
      out.write("            background: #ecf0f1;\n");
      out.write("            border-color: #dee4e7;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 0 -20px -20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 13px;\n");
      out.write("            justify-content: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .modal-login .modal-footer a {\n");
      out.write("            color: #999;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .trigger-btn {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin: 100px auto;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"text-center\">\n");
      out.write("        <!-- Button HTML (to Trigger Modal) -->\n");
      out.write("        <a href=\"#myModal\" class=\"trigger-btn\" data-toggle=\"modal\">Click to Open Login Modal</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Modal HTML -->\n");
      out.write("    <div id=\"myModal\" class=\"modal fade\">\n");
      out.write("        <div class=\"modal-dialog modal-login\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h4 class=\"modal-title\">Member Login</h4>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"LoginController\" method=\"post\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <i class=\"fa fa-user\"></i>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"username\" required=\"required\" name=\"username\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <i class=\"fa fa-lock\"></i>\n");
      out.write("                            <input type=\"password\" class=\"form-control\" placeholder=\"password\" required=\"required\" name=\"password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary btn-block btn-lg\" value=\"Login\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <a href=\"#\">Forgot Password?</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
