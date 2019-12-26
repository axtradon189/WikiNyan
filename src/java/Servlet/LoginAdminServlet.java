package Servlet;

import DatabaseConnection.DBConnection;
import Model.NyanModel;
import static Servlet.LoginServlet.conn;
import static Servlet.LoginServlet.ps;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAdminServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uName = request.getParameter("username");
        String pass = request.getParameter("password");

        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("SELECT * from tbl_loginadmin where username = ? and password = ?");
            ps.setString(1, uName);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RequestDispatcher rd = request.getRequestDispatcher("AdminPage.jsp");
                request.setAttribute("uName", uName);
                rd.forward(request, response);
                response.sendRedirect("error_admin.jsp");
            }
              if (rs.next()) {
                RequestDispatcher rda = request.getRequestDispatcher("mainPage_login.jsp");
                
            } else {
                response.sendRedirect("error_admin.jsp");
            }
        } catch (Exception e) {
            response.sendRedirect("error_admin.jsp");
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
        processRequest(request, response);
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
