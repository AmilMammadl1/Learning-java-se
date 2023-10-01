

<%@page import="com.mycompany.resumewebnetbeans.UserRequestUtil"%>
<%@page import="com.company.entity.User"%>
<%@page import="com.mycompany.main.Context"%>
<%@page import="com.mycompany.dao.inter.UserDaoInter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <%
            User user = null;

//            if (request.getAttribute("owner") == null) {
//                response.sendRedirect("error.jsp?msg=not found");
//                return;
//            }
            user = (User) request.getAttribute("user");

            if (user == null) {
                return;
            }
        %>
        <%--
        <%
            User user = null;
            try {
                UserRequestUtil.checkProcess(request, response);
            } catch (Exception ex) {
                response.sendRedirect("error.jsp?msg=" + ex.getMessage());
                return;

            }
        %>
        --%>
        <%--
        <%
            User user = null;
            try {
                UserRequestUtil.checkRequest(request, response);
                int userId = Integer.parseInt(request.getParameter("id"));
                UserDaoInter userDao = Context.instanceUserDao();

              user = userDao.getById(userId);
              if (user == null) {
                  throw new Exception("there are no user");
              }
          } catch (Exception ex) {
              response.sendRedirect("error.jsp?msg=" + ex.getMessage());

              return;

          }
        
            

              UserDaoInter userDao = Context.instanceUserDao();
          String userIdStr = request.getParameter("id");
          if (userIdStr == null || userIdStr.trim().isEmpty()) {
        %>
        --%>
        <!--        specify id-->
        <%//        } else {
//            int userId = Integer.parseInt(userIdStr);
//    int userId = Integer.parseInt(request.getParameter("id"));
//
//    User user = userDao.getById(userId);
//    if (user == null) {
//        %>
        <%--        there are no user 
                        <% } else {
               %>
        --%>
        <div>
            <form action="userdetail" method="POST">
                <input type="hidden" name="action" value="update"/>

                <input type="hidden" name="id" value="<%=user.getId()%>"/>

                <label for="name" >name:</label>
                <input type="text" name="name" value="<%=user.getName()%>"/>

                <br
                    <label for="surname" >name:</label>
                <input type="text" name="surname" value="<%=user.getSurname()%>"/>
                <input type="submit" name="save" value="Save"/>

            </form>

        </div>

        <%--       <% } 
        //            }
        %>
        --%>
    </body>
</html>
