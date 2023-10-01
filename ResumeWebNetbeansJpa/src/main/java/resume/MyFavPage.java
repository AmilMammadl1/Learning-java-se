/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package resume;

import com.company.dao.impl.UserDaoImpl;
import com.company.entity.Skill;
import com.mycompany.dao.inter.SkillDaoInter;
import com.mycompany.dao.inter.UserDaoInter;
import com.mycompany.dao.inter.UserSkillDaoInter;
import com.mycompany.main.Context;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author amila
 */
@WebServlet(name = "MyFavPage", urlPatterns = {"/MyFavPage"})
public class MyFavPage extends HttpServlet {

private UserDaoInter userDao = new UserDaoImpl();
    private SkillDaoInter skillDao = Context.instanceSkillDao();
    private UserSkillDaoInter userSkillDao = Context.instanceUserSkillDao();

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        int id = Integer.parseInt(request.getParameter("id"));
//        User u = userDao.getById(id);
        //    System.out.println(userDao.getAll());
//        String name = String.valueOf(request.getParameter("name"));
//        Skill s = new Skill(0, name);
//        boolean b = skillDao.insertSkill(s);
//        System.out.println(s);
//        System.out.println(skillDao.getAll());

        // List<User> users = userDao.getAll();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyFavPage</title>");
            out.println("</head>");
            out.println("<body>");

//            for (User u : users) {
//                out.println(u + "/br");
//            }
            out.println(skillDao.getAll());
            //out.println(s);
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        try {
            String requestStr = getAllDataFromRequest(req);
            String name = String.valueOf(req.getParameter("name"));

            Skill s = new Skill(0, name);
            boolean b = skillDao.insertSkill(s);
            System.out.println(s);
            System.out.println(skillDao.getAll());
//            String name = String.valueOf(req.getParameter("name"));
//            String surname = String.valueOf(req.getParameter("surname"));
//            response.setContentType("text/html;charset=UTF-8");
//            //List<User> users = userDao.getAll();
//            User u = new User(0, name, surname, null, null, null, null, null, null);
//            boolean users = userDao.addUser(u);

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet MyFavPage</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1 style=\"color:red\">i got post request</h1>");
//            for (User u : users) {
//                out.println(u + "/br");
//            }
                out.println("USER " + s + " skill succesfully added");
                out.println("</body>");
                out.println("</html>");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public static String getAllDataFromRequest(HttpServletRequest request) throws Exception {

        String body = null;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;

        try {
            InputStream inputStream = request.getInputStream();
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuilder.append(charBuffer, 0, bytesRead);
                }
            } else {
                stringBuilder.append("");
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }

        body = stringBuilder.toString();

        return body;
    }

}
