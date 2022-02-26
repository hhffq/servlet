package com.servlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
ResponseDemo对象练习，向客户端返回字符数据
 */
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ResponseDemo3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String info  = "Java开发";

        PrintWriter out = resp.getWriter();
        out.println(info);
        out.flush();
        out.close();














    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
