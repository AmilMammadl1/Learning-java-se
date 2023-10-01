/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resume;

import com.company.entity.User;
import com.mycompany.dao.inter.UserDaoInter;
import com.mycompany.main.Context;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author amila
 */
public class UserRequestUtil {

    public static void checkRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userIdStr = request.getParameter("id");
        if (userIdStr == null || userIdStr.trim().isEmpty()) {
//            response.sendRedirect("error.jsp?msg=specify id");
            throw new Exception("specify id");
        }
    }

    public static User checkProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
        User user = null;
        UserRequestUtil.checkRequest(request, response);
        int userId = Integer.parseInt(request.getParameter("id"));
        UserDaoInter userDao = Context.instanceUserDao();

        user = userDao.getById(userId);
        if (user == null) {
            throw new Exception("there are no user");
        }
        return user;
    }
}
