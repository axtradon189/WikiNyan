package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginMember_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/footer.jsp");
  }

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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>WikiNyan | Login</title>\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"panel panel-success\">\n");
      out.write("                <div class=\"panel-heading\" align=\"center\">\n");
      out.write("                    <h4><b><font color=\"black\">Login Page</font> </b></h4>\n");
      out.write("                    <form action=\"LoginServlet\" method=\"post\" >\n");
      out.write("                        <br><br>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                   Username \n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    :\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Masukkan Username\" required=\"required\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    Password\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    :\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Masukkan Password\" required=\"required\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                </td>\n");
      out.write("                                <td colspan=\"2\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success\" style=\"width: 195px;\"><b>Login</b></button>\n");
      out.write("                            <a href=\"index.jsp\"><button class=\"btn btn-success\" style=\"width: 90px\">Kembali</button></a>\n");
      out.write("                                </td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        <a href=\"Register.jsp\">Gak punya akun?</a>\n");
      out.write("                        <br><br>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/style.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"box\">\n");
      out.write("\t\t<p><b>WikiNyan</b> &copy; 2019</p>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
