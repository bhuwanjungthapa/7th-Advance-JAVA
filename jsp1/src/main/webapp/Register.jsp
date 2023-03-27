<%@ page import="javax.swing.*" %>
<%@ page import=" java.sql.*" %>

<%--
  Created by IntelliJ IDEA.
  User: bhuwanthapa
  Date: 1/27/23
  Time: 7:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form action="Register.jsp" method="post">
    <label for="username" >Username:</label>
    <input type="text" id="username" name="username"><br>
    <label for="password" >Password:</label>
    <input type="password" id="password" name="password"><br>
    <input type="submit" value="Save">
</form>
</body>
</html>

<%
    Connection con;
    Statement stmt;
    ResultSet rs;
    try{
//load the driver
//            Class.forName("com.mysql.jdbc.Driver");/**/
        Class.forName("com.mysql.cj.jdbc.Driver");
//connectivity java with database
        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentdb","root","");
        System.out.println("connection success");
        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from login");
        while(rs.next()){
            out.print(rs.getString(1));
            out.print(rs.getString(2));
            out.print(rs.getString(3));
        }
    }catch (Exception e){

    }
%>
