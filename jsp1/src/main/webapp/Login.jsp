
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp1_war_exploded/myservlet" method="post">
    <label for="username" >Username:</label>
    <input type="text" id="username" name="username"><br>
    <label for="password" >Password:</label>
    <input type="password" id="password" name="password"><br>
    <input type="submit" value="Login" onclick="Login.jsp">
</form>

</body>
</html>


<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // validate the username and password
    if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
        // validate the username and password

            // create a new session
            HttpSession sessionCheck = request.getSession();
            sessionCheck.setAttribute("username", username);

            // redirect to the second page
            response.sendRedirect("loginConfirm.jsp");
        } else {
            out.println("Invalid username or password.");
        }

%>

