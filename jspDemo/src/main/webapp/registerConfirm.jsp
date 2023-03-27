<%--
  Created by IntelliJ IDEA.
  User: bhuwanthapa
  Date: 1/23/23
  Time: 7:52 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Confirm</title>
</head>
<body>

    <%
        String name = request.getParameter("fullname");
        String address = request.getParameter("address");
        String city = request.getParameter("city");


        out.println("fullname: "+name);
        out.println("address: "+address);
        out.println("city: "+city);

    %>
    Full Name is <% request.getParameter("fullname");%>

Address is ${param.address}



</body>
</html>
