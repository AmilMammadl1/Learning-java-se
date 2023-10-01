package util;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author amila
 */
public class ControllerUtil {

    public static void errorPage(HttpServletRequest req, HttpServletResponse res, Exception ex) {
        try {
            ex.printStackTrace();
            res.sendRedirect("error.jsp?msg = "+ex.getMessage());
        } catch (IOException ex1) {
            ex1.printStackTrace();
        }
    }
}
