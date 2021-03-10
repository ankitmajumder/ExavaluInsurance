/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exavaluservelet;

import exavaluUtilities.connectionProvidertoDb;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thomas
 */
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //get the parameters form request
            String emailaddress = request.getParameter("email_address");
            String password = request.getParameter("password");
            /* TODO output your page here. You may use following sample code. */

            Connection connection = connectionProvidertoDb.getConnectionObject().getConnection("C:\\Users\\91801\\Documents\\NetBeansProjects\\ExabalueInsuranceApplication\\config\\dbParams.properties");
//            connection con = ConnectionProviderToDB.getConnectionObject().getConnection("D:\\Exavalu\\2021-Campus Drive - Training\\Projects\\ExavaluInsuranceApplication\\config\\db_params.properties");
            // PreparedStatement ps;
//            ps = connection.prepareStatement("select * from login where email_address=? and password=?");
//            ps.setString(1, emailaddress);
//            ps.setString(2, password);
//            ResultSet rs =ps.executeQuery();
            String sql = "SELECT * FROM login_credentials where email_address=? and password=?";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, emailaddress);

            stmt.setString(2, password);

            System.out.println("Sql to execute=" + stmt);

            // execute SQL
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {

                //user present
                System.out.println("Login Successful...........");

                RequestDispatcher rd = request.getRequestDispatcher("homePage.html");

                rd.forward(request, response);

            } else {

                //failed validation
                System.out.println("Login Not Successful...........");

                RequestDispatcher rd = request.getRequestDispatcher("login.html");

                rd.forward(request, response);

            }

            //established the connection to db
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet login</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Data Recived " + emailaddress + " and " + password + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
