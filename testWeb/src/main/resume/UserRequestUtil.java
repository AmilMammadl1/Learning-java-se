/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resumewebnetbeans;

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
}
