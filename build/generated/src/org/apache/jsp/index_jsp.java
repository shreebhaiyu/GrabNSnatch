package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Grab 'n' Snatch </title>\n");
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
      out.write("\n");
      out.write("<!-- //web font -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>GRAB 'n' SNATCH</h1>\n");
      out.write("<div class=\"main-agileits\">\n");
      out.write("<!--form-stars-here-->\n");
      out.write("<div class=\"left-form-w3-agile\">\n");
      out.write("    <h2>Login</h2>\n");
      out.write("        <form action=\"LoginValidate\" method=\"post\">\n");
      out.write("        <p>Email</p>\n");
      out.write("\t<input type=\"email\" class=\"email\" name=\"Email\" placeholder=\"Email\" required=\"\"/>\n");
      out.write("\t\t<p>Password</p>\n");
      out.write("\t\t<input type=\"password\" class=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\"/>\n");
      out.write("\t\t<div class=\"wthree-text\"> \n");
      out.write("\t\t<ul> \n");
      out.write("\t\t<li>\n");
      out.write("\t<label class=\"anim\">\n");
      out.write("\t<input type=\"checkbox\" class=\"checkbox\">\t\t\t\t\t\t\t\t\t\t\t\t\t<span> Remember me ?</span> \n");
      out.write("        </label> \n");
      out.write("\t        </li>\n");
      out.write("\t<li> <a href=\"#\">Forgot password?</a> </li>\n");
      out.write("\t</ul>\n");
      out.write("\t<div class=\"clear\"> </div>\n");
      out.write("\t</div>  \n");
      out.write("\t<input type=\"submit\" value=\"LOGIN\"> \n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("<!--//form-ends-here-->\n");
      out.write("\t\t<div class=\"right-map-w3-agile\">\n");
      out.write("\t\t<h2>Register</h2>\n");
      out.write("\t\t\t<form action=\"RegisterUser\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"inputs-w3ls\">\n");
      out.write("\t\t\t\t<p>Name</p>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"Name\" placeholder=\"\" required=\"\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputs-w3ls\">\n");
      out.write("\t\t\t\t<p>Email</p>\n");
      out.write("\t\t\t\t\t<input type=\"email\" class=\"email\" name=\"Email\" placeholder=\"\" required=\"\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputs-w3ls\">\n");
      out.write("\t\t\t\t<p>Password</p>\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"password\" name=\"Password\" placeholder=\"\" required=\"\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"inputs-w3ls\">\n");
      out.write("\t\t\t\t<p>Confirm Password</p>\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"password\" name=\"Confirm Password\" placeholder=\"\" required=\"\"/>\n");
      out.write("\t\t\t</div>\t\t\n");
      out.write("                            <div>\n");
      out.write("                                <label class=\"anim\">\n");
      out.write("                                    <input type=\"radio\" class=\"radio\" name=\"User\" value=\"customer\" required=\"true\">\n");
      out.write("\t\t\t\t\t    <span>Customer</span> \n");
      out.write("                                            \n");
      out.write("                                            <input type=\"radio\" class=\"radio\" name=\"User\" value=\"vendor\" required=\"true\">\n");
      out.write("\t\t\t\t\t    <span>Vendor</span> \n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t<label class=\"anim\">\n");
      out.write("                                            <input type=\"checkbox\" class=\"checkbox\" required=\"true\">\n");
      out.write("\t\t\t\t\t    <span> I accept the terms of use</span> \n");
      out.write("\t\t\t\t\t</label> \n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t\t<input class=\"register\" type=\"submit\" value=\"REGISTER\">  \n");
      out.write("\t\t\t</form> \n");
      out.write("\t\t</div>\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
