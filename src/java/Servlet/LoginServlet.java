package Servlet;

import DatabaseConnection.DBConnection;
import Model.NyanModel;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;
    public LoginServlet() { 
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uName = request.getParameter("username");
        String pass = request.getParameter("password");

        try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("SELECT * from tbl_loginmember where username = ? and password = ?");
            ps.setString(1, uName);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RequestDispatcher rd = request.getRequestDispatcher("mainPage_login.jsp");
                request.setAttribute("uName", uName);
                rd.forward(request, response);
                response.sendRedirect("error.jsp");
            }
            if (rs.next()) {
                RequestDispatcher rds = request.getRequestDispatcher("mainPage_login.jsp");
                
            } else {
                response.sendRedirect("error.jsp");
            }
        } 
        catch (Exception e) {
            response.sendRedirect("error.jsp");
        }
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
        } catch (Exception e) {
            response.sendRedirect("error_admin.jsp");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
