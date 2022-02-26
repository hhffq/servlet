package com.servlet.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(urlPatterns = "/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("RespodeDemo1");
        //1.设置状态码为302：重定向
        response.setStatus(302);
        //通过request域传递数据
        request.setAttribute("msg","hello response");
        //2.设置响应头
        response.setHeader("localtion","https://www.baidu.com/");
//        response.setHeader("msq","hello");







    }
}
