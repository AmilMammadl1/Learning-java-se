<%-- 
    Document   : error
    Created on : Mar 26, 2023, 2:40:41 PM
    Author     : amila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>why are you here?</title>
    </head>
    <body>
        <%
            String msg = request.getParameter("msg");
            
        %>

        <%=msg%>
    </body>
</html>
