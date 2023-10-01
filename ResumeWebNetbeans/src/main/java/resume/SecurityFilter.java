/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resume;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author amila
 */
//@WebFilter(filterName = "JspFilter", urlPatterns = "*")
//public class SecurityFilter implements Filter {
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response,
//            FilterChain chain) {
//        HttpServletResponse res = (HttpServletResponse) response;
//        HttpServletRequest req = (HttpServletRequest) request;
//        try {
//            if (!req.getRequestURI().contains("/login") && req.getSession().getAttribute("loggetInUser") == null) {
//                //res.sendRedirect("login");
//                req.getRequestDispatcher("/login.jsp").forward(request, response);
//
//                throw new Exception("not found loggedin");
//            } else {
//                chain.doFilter(request, response);
//            }
//        } catch (Exception ex1) {
//            ex1.printStackTrace();
//        }
//
//    }
//}
@WebFilter(filterName = "SecurityFilter", urlPatterns = "/*")
public class SecurityFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        // Check if user is logged in
        if (req.getSession().getAttribute("loggedInUser") == null) {
            // Check if request is a POST request with login form data
            if (req.getMethod().equalsIgnoreCase("POST") && req.getParameter("email") != null && req.getParameter("password") != null) {
                // TODO: Handle login validation
                // If login is successful, set the loggedInUser attribute in the session and redirect to the original request URL
                // If login fails, show an error message and redirect to the login page
            } else {
                // Check if request is a GET request for a protected resource
                if (!req.getRequestURI().endsWith("login.jsp")) {
                    // Redirect to login page
                    req.getRequestDispatcher("/login.jsp").forward(request, response);
                    return;
                }
            }
        }

        chain.doFilter(request, response);
    }
}
