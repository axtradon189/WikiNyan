package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"author\" content=\"Adib, Farrell, Waskito\">\r\n");
      out.write("\t<meta name=\"description\" content=\"WikiNyan\">\r\n");
      out.write("\t<title>WikiNyan | Home</title>\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\r\n");
      out.write("\t<script src=\"..\\Project\\jQuery\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t$(\"#\").click(function(){\r\n");
      out.write("\t\t\t\t$(this).hide();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!--<script>\r\n");
      out.write("\t\tvar nama = prompt('Masukan Nama Anda :');\r\n");
      out.write("\t\talert('Hai hai, ' + nama);\r\n");
      out.write("\t\talert('Enjoy our web yaa');\r\n");
      out.write("\t</script>-->\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\thtml {\r\n");
      out.write("\t\tscroll-behavior: smooth;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#section{\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Big Banner -->\r\n");
      out.write("<div id=\"div\">\r\n");
      out.write("<div class=\"big-banner\">\r\n");
      out.write("\t<div class=\"menu\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<h1>Wiki<span class=\"red\">Nyan</span></span></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"menulist\">\r\n");
      out.write("\t\t\t\t<a href=\"MainPage.jsp\">Home</a>\r\n");
      out.write("\t\t\t\t<a href=\"MeoHere.jsp\">Paw Here</a>\r\n");
      out.write("\t\t\t\t<a href=\"forum.jsp\">Meo Forum</a>\r\n");
      out.write("\t\t\t\t<a href=\"Contact.jsp\">Contact Us</a>\r\n");
      out.write("                                <a href=\"LoginAdmin.jsp\">Login As Admin |</a>\r\n");
      out.write("                                <a href=\"LoginMember.jsp\">Login As Member</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"banner-text\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<h1>Welcome to <span class=\"bold\">WikiNyan</span></h1>\r\n");
      out.write("\t\t<a href=\"#section\" class=\"btn-scroll\">Scroll Down</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Big Banner -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Contenct -->\r\n");
      out.write("<div class=\"advantage\" id=\"section\">\r\n");
      out.write("\t<div class=\"box\">\r\n");
      out.write("\t\t<div class=\"col-300\">\r\n");
      out.write("\t\t\t<h1>Apa itu WikiNyan?</h1>\r\n");
      out.write("\t\t\t<p>WikiNyan adalah website untuk mengenalkan jenis-jenis ras kucing kepada para pembaca, dan menginfluence pembaca agar lebih suka / tertarik pada kucing muehehe. Check our instagram for more cuteness</p>\r\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/wiki_nyan/\" class=\"btn-more\">Find More</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-600\">\r\n");
      out.write("\t\t\t<img src=\"image/bggg.jpg\" alt=\"WikiNyan\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Content -->\r\n");
      out.write("\r\n");
      out.write("<!-- About Us -->\r\n");
      out.write("<div class=\"feature\">\r\n");
      out.write("\t<div class=\"box\">\r\n");
      out.write("\t\t<center><h3>About Us</h3></center>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"col-3\">\r\n");
      out.write("\t\t\t<img src=\"image/icon/Picture3.png\" alt=\"Farrell Marston\">\r\n");
      out.write("\t\t\t<h3>Farrell Marston</h3>\r\n");
      out.write("\t\t\t<p>Office Boy</p>\r\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/axtradon/\"><img src=\"image/icon/ig.png\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-3\">\r\n");
      out.write("\t\t\t<img src=\"image/icon/Picture2.png\" alt=\"M. Adib Alfaini Afifi\">\r\n");
      out.write("\t\t\t<h3>Muhammad Adib Alfaini Afifi</h3>\r\n");
      out.write("\t\t\t<p>Founder</p>\r\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/adibalfaini.af/\"><img src=\"image/icon/ig.png\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-3\">\r\n");
      out.write("\t\t\t<img src=\"image/icon/Picture1.png\" alt=\"Waskito Melianto\">\r\n");
      out.write("\t\t\t<h3>Waskito Melianto</h3>\r\n");
      out.write("\t\t\t<p>Co-Founder</p>\r\n");
      out.write("\t\t\t<a href=\"https://www.instagram.com/wmelianto/\"><img src=\"image/icon/ig.png\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End About Us -->\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"box\">\r\n");
      out.write("\t\t<p><b>WikiNyan</b> &copy; 2019</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Footer -->\r\n");
      out.write("</body\t>\r\n");
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
