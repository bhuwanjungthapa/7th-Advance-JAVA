<%--
  Created by IntelliJ IDEA.
  User: Ram Krishna Manandhar
  Date: 21/02/2023
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login Screen</h2>
<form action="/WebDemo_war_exploded/LoginServlet" method="post">
    UserName:
    <input type="text" id="username" name="username" required><br><br>
    Password:
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
