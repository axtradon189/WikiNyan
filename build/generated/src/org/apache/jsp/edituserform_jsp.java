package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.Nyan;
import Model.NyanModel;

public final class edituserform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"author\" content=\"Adib, Farrell, Waskito\">\n");
      out.write("\t<meta name=\"description\" content=\"WikiNyan\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/styleAdminPage.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\n");
      out.write("        <title>Edit Form</title>\n");
      out.write("        <style>\n");
      out.write("#Font {\n");
      out.write("font-family: \"Comic Sans MS\", cursive, sans-serif;\n");
      out.write("letter-spacing: 2px;\n");
      out.write("word-spacing: 2px;\n");
      out.write("color: #000000;\n");
      out.write("font-weight: 400;\n");
      out.write("text-decoration: none solid rgb(68, 68, 68);\n");
      out.write("font-style: normal;\n");
      out.write("font-variant: normal;\n");
      out.write("text-transform: none;\n");
      out.write("}\n");
      out.write("input\n");
      out.write("{\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tcolor: #000;\n");
      out.write("\tpadding: 10px 15px;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\ttext-decoration: none;  \n");
      out.write("        \n");
      out.write("}\n");
      out.write("button\n");
      out.write("{\n");
      out.write("\tbackground: #fff;\n");
      out.write("\tcolor: #000;\n");
      out.write("\tpadding: 10px 15px;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("        \n");
      out.write("}\n");
      out.write("button:hover\n");
      out.write("{\n");
      out.write("\tbackground: #FFEFD5;\n");
      out.write("\ttransition: 0.5s;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"big-banner\">\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<h1>Wiki<span class=\"red\">Nyan</span></span></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("                    <div class=\"menulist\">\n");
      out.write("                        <a href=\"index.jsp\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");

            String id = request.getParameter("id");
            NyanModel b = Nyan.getRecordById(Integer.parseInt(id));
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1 id=\"Font\">Edit Form</h1>\n");
      out.write("        <form action=\"edituser.jsp\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(b.getId());
      out.write("\"/>\n");
      out.write("            <table>\n");
      out.write("                \n");
      out.write("                <tr><td id=\"Font\">Name : </td><td><input type=\"text\" name=\"username\" value=\"");
      out.print( b.getUsername());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td id=\"Font\">Password : </td><td><input type=\"text\" name=\"password\" value=\"");
      out.print( b.getPassword());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td colspan=\"2\"><button type=\"submit\" value=\"Edit User\">Edit</button>\n");
      out.write("                        <a href=\"edituser.jsp\"><button>Cancel</button></a>\n");
      out.write("                    </td></tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
