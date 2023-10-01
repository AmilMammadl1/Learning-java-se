/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package resume;

import at.favre.lib.crypto.bcrypt.BCrypt;
import util.ControllerUtil;
import com.company.entity.User;
import com.mycompany.dao.inter.UserDaoInter;
import com.mycompany.main.Context;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author amila
 */
@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    private UserDaoInter userDao = Context.instanceUserDao();
    private static BCrypt.Verifyer verifyer = BCrypt.verifyer();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
//            User user = userDao.findByEmailAndPassword(email, password);
            User user = userDao.findByEmail(email);
            if (user == null) {
                throw new Exception("user does not exits!");
            }
            BCrypt.Result rs = verifyer.verify(password.toCharArray(), user.getPassword().toCharArray());
            if (!rs.verified) {
                throw new Exception("email or password is iincorrect!");
                

            }

            request.getSession().setAttribute("loggedInUser", user);
            response.sendRedirect("Users.jsp");
        } catch (Exception ex) {
            ControllerUtil.errorPage(request, response, ex);
//            ex.printStackTrace();
//            response.sendRedirect("error.jsp?msg=" + ex.getMessage());
        }

    }
}
