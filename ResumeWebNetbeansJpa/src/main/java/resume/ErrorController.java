///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
//package com.mycompany.resumewebnetbeans;
//
//import com.mycompany.dao.inter.UserDaoInter;
//import com.mycompany.main.Context;
//import java.io.IOException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//
///**
// *
// * @author amila
// */
//@WebServlet(name = "ErrorController", urlPatterns = {"/error"})
//public class ErrorController extends HttpServlet {
//
//    private UserDaoInter userDao = Context.instanceUserDao();
//
//    @Override
//    protected void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
//            throws jakarta.servlet.ServletException, IOException {
//            request.getRequestDispatcher("error.jsp").forward(request, response);
//
//    }
//
//}