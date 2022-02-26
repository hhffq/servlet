package com.servlet.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/req")
public class ReServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        System.out.println("Protocol:" + request.getProtocol());
//        System.out.println("ContextPath:"+  request.getContextPath());
//        System.out.println("ServletPath:"+ request.getServletPath());
//        System.out.println("QueryString:" + request.getQueryString());

          doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("Protocol:" + request.getProtocol());
//        System.out.println("ServletPath:"+ request.getServletPath());
//        System.out.println(request.getParameter("password"));

        String info  = "中国";
//          String name = request.getParameter("name");
//          System.out.println(name);

          //1.设置服务器端的编码，在response.getWriter()之前设置，默认是iso-8859-1；
          response.setCharacterEncoding("UTF-8");

//          //2.通过设置响应头，通知浏览器发送的数据格式
//          response.setHeader("Content-type" , "text/plain;charset=utf-8");

//          //3.作用等同于2.=提倡用这个
          response.setContentType("text/plain;charset=utf-8");

          response.getWriter().println(info);
          request.setCharacterEncoding(info);
          response.getWriter().close();


    }
}
