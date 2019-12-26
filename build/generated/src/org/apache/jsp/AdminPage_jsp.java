package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.Nyan;
import Model.NyanModel;
import java.util.*;

public final class AdminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\t<title>WikiNyan | Admin Page</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"author\" content=\"Adib, Farrell, Waskito\">\r\n");
      out.write("\t<meta name=\"description\" content=\"WikiNyan\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900\" rel=\"stylesheet\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/styleAdminPage.css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\">\r\n");
      out.write("        <style>\r\n");
      out.write("table.table {\r\n");
      out.write("  font-family: \"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("  border: 6px solid #BAA193;\r\n");
      out.write("  background-color: #FFC0CB;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("table.table td, table.table th {\r\n");
      out.write("  border: 2px solid #948473;\r\n");
      out.write("  padding: 2px 2px;\r\n");
      out.write("}\r\n");
      out.write("table.table tbody td {\r\n");
      out.write("  font-size: 13px;\r\n");
      out.write("  color: #000000;\r\n");
      out.write("}\r\n");
      out.write("table.table thead {\r\n");
      out.write("  background: #948473;\r\n");
      out.write("}\r\n");
      out.write("table.table thead th {\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: #F0F0F0;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("}\r\n");
      out.write("#Font {\r\n");
      out.write("font-family: \"Comic Sans MS\", cursive, sans-serif;\r\n");
      out.write("font-size: 25px;\r\n");
      out.write("letter-spacing: 2px;\r\n");
      out.write("word-spacing: 2px;\r\n");
      out.write("color: #000000;\r\n");
      out.write("font-weight: 400;\r\n");
      out.write("text-decoration: none solid rgb(68, 68, 68);\r\n");
      out.write("font-style: normal;\r\n");
      out.write("font-variant: normal;\r\n");
      out.write("text-transform: none;\r\n");
      out.write("}\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Big Banner -->\r\n");
      out.write("<div class=\"big-banner\">\r\n");
      out.write("\t<div class=\"menu\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<h1>Wiki<span class=\"red\">Nyan</span></span></h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("                    <div class=\"menulist\">\r\n");
      out.write("                        <a href=\"index.jsp\">Logout</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Big Banner -->\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<!-- Read Data -->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <title>View Users</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <h1 id=\"Font\">User List</h1>\r\n");
      out.write("        ");

            List<NyanModel> list = Nyan.getAllRecords();
            request.setAttribute("list", list);
        
      out.write("\r\n");
      out.write("        <table class=\"table\" border=\"1\" width=\"80%\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ID User</th>\r\n");
      out.write("                <th>Username</th>\r\n");
      out.write("                <th>Password</th>\r\n");
      out.write("                <th>Edit User</th>\r\n");
      out.write("                <th>Delete User</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <thead>\r\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("    <br><br><br><br>   <br><br><br><br><br><br><br><br>   <br><br><br><br>       <br><br><br><br>       <br><br>\r\n");
      out.write("<!-- End Read Data -->\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"box\">\r\n");
      out.write("\t\t<p><b>WikiNyan</b> &copy; 2019</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End Footer -->\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("b");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tbody>\r\n");
          out.write("                <tr>\r\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                    <td>\r\n");
          out.write("                        <a style=\"color: #000000\" href=\"edituserform.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a>\r\n");
          out.write("                    </td>\r\n");
          out.write("                    <td>\r\n");
          out.write("                        <a style=\"color: #000000\" href=\"deleteuser.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a>\r\n");
          out.write("                    </td>\r\n");
          out.write("                </tr>\r\n");
          out.write("            <tbody>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
