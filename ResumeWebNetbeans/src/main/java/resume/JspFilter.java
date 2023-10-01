///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.resumewebnetbeans;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletResponse;
//
///**
// *
// * @author amila
// */
//@WebFilter(filterName = "JspFilter", urlPatterns = ".jsp")
//public class JspFilter implements Filter {
//
//    public void doFilter(ServletRequest request, ServletResponse response,
//            FilterChain chain) {
//        HttpServletResponse res = (HttpServletResponse) response;
//      //  HttpServletRequest req = (HttpServletRequest) request;
//        try {
////            if (req.getRequestURI().endsWith(".jsp")) {
//               res.sendRedirect("error?msg=not found");
////            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
//}
