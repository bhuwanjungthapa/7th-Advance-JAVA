<%--
  Created by IntelliJ IDEA.
  User: Ram Krishna Manandhar
  To change this template use File | Settings | File Templates.
--%>


<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Driver" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%
    try {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        session.setAttribute("username", userName);
        session.setAttribute("password", passWord);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/javalab", "root", "");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user_pass");

        boolean flag = false;
        while (resultSet.next()) {
            if (userName.equals(resultSet.getString(1)) && passWord.equals(resultSet.getString(2))) {
                out.println("Valid user");
            }

        else {
            out.println("Invalid Username: " + userName + "<br>");
            out.println("Invalid Password: " + passWord + "<br>");
            out.println("<a href = 'login.jsp'>back to login</a>");
        }
        }
    } catch (Exception exception) {
        out.println(exception);
    }

%>

</body>
</html>
