<!DOCTYPE html>
<html>
<head>
	<title>WikiNyan | Admin Page</title>
	<meta charset="utf-8">
	<meta name="author" content="Adib, Farrell, Waskito">
	<meta name="description" content="WikiNyan">
	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700,900" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="CSS/styleAdminPage.css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet">
        <style>
table.table {
  font-family: "Comic Sans MS", cursive, sans-serif;
  border: 6px solid #BAA193;
  background-color: #FFC0CB;
  text-align: center;
}
table.table td, table.table th {
  border: 2px solid #948473;
  padding: 2px 2px;
}
table.table tbody td {
  font-size: 13px;
  color: #000000;
}
table.table thead {
  background: #948473;
}
table.table thead th {
  font-size: 17px;
  font-weight: bold;
  color: #F0F0F0;
  text-align: center;
}
#Font {
font-family: "Comic Sans MS", cursive, sans-serif;
font-size: 25px;
letter-spacing: 2px;
word-spacing: 2px;
color: #000000;
font-weight: 400;
text-decoration: none solid rgb(68, 68, 68);
font-style: normal;
font-variant: normal;
text-transform: none;
}
        </style>
</head>
<body>
<!-- Big Banner -->
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
<!-- End Big Banner -->
<br>
<br>
<br>
<!-- Read Data -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>View Users</title>
    </head>
    <body>
        <%@page import="Controller.Nyan,Model.NyanModel,java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <h1 id="Font">User List</h1>
        <%
            List<NyanModel> list = Nyan.getAllRecords();
            request.setAttribute("list", list);
        %>
        <table class="table" border="1" width="80%">
            <thead>
            <tr>
                <th>ID User</th>
                <th>Username</th>
                <th>Password</th>
                <th>Edit User</th>
                <th>Delete User</th>
            </tr>
            <thead>
            <c:forEach items="${list}" var="b">
            <tbody>
                <tr>
                    <td>${b.getId()}</td>
                    <td>${b.getUsername()}</td>
                    <td>${b.getPassword()}</td>
                    <td>
                        <a style="color: #000000" href="edituserform.jsp?id=${b.getId()}">Edit</a>
                    </td>
                    <td>
                        <a style="color: #000000" href="deleteuser.jsp?id=${b.getId()}">Delete</a>
                    </td>
                </tr>
            <tbody>
            </c:forEach>
        </table>
        <br>

    </body>
    <br><br><br><br>   <br><br><br><br><br><br><br><br>   <br><br><br><br>       <br><br><br><br>       <br><br>
<!-- End Read Data -->
<!-- Footer -->
<div class="footer">
	<div class="box">
		<p><b>WikiNyan</b> &copy; 2019</p>
	</div>
</div>
<!-- End Footer -->
</body>
</html>