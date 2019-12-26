package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainPage_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<meta name=\"author\" content=\"Adib, Farrell, Waskito\">\n");
      out.write("\t<meta name=\"description\" content=\"WikiNyan\">\n");
      out.write("\t<title>WikiNyan | Home</title>\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\n");
      out.write("\t<script src=\"..\\Project\\jQuery\"></script>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\"#\").click(function(){\n");
      out.write("\t\t\t\t$(this).hide();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<!--<script>\n");
      out.write("\t\tvar nama = prompt('Masukan Nama Anda :');\n");
      out.write("\t\talert('Hai hai, ' + nama);\n");
      out.write("\t\talert('Enjoy our web yaa');\n");
      out.write("\t</script>-->\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\thtml {\n");
      out.write("\t\tscroll-behavior: smooth;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#section{\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<!-- Big Banner -->\n");
      out.write("<div id=\"div\">\n");
      out.write("<div class=\"big-banner\">\n");
      out.write("\t<div class=\"menu\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<h1>Wiki<span class=\"red\">Nyan</span></span></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"menulist\">\n");
      out.write("\t\t\t\t<a href=\"mainPage_login.jsp\">Home</a>\n");
      out.write("\t\t\t\t<a href=\"MeoHere.jsp\">Paw Here</a>\n");
      out.write("\t\t\t\t<a href=\"forum.jsp\">Meo Forum</a>\n");
      out.write("\t\t\t\t<a href=\"Contact.jsp\">Contact Us</a>\n");
      out.write("                                <a href=\"user.jsp\">Profile User</a>\n");
      out.write("                                <a href=\"LoginMember.jsp\">Logout</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"banner-text\">\n");
      out.write("\t\t<div class=\"box\">\n");
      out.write("\t\t\t<h1>Welcome to <span class=\"bold\">WikiNyan</span></h1>\n");
      out.write("\t\t<a href=\"#section\" class=\"btn-scroll\">Scroll Down</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- End Big Banner -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Contenct -->\n");
      out.write("<div class=\"advantage\" id=\"section\">\n");
      out.write("\t<div class=\"box\">\n");
      out.write("\t\t<div class=\"col-300\">\n");
      out.write("\t\t\t<h1>Apa itu WikiNyan?</h1>\n");
      out.write("\t\t\t<p>WikiNyan adalah website untuk mengenalkan jenis-jenis ras kucing kepada para pembaca, dan menginfluence pembaca agar lebih suka / tertarik pada kucing muehehe. Check our instagram for more cuteness</p>\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/wiki_nyan/\" class=\"btn-more\">Find More</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-600\">\n");
      out.write("\t\t\t<img src=\"image/bggg.jpg\" alt=\"WikiNyan\">\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- End Content -->\n");
      out.write("\n");
      out.write("<!-- About Us -->\n");
      out.write("<div class=\"feature\">\n");
      out.write("\t<div class=\"box\">\n");
      out.write("\t\t<center><h3>About Us</h3></center>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t<img src=\"image/icon/Picture3.png\" alt=\"Farrell Marston\">\n");
      out.write("\t\t\t<h3>Farrell Marston</h3>\n");
      out.write("\t\t\t<p>Office Boy</p>\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/axtradon/\"><img src=\"image/icon/ig.png\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t<img src=\"image/icon/Picture2.png\" alt=\"M. Adib Alfaini Afifi\">\n");
      out.write("\t\t\t<h3>Muhammad Adib Alfaini Afifi</h3>\n");
      out.write("\t\t\t<p>Founder</p>\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/adibalfaini.af/\"><img src=\"image/icon/ig.png\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t<img src=\"image/icon/Picture1.png\" alt=\"Waskito Melianto\">\n");
      out.write("\t\t\t<h3>Waskito Melianto</h3>\n");
      out.write("\t\t\t<p>Co-Founder</p>\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/wmelianto/\"><img src=\"image/icon/ig.png\"></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- End About Us -->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"box\">\n");
      out.write("\t\t<p><b>WikiNyan</b> &copy; 2019</p>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- End Footer -->\n");
      out.write("</body\t>\n");
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
