
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <%
            try{
              UserRequestUtil.checkRequest(request, response);
            } catch (Exception  ex) {
                    response.sendRedirect("error.jsp?msg="+ex.getMessage());
                    return;
              }
              
            
            UserDaoInter userDao = Context.instanceUserDao();
//            String userIdStr = request.getParameter("id");
//            if (userIdStr == null || userIdStr.trim().isEmpty()) {
//        %>
        <!--        specify id-->
        <%
//        } else {
//            int userId = Integer.parseInt(userIdStr);
    int userId = Integer.parseInt(request.getParameter("id"));

    User user = userDao.getById(userId);
    if (user == null) {
        %>
        there are no user 
        <% } else {
        %>
        <div>
            <form action="UserController" method="POST">

                <input type="hidden" name="id" value="<%=user.getId()%>"/>

                <label for="name" >name:</label>
                <input type="text" name="name" value="<%=user.getName()%>"/>

                <br
                    <label for="surname" >name:</label>
                <input type="text" name="surname" value="<%=user.getSurname()%>"/>
                <input type="submit" name="save" value="Save"/>

            </form>

        </div>

        <% }
//            }
        %>

    </body>
</html>
