<%@page import="java.util.TreeMap"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%              
                 TreeMap tm=new TreeMap();
                if(session.getAttribute("u")==null)
                {
                    session.setAttribute("msg","Your Session has expired,please login to continue");
                    response.sendRedirect("index.jsp");
                }
                String customeremail=session.getAttribute("u").toString();
    
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/grabnsnatch","root","password");
                PreparedStatement pst = con.prepareStatement("select * from defaultaddress where email=?");
                pst.setString(1, customeremail);
                ResultSet rs=pst.executeQuery();
                rs.next();
                
                String item=request.getParameter("Items List");
                PreparedStatement pst1 = con.prepareStatement("select * from vendor_items where items=?");
                pst1.setString(1, item);
                ResultSet rs1=pst1.executeQuery();
                
                
                
                
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
    <title></title>
    <style type="text/css">
        body
        {
            font-family: Arial;
            font-size: 10pt;
        }
    </style>
    <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js? sensor=false&libraries=places"></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDEJc4ofXHIuuhc6-wlMrh2SOy2BjrQrdg&libraries=places&callback=GetRoute" async defer></script>

    <script type="text/javascript">
        var source, destination;
        var distance;
        var directionsDisplay;
        var directionsService = new google.maps.DirectionsService();
        google.maps.event.addDomListener(window, 'load', function () {
           
            new google.maps.places.SearchBox(document.getElementById('txtSource1'));
            new google.maps.places.SearchBox(document.getElementById('txtDestination'));
            directionsDisplay = new google.maps.DirectionsRenderer({  'draggable': true });
        });

            function GetRoute(x) {
            var x1=x;
            var mumbai = new google.maps.LatLng(18.9750, 72.8258);
            var mapOptions = {
                zoom: 7,
                center: mumbai
            };
            map = new google.maps.Map(document.getElementById('dvMap'), mapOptions);
            directionsDisplay.setMap(map);
            directionsDisplay.setPanel(document.getElementById('dvPanel'));

            //DIRECTIONS AND ROUTE//
            source = document.getElementById("txtSource1").value;
            destination = document.getElementById("txtDestination".concat(x1)).value;

            var request = {
                origin: source,
                destination: destination,
                travelMode: google.maps.TravelMode.DRIVING
            };
            directionsService.route(request, function (response, status) {
                if (status === google.maps.DirectionsStatus.OK) {
                    directionsDisplay.setDirections(response);
                }
            });

            //DISTANCE AND DURATION//
            var service = new google.maps.DistanceMatrixService();
            service.getDistanceMatrix({
                origins: [source],
                destinations: [destination],
                travelMode: google.maps.TravelMode.DRIVING,
                unitSystem: google.maps.UnitSystem.METRIC,
                avoidHighways: false,
                avoidTolls: false
            }, function (response, status) {
                if (status === google.maps.DistanceMatrixStatus.OK &&  response.rows[0].elements[0].status !== "ZERO_RESULTS") {
                    distance= response.rows[0].elements[0].distance.text;
                    var duration = response.rows[0].elements[0].duration.text;
                    var dvDistance = document.getElementById("dvDistance".concat(x1));
                    
                    dvDistance.innerHTML = "";
                    dvDistance.innerHTML += "<p>"+"Distance: " + distance + "</p>" +"<br />";
                    dvDistance.innerHTML += "<p>Duration:" + duration + "</p>";

                } else {
                    alert("Unable to find the distance via road.");
                }
            });
        }
    </script>
    </head>
    <body>
        <h1>The Location(s) !</h1>
        <div class="main-agileits">
        <form>
    <% 
                String s="";
                int i=0,d;
                while(rs1.next())
                {
                   i++;
                   s=Integer.toString(i);
                String vendoremail=rs1.getString(1);
               
                PreparedStatement pst2 = con.prepareStatement("select * from vendor_registration where Email=?");
                pst2.setString(1, vendoremail);
                ResultSet rs2=pst2.executeQuery();
                rs2.next();
                
    
    %>
    <table border="0" cellpadding="0" cellspacing="3">
        <tr>
            <td colspan="2">
                Source:
                <input type="text" id="<%="txtSource"+s%>"  value="<%=rs.getString(2) %>" style="width: 200px" readonly="true"/>
                &nbsp; Destination:
                <input type="text" id="<%="txtDestination"+s%>" value="<%=rs2.getString(6)+","+rs2.getString(9)+","+rs2.getString(10)+","+rs2.getString(11)+","+rs2.getString(12) %>" style="width: 500px" readonly="true"/>
                <br />
                <input type="button" value="Get Distance & Duration" onclick="GetRoute(<%=s%>)" />
                
                <hr>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <div id="<%="dvDistance"+s%>" class="inputs-w3ls">
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div id="dvMap" style="width: 0px; height: 0px">
                </div>
            </td>
            <td>
                <div id="dvPanel" style="width: 0px; height: 0px">
                </div>
            </td>
        </tr>
    </table>
    <script  type="text/javascript">GetRoute(<%=s%>);</</script>
    <br />
    
    <%
             
             }  
    %>
    <input class="register" type="submit" value="Logout" onclick="form.action='Logout';"> 
        </form>
        </div>
    </body>
    </html>