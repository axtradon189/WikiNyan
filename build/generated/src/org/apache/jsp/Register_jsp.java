package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>WikiNyan | Resgiter</title>\n");
      out.write("        <link href=\"CSS/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"panel panel-success\">\n");
      out.write("                <div class=\"panel-heading\" align=\"center\">\n");
      out.write("                    <h4><b><font color=\"black\">Register</font> </b></h4>\n");
      out.write("                    <form action=\"registeraction.jsp\" method=\"post\" >\n");
      out.write("                        <br><br>\n");
      out.write("                        <table>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                   User ID \n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    :\n");
      out.write("                                </td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
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
      out.write("                                    <button type=\"submit\" class=\"btn btn-success\" style=\"width: 195px;\"><b>Resgiter</b></button>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <br><br>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
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
