package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Vendorhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--A Design by W3layouts \n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Grab 'n' Snatch </title>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Easy Binary Forms Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"indexdocs/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- //Custom Theme files -->\n");
      out.write("<!-- web font -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Text+Me+One' rel='stylesheet' type='text/css'>\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700\" rel=\"stylesheet\">\n");
      out.write("<!--left-form-w3-agile -->\n");
      out.write("<!--right-map-w3-agile -->\n");
      out.write("<!-- //web font -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
          try{
                String em=session.getAttribute("u").toString();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                PreparedStatement pst = con.prepareStatement("select * from vendor_registration where Email=?");
                pst.setString(1,em);
                ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                String fname=rs.getString(1);
                String lname=rs.getString(2);
                String email=rs.getString(3);
                String phone=rs.getString(4);
                String shopcategory=rs.getString(5);
                String shopaddress=rs.getString(6);
                String gender=rs.getString(7);
                String shopname=rs.getString(8);
                }
    
    
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <a href=\"LogoutServlet\"><input type=\"button\" value=\"Logout\" style=\"height:30px; width:100px\"></a>\n");
      out.write("<h1>Vendor Profile</h1>\n");
      out.write("<div class=\"main-agileits\">\n");
      out.write("<!--form-stars-here-->\n");
      out.write("<div class=\"right-map-w3-agile\">\n");
      out.write("<h2>Personal Information</h2>\n");
      out.write("<form action=\"VendorProfileServlet\" method=\"post\">\n");
      out.write("<div class=\"inputs-w3ls\">\n");
      out.write("<p>First Name</p>\n");
      out.write("<input type=\"text\" name=\"name\" value=\"");
      out.print(rs.getString(1) );
      out.write("\" placeholder=\"Name\" readonly=\"true\" required=\"\">\n");
      out.write("</div>\n");
      out.write("<div class=\"inputs-w3ls\">\n");
      out.write("<p>Last Name</p>\n");
      out.write("<input type=\"text\" name=\"name\" value=\"");
      out.print(rs.getString(2) );
      out.write("\" placeholder=\"Name\" readonly=\"true\" required=\"\">\n");
      out.write("</div>\n");
      out.write("<p>Email</p>\n");
      out.write("<input type=\"text\" name=\"email\" value=\"");
      out.print(rs.getString(3) );
      out.write("\" placeholder=\"Email\" readonly=\"true\" required=\"\"/>\n");
      out.write("\n");
      out.write("<p>Phone</p>\n");
      out.write("<input type=\"text\" name=\"phone\" value=\"");
      out.print(rs.getString(4) );
      out.write("\" placeholder=\"Phone\" required=\"\"/>\n");
      out.write("\n");
      out.write("<p>Gender</p>\n");
      out.write("<div>\n");
      out.write("<label class=\"anim\">\n");
      out.write("<input type=\"radio\" class=\"radio\" name=\"gender\" value=\"male\" required=\"true\">\n");
      out.write("<span>Male</span>\n");
      out.write("<input type=\"radio\" class=\"radio\" name=\"gender\" value=\"female\" required=\"true\">\n");
      out.write("<span>Female</span>\n");
      out.write("</label>\n");
      out.write("</div>\n");
      out.write("<br/><br/>\n");
      out.write("<h2>Shop Information</h2>\n");
      out.write("<div class=\"inputs-w3ls\">\n");
      out.write("<p>Business</p>\n");
      out.write("<select name=\"business\">\n");
      out.write("  <option value=\"baker\">Baker</option>\n");
      out.write("  <option value=\"bookseller\">Book Seller</option>\n");
      out.write("  <option value=\"chemist\">Chemist</option>\n");
      out.write("  <option value=\"draper\">Draper</option>\n");
      out.write("  <option value=\"stationer\">Stationer</option>\n");
      out.write("  <option value=\"wholesaler\">Whole Saler</option>\n");
      out.write("  <option value=\"confectioner\">confectioner</option>\n");
      out.write("</select>\n");
      out.write("</div>\n");
      out.write("<div class=\"inputs-w3ls\">\n");
      out.write("<p>Shop Name</p>\n");
      out.write("<input type=\"text\" class=\"email\" name=\"shopname\" value=\"");
      out.print(rs.getString(8) );
      out.write("\" placeholder=\"Shop Address\" required=\"\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<p>Address</p>\n");
      out.write("<textarea rows=\"8\" cols=\"40\" name=\"address\"></textarea>>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<p>Country</p>\n");
      out.write("<input type=\"text\" name=\"country\" placeholder=\"Country\" required=\"\"/>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<p>State</p>\n");
      out.write("<input type=\"text\" name=\"state\" placeholder=\"State\" required=\"\"/>\n");
      out.write("\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("<p>City</p>\n");
      out.write("<input type=\"text\" name=\"city\" placeholder=\"City\" required=\"\"/>\n");
      out.write("<div class=\"inputs-w3ls\">\n");
      out.write("    <p>PIN Code</p>\n");
      out.write("    <input type=\"text\" name=\"zipcode\" placeholder=\"PIN\"/>\n");
      out.write("</div>\n");

}
catch(Exception e)
{
 System.out.println(e);
}

      out.write("\n");
      out.write("<input class=\"register\" type=\"submit\" value=\"Save and Continue\"> \n");
      out.write("</form> \n");
      out.write("</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("</div> \n");
      out.write("</body>\n");
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
