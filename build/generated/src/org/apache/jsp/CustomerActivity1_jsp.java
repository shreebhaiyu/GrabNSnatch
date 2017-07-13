package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class CustomerActivity1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
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
      out.write("<style>\n");
      out.write(".redtext {\n");
      out.write("        color: white;\n");
      out.write("}\n");
      out.write(".menu div {\n");
      out.write("    padding: 0;}\n");
      out.write(".menu figure {display: inline-block;\n");
      out.write("}\n");
      out.write(".figures img{\n");
      out.write("    border-radius: 25px;\n");
      out.write("    margin: 2% 5% 2% 5%;\n");
      out.write("    padding: 2% 5% 2% 5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
              try{
                String em=session.getAttribute("u").toString();
    

      out.write(" \n");
      out.write("</head>\n");
      out.write("<body>   \n");
      out.write("  \n");
      out.write("\n");
      out.write("<h1>Have a nice day !</h1>\n");
      out.write("\n");
      out.write("<!--form-stars-here-->\n");
      out.write("<center>\n");
      out.write("<form method=\"post\">  \n");

}
catch(Exception e)
{
 System.out.println(e);
}

      out.write("\n");
      out.write("<input class=\"register\" type=\"submit\" value=\"Logout\" onclick=\"form.action='LogoutServlet';\">\n");
      out.write("<input class=\"register\" type=\"submit\" value=\"Provide Rating\" onclick=\"form.action='RatingServlet';\">\n");
      out.write("<input class=\"register\" type=\"submit\" value=\"Change Default address\" onclick=\"form.action='CustomerProfileServlet';\" > \n");
      out.write("<input class=\"register\" type=\"submit\" value=\"Use Default address\" onclick=\"form.action='ShopSearchServlet';\" > \n");
      out.write("<br/><br/><br/><br/><br/><br/><br/><br/><br/>\n");
      out.write("<section class=\"menu\">\n");
      out.write("    <div class=\"figures\">\n");
      out.write("<figure>\n");
      out.write("    <a href=\"BakersServlet\"><img src=\"indexdocs/images/baker.jpg\" height=\"250\" width=\"250\"/></a>\n");
      out.write("    <figcaption display:inline class=\"redtext\">Baked Items</figcaption>\n");
      out.write("</figure>\n");
      out.write("<figure>\n");
      out.write("    <a href=\"StationeryServlet\"><img src=\"indexdocs/images/bright-stationery-.jpg\" height=\"250\" width=\"250\"></a>\n");
      out.write("<figcaption class=\"redtext\">Stationery Items</figcaption>\n");
      out.write("</figure>\n");
      out.write("        <figure>\n");
      out.write("            <a href=\"BooksServlet\"><img src=\"indexdocs/images/pcjp-store.jpg\" height=\"250\" width=\"250\"></a>\n");
      out.write("<figcaption class=\"redtext\">Store</figcaption>\n");
      out.write("        </figure>\n");
      out.write("        <figure>\n");
      out.write("            <a href=\"MedicineServlet\"><img src=\"indexdocs/images/pharmacy-shop-.jpg\" height=\"250\" width=\"250\"></a>\n");
      out.write("<figcaption class=\"redtext\">Medicine</figcaption>\n");
      out.write("        </figure>\n");
      out.write("        <figure>\n");
      out.write("            <a href=\"WholesaleServlet\"><img src=\"indexdocs/images/wholesaler.jpeg\" height=\"250\" width=\"250\"></a>\n");
      out.write("<figcaption class=\"redtext\">wholesale Items</figcaption>\n");
      out.write("        </figure>\n");
      out.write("        <figure>\n");
      out.write("            <a href=\"ConfectioneryServlet\"><img src=\"indexdocs/images/confectionery.jpg\" height=\"250\" width=\"250\"></a>\n");
      out.write("<figcaption class=\"redtext\">Confectionery Items</figcaption>\n");
      out.write("        </figure>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("</form> \n");
      out.write("</center>\n");
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
