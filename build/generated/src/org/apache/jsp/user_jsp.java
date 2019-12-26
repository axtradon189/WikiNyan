package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<title>WikiNyan | Meo Here</title>\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/forum.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<script src=\"jQuery/jQuery.js\"></script>\n");
      out.write("<style>\n");
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
      out.write("#a\n");
      out.write("{\n");
      out.write("    width: 80%;\n");
      out.write("    height: 80%;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- Big Banner -->\n");
      out.write("<div class=\"big-banner\">\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<h1>Wiki<span class=\"red\">Nyan</span></span></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menulist\">\n");
      out.write("                            <a href=\"mainPage_login.jsp\">Home</a>\n");
      out.write("                                <a href=\"MeoHere_user.jsp\">Paw Here</a>\n");
      out.write("                                <a href=\"forum_user.jsp\">Meow Forum</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- End Big Banner -->\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("        <center>\n");
      out.write("            <img src=\"image/catIcon/ava.png\">\n");
      out.write("        </center>\n");
      out.write("<br>\n");
      out.write("<p>Hi, now you are already our member</p>\n");
      out.write("<p>You already have 1 cat named \"Kitty\"</p>\n");
      out.write("<p></p>\n");
      out.write("<!-- End Feature -->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"box\">\n");
      out.write("            <p style=\"color: #fff\"><b>WikiNyan</b> &copy; 2019</p>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- End Footer -->\n");
      out.write("</body>\n");
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
