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


<%          try{
                if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
                String business=session.getAttribute("business").toString();
    
    %> 
</head>
<body>   
    

<h1>Hey! you are a <%=business %></h1>
<div class="main-agileits">
<!--form-stars-here-->
<center>
<form action="UpdateItemServlet" method="post">
<table border="1">
    <tr>
    <th><div class="inputs-w3ls"><p>Items</p></div></th>
    <th><div class="inputs-w3ls"><p>Price</p></div></th>
    <th><div class="inputs-w3ls"><p>Quantity</p></div></th>
    </tr>
    <tr>
        <td><input type="text" name="Item1" ></td>
        <td><input type="text" name="Price1" ></td>
        <td><input type="text" name="Quantity1"></td>
    </tr>
    <tr>
        <td><input type="text" name="Item2"></td>
        <td><input type="text" name="Price2"></td>
        <td><input type="text" name="Quantity2"></td>
    </tr>
    <tr>
        <td><input type="text" name="Item3"></td>
        <td><input type="text" name="Price3"></td>
        <td><input type="text" name="Quantity3"></td>
    </tr>
    <tr>
        <td><div class="inputs-w3ls"><input type="text" name="Item4"></div></td>
        <td><div class="inputs-w3ls"><input type="text" name="Price4"></div></td>
        <td><div class="inputs-w3ls"><input type="text" name="Quantity4"></div></td>
    </tr>
    <tr>
        <td><div class="inputs-w3ls"><input type="text" name="Item5"></div></td>
        <td><div class="inputs-w3ls"><input type="text" name="Price5"></div></td>
        <td><div class="inputs-w3ls"><input type="text" name="Quantity5"></div></td>
    </tr>
    <tr>
        <td><div class="inputs-w3ls"><input type="text" name="Item6"></div></td>
        <td><div class="inputs-w3ls"><input type="text" name="Price6"></div></td>
        <td><div class="inputs-w3ls"><input type="text" name="Quantity6"></div></td>
    </tr>
   <tr>
        <td><input type="text" name="Item7"></td>
        <td><input type="text" name="Price7"></td>
        <td><input type="text" name="Quantity7"></td>
    </tr>
    <tr>
        <td><input type="text" name="Item8"></td>
        <td><input type="text" name="Price8"></td>
        <td><input type="text" name="Quantity8"></td>
    </tr>
    <tr>
        <td><input type="text" name="Item9"></td>
        <td><input type="text" name="Price9"></td>
        <td><input type="text" name="Quantity9"></td>
    </tr>
    <tr>
        <td><input type="text" name="Item10"></td>
        <td><input type="text" name="Price10"></td>
        <td><input type="text" name="Quantity10"></td>
    </tr>
</table>

    
<%
}
catch(Exception e)
{
 System.out.println(e);
}
%>
<input class="register" type="submit" value="Logout" onclick="form.action='Logout';">
<input class="register" type="submit" value="Save and Continue" onclick="form.action='UpdateItemServlet';" >
<input class="register" type="submit" value="View Added Items" onclick="form.action='ViewAddedItems.jsp';" >
</form> 
</center>
</div>

<div class="clear"></div>

</body>
</html>