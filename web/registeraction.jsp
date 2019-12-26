<%@page import="Controller.Nyan"%>
<jsp:useBean id="b" class="Model.NyanModel"></jsp:useBean>
<jsp:setProperty property="*" name="b"/>

<%
    int i = Nyan.save(b);
    if (i > 0) {
        response.sendRedirect("register-success.jsp");
    } else {
        response.sendRedirect("register-failed.jsp");
    }
%>