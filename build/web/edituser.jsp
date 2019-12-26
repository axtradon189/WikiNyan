<%@page import="Controller.Nyan"%>
<jsp:useBean id="b" class="Model.NyanModel"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<%
    int i = Nyan.update(b);
    response.sendRedirect("AdminPage.jsp");
%>