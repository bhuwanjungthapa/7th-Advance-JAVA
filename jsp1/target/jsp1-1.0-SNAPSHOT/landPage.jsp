<%--
  Created by IntelliJ IDEA.
  User: bhuwanthapa
  Date: 1/25/23
  Time: 7:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sessionCheck = request.getSession(false);
    if (session != null && sessionCheck.getAttribute("username") != null) {
        out.println("Welcome, " + sessionCheck.getAttribute("username") + "!<br>");
        out.println("This is the third page.");
    } else {
        out.println("You are not logged in or your session has expired. <a href='Login.jsp'>Login again</a>");
    }
%>
