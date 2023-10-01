/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package resume;

import com.company.entity.User;
import com.mycompany.dao.inter.UserDaoInter;
import com.mycompany.main.Context;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amila
 */
@WebServlet(name = "UserController", urlPatterns = {"/userdetail"})
public class UserController extends HttpServlet {

    private UserDaoInter userDao = Context.instanceUserDao();

    @Override
    protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
            throws jakarta.servlet.ServletException, IOException {
        try {
            String userIdStr = request.getParameter("id");
            
            if (userIdStr == null || userIdStr.trim().isEmpty()) {
                throw new Exception("specify id");
            }
            int userId = Integer.parseInt(request.getParameter("id"));
            UserDaoInter userDao = Context.instanceUserDao();

            User user = userDao.getById(userId);
            if (user == null) {
                throw new Exception("there are no user");
            }
            request.setAttribute("owner", true);
            // request.setAttribute("user", user);
            request.getRequestDispatcher("userdetail.jsp").forward(request, response);

        } catch (Exception ex) {
            response.sendRedirect("error.jsp?msg=" + ex.getMessage());

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.valueOf(request.getParameter("id"));
        String action = request.getParameter("action");
        if (action == "update") {

            String name = request.getParameter("name");
            String surname = request.getParameter("surname");

            //  System.out.println("name= " + name);
            //  System.out.println("surname= " + surname);
            User user = userDao.getById(id);
            user.setName(name);
            user.setSurname(surname);

            userDao.updateUser(user);
            response.sendRedirect("Users.jsp");

        }
        else if(action=="delete"){
            userDao.removeUser(id);
        }
        response.sendRedirect("Users.jsp");

    }
}
