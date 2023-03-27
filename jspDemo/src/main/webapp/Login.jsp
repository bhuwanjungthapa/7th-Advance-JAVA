
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Login.jsp" method="post">
    <label for="username" >Username:</label>
    <input type="text" id="username" name="username" required><br>
    <label for="password" >Password:</label>
    <input type="password" id="password" name="password" required><br>
    <input type="submit" value="Login" onclick="Login.jsp">
</form>

</body>
</html>


<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    // validate the username and password
    if (username != null && password != null ) {
        // validate the username and password

            // create a new session
            //HttpSession sessionCheck = request.getSession();
            session.setAttribute("username", username);

            // redirect to the second page
            response.sendRedirect("loginConfirm.jsp");
        }

%>

