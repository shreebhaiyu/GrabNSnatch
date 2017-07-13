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
public class UpdateItemServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            String item="";
            String price="";
            String quantity="";
            try{
                HttpSession session=request.getSession(true);
                if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                String email=session.getAttribute("u").toString();
                
                String business=session.getAttribute("business").toString();
                 int status=0;
                 int status1=0;
                 
                for(int i=1;i<=10;i++)
                {
                    status=0;
                    status1=0;
                    PreparedStatement pst = con.prepareStatement("insert into vendor_items (email,items,price,quantity)values(?,?,?,?)");
                    PreparedStatement pst1= con.prepareStatement("select * from items where items=?");
                    PreparedStatement pst2 = con.prepareStatement("insert into items (items,business)values(?,?)");
                    item=request.getParameter("Item"+Integer.toString(i));
                    price=request.getParameter("Price"+Integer.toString(i));
                    quantity=request.getParameter("Quantity"+Integer.toString(i));
                    if(!item.equals("") && !price.equals("") && !quantity.equals(""))
                    {
                        pst.setString(1, email);
                        pst.setString(2, item);
                        pst.setString(3, price);
                        pst.setString(4, quantity);
                        pst1.setString(1, item);
                        pst2.setString(1,item);
                        pst2.setString(2, business);
                        ResultSet rs=pst1.executeQuery();
                        if(!rs.next())
                        status1=pst2.executeUpdate();
                        status=pst.executeUpdate();
                        
                if(status>0 )
                {
                     
                     response.sendRedirect("SelectItems.jsp");
                     out.print("<center><br/><font color='green'>Items Updated Successfully</font><br/><center>");
                     
                }
                else
                {
                    RequestDispatcher rd=request.getRequestDispatcher("SelectItems.jsp");
                    rd.include(request, response);//could be forward also
                    out.print("<center><br/><font color='red'>Please fill complete details</font><br/><center>");
                    
                }
                        
                 }
                    else
                    {
                    RequestDispatcher rd=request.getRequestDispatcher("SelectItems.jsp");
                    rd.forward(request, response);//could be forward also
                    out.print("<center><br/><font color='red'>Please fill complete details</font><br/><center>");
                    }
                }        
            }
            catch(MySQLIntegrityConstraintViolationException e1)
            {
                    RequestDispatcher rd=request.getRequestDispatcher("SelectItems.jsp");
                    rd.include(request, response);
                    out.print("<center><br/><font color='red'>"+"Record Already Exists"+"</font><br/><center>");
                    out.println("<center><br/><font color='red'>"+e1.getMessage()+"</font><br/><center>");
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
