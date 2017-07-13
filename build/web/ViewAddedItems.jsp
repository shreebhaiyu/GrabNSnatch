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



</head>
<body>   
    
<% String business=session.getAttribute("business").toString(); %>
<h1>Hey! you are a <%=business %></h1>
<div class="main-agileits">
<!--form-stars-here-->
<center>
<form action="UpdateServlet" method="post">
<table border="1">
    <tr>
    <th><div class="inputs-w3ls"><p>Items</p></div></th>
    <th><div class="inputs-w3ls"><p>Price</p></div></th>
    <th><div class="inputs-w3ls"><p>Quantity</p></div></th>
    <th><div class="inputs-w3ls"><p>Update</p></div></th>
    <th><div class="inputs-w3ls"><p>Delete</p></div></th>
    </tr>
    <%
        try{
                if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
                String em=session.getAttribute("u").toString();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                PreparedStatement pst = con.prepareStatement("select * from vendor_items where email=?");
                pst.setString(1,em);
                ResultSet rs=pst.executeQuery();
                int i=1;
                while(rs.next())
                {
                String s=Integer.toString(i);
                String item="Item"+s;
                String price="Price"+s;
                String quantity="Quantity"+s;
    %>
        <tr>
            <td><input type="text" name=<%=item %> value="<%=rs.getString(2) %>" readonly="true" ></td>
            <td><input type="text" name=<%=price %> value="<%=rs.getString(3)  %>"></td>
            <td><input type="text" name=<%=quantity %> value="<%=rs.getString(4) %>"></td>
        <td> <input class="register" type="submit" value="Update" onclick="form.action='UpdateServlet?uid=<%=s %>';"> 
        </td>
        <td><input class="register" type="submit" value="Delete" onclick="form.action='DeleteServlet?uid=<%=s %>';">  
        </td>
        </tr>
        <%
        i++;
        }
        %>
</table>

    
<%
}
catch(Exception e)
{
 System.out.println(e);
}
%>
<input class="register" type="submit" value="Logout" onclick="form.action='Logout';">
<input class="register" type="submit" value="Back" onclick="form.action='SelectItems.jsp';" >
</form> 
</center>
</div>

<div class="clear"></div>

</body>
</html>