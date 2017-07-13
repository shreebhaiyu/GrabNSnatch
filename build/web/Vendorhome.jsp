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
<form>
<input class="register" type="submit" value="Logout" onclick="form.action='Logout';">
</form>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<meta name="keywords" content="Easy Binary Forms Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="indexdocs/css/style.css" rel="stylesheet" type="text/css" media="all" >
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
                String em=session.getAttribute("u").toString();
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                PreparedStatement pst = con.prepareStatement("select * from vendor_registration where Email=?");
                pst.setString(1,em);
                ResultSet rs=pst.executeQuery();
                if(rs.next())
                {
                String shopcategory=rs.getString(5);
                session.setAttribute("business",shopcategory);
                }
%> 
</head>

<body>   
<h1>Vendor Profile</h1>
<div class="main-agileits">
<!--form-stars-here-->
<div class="right-map-w3-agile">
<h2>Personal Information</h2>
<form action="VendorProfileServlet" method="post">
<div class="inputs-w3ls">
<p>First Name</p>
<input type="text" name="name" value="<%=rs.getString(1) %>" placeholder="Name" readonly="true" required="">
</div>
<div class="inputs-w3ls">
<p>Last Name</p>
<input type="text" name="name" value="<%=rs.getString(2) %>" placeholder="Name" readonly="true" required="">
</div>
<p>Email</p>
<input type="text" name="email" value="<%=rs.getString(3) %>" placeholder="Email" readonly="true" required="">

<p>Phone</p>
<input type="text" name="phone" value="<%=rs.getString(4) %>" placeholder="Phone" required="">

<p>Gender</p>
<div>
<label class="anim">
    <input type="radio" class="radio" name="gender" value="male" required="true" checked="checked">
<span>Male</span>
<input type="radio" class="radio" name="gender" value="female" required="true">
<span>Female</span>
</label>
</div>
<br><br>
<h2>Shop Information</h2>
<div class="inputs-w3ls">
<p>Business</p>
<select name="business">
  <option value="baker">Baker</option>
  <option value="bookseller">Book Seller</option>
  <option value="chemist">Chemist</option>
  <option value="stationer">Stationer</option>
  <option value="wholesaler">WholeSaler</option>
  <option value="confectioner">confectioner</option>
</select>
</div>
<div class="inputs-w3ls">
<p>Shop Name</p>
<input type="text" class="email" name="shopname" value="<%=rs.getString(8) %>" placeholder="Shop Address" required="">
</div>

<p>Address</p>
<textarea rows="8" cols="40" name="address"><%=rs.getString(6) %></textarea>

<br>

<p>Country</p>
<input type="text" name="country" value="<%=rs.getString(9) %>" placeholder="Country" required="">

<br>

<p>State</p>
<input type="text" name="state" value="<%=rs.getString(10) %>" placeholder="State" required="">

<br>

<p>City</p>
<input type="text" name="city" value="<%=rs.getString(11) %>" placeholder="City" required="">
<div class="inputs-w3ls">
    <p>PIN Code</p>
    <input type="text" name="zipcode" value="<%=rs.getString(12) %>" placeholder="PIN">
</div>
<%
}
catch(Exception e)
{
 System.out.println(e);
}
%>


<input class="register" type="submit" value="Save and Continue"> 

</form> 
</div>
<div class="clear"></div>
</div> 
</body>
</html>