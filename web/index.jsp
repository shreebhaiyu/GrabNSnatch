<%-- 
    Document   : index
    Created on : Jan 22, 2017, 4:05:47 PM
    Author     : 1405074
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

<!-- //web font -->
</head>
<body>
<h1>GRAB 'n' SNATCH</h1>
<div class="main-agileits">
<!--form-stars-here-->
<div class="left-form-w3-agile">
    <h2>Login</h2>
        <form action="LoginValidate" method="post">
        <p>Email</p>
	<input type="email" class="email" name="Email" placeholder="Email" required=""/>
		<p>Password</p>
		<input type="password" class="password" name="Password" placeholder="Password" required=""/>
		<div class="wthree-text"> 
		<ul> 
		<li>
	<label class="anim">
	<input type="checkbox" class="checkbox">													<span> Remember me ?</span> 
        </label> 
	        </li>
	
                
                
	</ul>
	<div class="clear"> </div>
	</div>  
	<input type="submit" value="LOGIN"> 
</form>
</div>
<!--//form-ends-here-->
		<div class="right-map-w3-agile">
		<h2>Register</h2>
			<form action="RegisterUser" method="post">
			<div class="inputs-w3ls">
				<p>Name</p>
					<input type="text" name="Name" placeholder="" required="">
			</div>
			<div class="inputs-w3ls">
				<p>Email</p>
					<input type="email" class="email" name="Email" placeholder="" required=""/>
			</div>
			<div class="inputs-w3ls">
				<p>Password</p>
					<input type="password" class="password" name="Password" placeholder="" required=""/>
			</div>
			<div class="inputs-w3ls">
				<p>Confirm Password</p>
					<input type="password" class="password" name="Confirm Password" placeholder="" required=""/>
			</div>		
                            <div>
                                <label class="anim">
                                    <input type="radio" class="radio" name="User" value="customer" required="true">
					    <span>Customer</span> 
                                            
                                            <input type="radio" class="radio" name="User" value="vendor" required="true">
					    <span>Vendor</span> 
                                </label>
                            </div>
					<label class="anim">
                                            <input type="checkbox" class="checkbox" required="true">
					    <span> I accept the terms of use</span> 
					</label> 
                                        
						<input class="register" type="submit" value="REGISTER">  
			</form> 
		</div>
<div class="clear"></div>
</div>
</body>
</html>
