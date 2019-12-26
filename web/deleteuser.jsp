<%@page import="Controller.Nyan"%>
<jsp:useBean id="b" class="Model.NyanModel"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<%
    Nyan.delete(b);
    response.sendRedirect("AdminPage.jsp");
%>