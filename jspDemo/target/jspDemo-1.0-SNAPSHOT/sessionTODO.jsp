<%--
  Created by IntelliJ IDEA.
  User: bhuwanthapa
  Date: 1/24/23
  Time: 7:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page  import="java.util.*"%>
<html>
<head>
    <title>Session</title>
</head>
<body>

        <form action="sessionTODO.jsp">
            Add new item: <input type="text" name="theItem" />
            <input type="submit" value="Submit"/>

        </form>
        <%
            List<String> items = (List<String>) session.getAttribute("myToDoList");
            //if to do item is
            if(items == null){
                items = new ArrayList<String>();
                session.setAttribute("myToDoList",items);
            }
        //see if there is form data to add
            String theItem = request.getParameter("theItem");
            if(theItem != null){
                items.add(theItem);
            }
        %>
        <hr>
        <b>The List items : </b> <br/>
        <ol>
            <%
                for(String temp : items){
                    out.println("<li>" + temp + "</li>");
                }
            %>
        </ol>

</body>
</html>
