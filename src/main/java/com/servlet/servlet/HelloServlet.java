package com.servlet.servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

//@WebServlet(urlPatterns = {"/hello-servlet"})

@WebServlet(urlPatterns = {"/res"})
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        System.out.println("init....");
//        message = "Hello World!";
        getServletInfo();
        message = "2022北京冬奥会";
    }


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
//        response.sendRedirect("/xyz/detail.html");
        String type = request.getParameter("type");
        System.out.println(type);
        switch(type){
            case "html":
                getHtml(response);
                break;
            case "json":
                getJson(response);
                break;
            case "img":
                getImg(request,response);
                break;
            default:
                break;
        }
    }

    private void getHtml(HttpServletResponse response) throws IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html lang=\"en+\"><body>");
        out.print("<h1>" + message + "</h1>");
        out.print("<img src = \"https://mbd.baidu.com/newspage/data/mdpage?tag=8&id=8433&source=bdbox_feed_topic1\" alt = \"\">");
        out.print("</body></html>");
        out.flush();
        out.close();
    }

    private void getJson(HttpServletResponse response) throws IOException{
//          response.sendRedirect("/xyz/detail.html");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        String json = "{\"name\":\"张三\",\"age\":55,\"class\":\"软件2126\"}";
        out.print(json);
        out.flush();
        out.close();
    }
    private void getImg(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("image/jpeg");
        String path = request.getServletContext().getRealPath("");
        System.out.println(path);
        File file = new File(path + "/img/bdd.jpg");

        InputStream in = new FileInputStream(file);
        int read = 0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        out.flush();
        in.close();
        out.close();

    }



    @Override
    public void destroy() {
        System.out.println("destroy...");
    }

    @Override
    public String getServletInfo() {
        System.out.println(super.getServletInfo());
        return super.getServletInfo();
    }
}