<%--
  Created by IntelliJ IDEA.
  User: bhuwanthapa
  Date: 1/23/23
  Time: 7:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form method="POST" action="registerConfirm.jsp">

      <label for="fullname">Fullname:</label>
      <input type="text" id="fullname" name="fullname"><br>

      <label for="address">Address:</label>
      <input type="text" id="address" name="address"><br>

      <label for="city">City:</label>
      <select id="city" name="city">
          <option value="Kathmandhu">Kathmandhu</option>
          <option value="Dharan">Dharan</option>
          <option value="Pokhara">Pokhara</option>
      </select><br>
      <input type="submit" value="Submit">

</form>

</body>
</html>
