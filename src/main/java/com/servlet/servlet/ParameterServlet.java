//package com.servlet.servlet;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebInitParam;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.Serial;
//
//
//@WebServlet(
//        name = "ParameterServlet",
//        urlPatterns = ("/param"),
//        loadOnStartup = 1,
//        initParams = {
//                @WebInitParam(name = "site",value = "http://com.servlet.servlet"),
//                @WebInitParam(name = "name",value = "servlet.servlet"),
//        })
//public class ParameterServlet  extends HttpServlet {
//
//    @Serial
//    private static final long serialVersionUID =  -5767625680763237936L;
//
//    @Override
//    public void init() throws ServletException {
//        String site = this.getInitParameter("site");
//        String name = this.getInitParameter("name");
//
//    }
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
////       String site = this.getInitParameter("site");
////       String name = this.getInitParameter("name");
////        PrintWriter  out = resp.getWriter();
////        out.println(site);
////        out.println(name);
////        out.flush();
////        out.close();
//    }
//}
