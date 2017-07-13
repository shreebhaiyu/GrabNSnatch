<%-- 
    Document   : Adminhome
    Created on : Jan 22, 2017, 4:50:26 PM
    Author     : 1405074
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!doctype html>

              <%  if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
              %>

<html>
    <head>
<title>Grab 'n' Snatch </title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Easy Binary Forms Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="indexdocs/css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href='//fonts.googleapis.com/css?family=Text+Me+One' rel='stylesheet' type='text/css'>
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
<!--left-form-w3-agile -->
<!--right-map-w3-agile -->
<!-- //web font -->
<style>
.redtext {
        color: white;
}
.menu div {
    padding: 0;}
.menu figure {display: inline-block;
}
.figures img{
    border-radius: 25px;
    margin: 2% 5% 2% 5%;
    padding: 2% 5% 2% 5%;
}


</style>

<%              try{
                if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
                String em=session.getAttribute("u").toString();
    
%> 
</head>
<body>   
  

<h1>Have a nice day !</h1>

<!--form-stars-here-->
<center>
<form method="post">  
<%
}
catch(Exception e)
{
 System.out.println(e);
}
%>
<input class="register" type="submit" value="Logout" onclick="form.action='Logout';">
<input class="register" type="submit" value="Change Default address" onclick="form.action='ChangeDefaultAddress.jsp';" > 
<input class="register" type="submit" value="View Default address" onclick="form.action='ViewDefaultAddress.jsp';" > 
<br/><br/><br/><br/><br/><br/><br/><br/><br/>
<section class="menu">
    <div class="figures">
<figure>
    <a href="CustomerActivity2.jsp?param=baker"><img src="indexdocs/images/baker.jpg" height="250" width="250"/></a>
    <figcaption display:inline class="redtext">Baked Items</figcaption>
</figure>
<figure>
    <a href="CustomerActivity2.jsp?param=stationer"><img src="indexdocs/images/bright-stationery-.jpg" height="250" width="250"></a>
    <figcaption class="redtext">Stationery Items</figcaption>
</figure>
<figure>
    <a href="CustomerActivity2.jsp?param=bookseller"><img src="indexdocs/images/pcjp-store.jpg" height="250" width="250"></a>
    <figcaption class="redtext">Store</figcaption>
</figure>
<figure>
    <a href="CustomerActivity2.jsp?param=chemist"><img src="indexdocs/images/pharmacy-shop-.jpg" height="250" width="250"></a>
    <figcaption class="redtext">Medicine</figcaption>
</figure>
<figure>
    <a href="CustomerActivity2.jsp?param=wholesaler"><img src="indexdocs/images/wholesaler.jpeg" height="250" width="250"></a>
    <figcaption class="redtext">wholesale Items</figcaption>
</figure>
<figure>
    <a href="CustomerActivity2.jsp?param=confectioner"><img src="indexdocs/images/confectionery.jpg" height="250" width="250"></a>
    <figcaption class="redtext">Confectionery Items</figcaption>
</figure>
</div>
</section>
</form> 
</center>
</body>
</html>