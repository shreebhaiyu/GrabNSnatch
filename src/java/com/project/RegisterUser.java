/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 1405074
 */
public class RegisterUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HttpSession session=request.getSession();
            if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String name=request.getParameter("Name");
            int start = name.indexOf(' ');
            String firstName="";
            String lastName="";
            if (start >= 0) {
            firstName = name.substring(0, start);
            lastName = name.substring(start+1,name.length());
            }
            else
                firstName=name;
            String email=request.getParameter("Email");
            String password=request.getParameter("Password");
            String confirmpassword=request.getParameter("Confirm Password");
            String type=request.getParameter("User");

            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                PreparedStatement pst1;
                PreparedStatement pst = con.prepareStatement("insert into login values(?,?,?,?)");
                pst1= con.prepareStatement("insert into vendor_registration(firstname,lastname,Email) values(?,?,?)");
                PreparedStatement pst2 = con.prepareStatement("insert into defaultaddress (email) values (?)");
                pst.setString(1,email);
                pst.setString(2,password);
                pst.setString(3,type);
                pst.setString(4,name);
                pst1.setString(1,firstName);
                pst1.setString(2,lastName);
                pst1.setString(3,email);
                pst2.setString(1,email);
                int status=0,status1=0;
                
                if(!email.equals("") && !password.equals("") && !type.equals("") && !name.equals("") && password.equals(confirmpassword))
                {
                    status=pst.executeUpdate();
                    if(type.equals("customer"))
                    {
                        status1=pst2.executeUpdate();
                    }
                    else
                    {
                        status1=pst1.executeUpdate();
                    }
                }
                if(status>0 && status1>0)
                { 
                     RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                     rd.forward(request, response);
                     out.print("<center><br/><font color='green'>Registration Successful</font><br/><center>");
                }
                else
                {
                    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.forward(request, response);//could be forward also
                    out.print("<center><br/><font color='red'>Please fill correct details</font><br/><center>");
                }
            
            }
            catch(MySQLIntegrityConstraintViolationException e1)
            {
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                    rd.forward(request, response);
                out.println(e1.getMessage());
            }
            catch(Exception e)
            {
                out.print(e);
            }
            out.println("</body>");
            out.println("</html>");
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
