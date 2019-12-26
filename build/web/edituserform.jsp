<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta charset="utf-8">
	<meta name="author" content="Adib, Farrell, Waskito">
	<meta name="description" content="WikiNyan">
	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="CSS/styleAdminPage.css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
        <title>Edit Form</title>
        <style>
#Font {
font-family: "Comic Sans MS", cursive, sans-serif;
letter-spacing: 2px;
word-spacing: 2px;
color: #000000;
font-weight: 400;
text-decoration: none solid rgb(68, 68, 68);
font-style: normal;
font-variant: normal;
text-transform: none;
}
input
{
	background: #fff;
	color: #000;
	padding: 10px 15px;
	border-radius: 10px;
	text-decoration: none;  
        
}
button
{
	background: #fff;
	color: #000;
	padding: 10px 15px;
	border-radius: 10px;
	text-decoration: none;
	display: inline-block;
        
}
button:hover
{
	background: #FFEFD5;
	transition: 0.5s;
}
        </style>
    </head>
    <body>
        <div class="big-banner">
	<div class="menu">
		<div class="box">
			<div class="logo">
				<h1>Wiki<span class="red">Nyan</span></span></h1>
			</div>
                    <div class="menulist">
                        <a href="index.jsp">Logout</a>
                    </div>
		</div>
	</div>
</div>
        <br>
        <br>
        <%@page import="Controller.Nyan,Model.NyanModel"%>

        <%
            String id = request.getParameter("id");
            NyanModel b = Nyan.getRecordById(Integer.parseInt(id));
        %>

        <h1 id="Font">Edit Form</h1>
        <form action="edituser.jsp" method="post">
            <input type="hidden" name="id" value="<%=b.getId()%>"/>
            <table>
                
                <tr><td id="Font">Name : </td><td><input type="text" name="username" value="<%= b.getUsername()%>"/></td></tr>
                <tr><td id="Font">Password : </td><td><input type="text" name="password" value="<%= b.getPassword()%>"/></td></tr>
                <tr><td colspan="2"><button type="submit" value="Edit User">Edit</button>
                        <a href="edituser.jsp"><button>Cancel</button></a>
                    </td></tr>

            </table>
        </form>
    </body>
</html>