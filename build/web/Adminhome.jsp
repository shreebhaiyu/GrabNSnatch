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


    <%          
                if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
                String email=session.getAttribute("u").toString();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                PreparedStatement pst = con.prepareStatement("select * from vendor_registration");
                ResultSet rs=pst.executeQuery();
                PreparedStatement pst1 = con.prepareStatement("select * from defaultaddress");
                ResultSet rs1=pst1.executeQuery();
                PreparedStatement pst2 = con.prepareStatement("select * from vendor_items");
                ResultSet rs2=pst2.executeQuery();
    %> 
</head>
<body>   
    <h1>Hi Admin !</h1>
<div class="main-agileits">
<!--form-stars-here-->
<div class="left-form-w3-agile">
    <Center><h2>Vendor Details</h2></center>
</div>
<form>
<center>
<table>
    <tr>
        <th><div class="inputs-w3ls"><p>Email</p></div></th>
        <th><div class="inputs-w3ls"><p>Name</p></div></th>
        <th><div class="inputs-w3ls"><p>Address</p></div></th>
        <th><div class="inputs-w3ls"><p>Category</p></div></th>
        <th><div class="inputs-w3ls"><p>Phone</p></div></th>
    </tr>
    <%
       while(rs.next())
       {
    %>
        <tr>
            <td><input type="text" value=<%=rs.getString(3) %> readonly="true" ></td>
            <td><input type="text" value="<%=rs.getString(1)+" "+rs.getString(2) %>" readonly="true" ></td>
            <td><input type="text" value="<%=rs.getString(8)+","+rs.getString(6)+","+rs.getString(9)+","+rs.getString(10)+","+rs.getString(11)+","+rs.getString(12) %>" readonly="true" ></td>
            <td><input type="text" value=<%=rs.getString(5) %> readonly="true" ></td>
            <td><input type="text" value=<%=rs.getString(4) %> readonly="true" ></td>
        </tr>
    <%
       }
    %>
</table>

<br/><br><br>
<div class="left-form-w3-agile">
    <Center><h2>Customer Details</h2></center>
</div>
<br><br>
<table>
    <tr>
        <th><div class="inputs-w3ls"><p>Email</p></div></th>
        <th><div class="inputs-w3ls"><p>Name</p></div></th>
        <th><div class="inputs-w3ls"><p>Default Address</p></div></th>
    </tr>
    <%
       while(rs1.next())
       {
        PreparedStatement pst3 = con.prepareStatement("select * from login where Email=?");
        pst3.setString(1, rs1.getString(1));
        ResultSet rs3=pst3.executeQuery();           
        rs3.next();

    %>
        <tr>
            <td><input type="text" value="<%=rs1.getString(1) %>" readonly="true" ></td>
            <td><input type="text" value="<%=rs3.getString(4) %>" readonly="true" ></td>
            <td><input type="text" value="<%=rs1.getString(2) %>" readonly="true" ></td>
        </tr>
    <%
       }
    %>
</table>

</center>
<input class="register" type="submit" value="Logout" onclick="form.action='Logout';"> 
</form>
</div>

<div class="clear"></div>

</body>
</html>