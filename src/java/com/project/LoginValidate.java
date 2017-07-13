/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project;

import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 1405074
 */
public class LoginValidate extends HttpServlet {

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
            
            
            String email=request.getParameter("Email");
            String password=request.getParameter("Password");
            try{
                Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                PreparedStatement pst = con.prepareStatement("select * from login where Email=? and Password=?");
                pst.setString(1,email);
                pst.setString(2,password);
                
                ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                String str=rs.getString(3);
                if(str.equals("admin"))
                {
                    HttpSession session=request.getSession(true);
                    session.setAttribute("u",rs.getString(1));
                    RequestDispatcher rd=request.getRequestDispatcher("Adminhome.jsp");
                    rd.forward(request, response);
                }
                else if(str.equals("customer"))
                {
                    
                    HttpSession session=request.getSession();
                    session.setAttribute("n",rs.getString(4));
                    session.setAttribute("u",rs.getString(1));
                    RequestDispatcher rd=request.getRequestDispatcher("CustomerActivity1.jsp");
                    rd.forward(request, response);
                }
                else
                {
                    HttpSession session=request.getSession();
                    session.setAttribute("n",rs.getString(4));
                    session.setAttribute("u",rs.getString(1));
                    
                    RequestDispatcher rd=request.getRequestDispatcher("Vendorhome.jsp");
                    rd.forward(request, response);
                }
              
            }
            else
            {
                
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                rd.include(request, response);//could be forward also
                out.print("<center><br/><font color='red' size='4'>User Name or password incorrect</font><br/><center>");
              //out.print("<a href='index.jsp'>Please Enter again</a>");
            }
            }
            catch(Exception e)
            {
                System.out.println("e");
            }
            /*
            out.println("</body>");
            out.println("</html>");*/
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
