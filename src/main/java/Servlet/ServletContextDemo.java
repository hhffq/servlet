package Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(urlPatterns = "/path")
public class ServletContextDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext context= this.getServletContext();

        String bpath = context.getRealPath("/b.txt");
        System.out.println(bpath);

        String cpath = context.getRealPath("WEB-INF/c.txt");
        System.out.println(cpath);

        String apath = context.getRealPath("WEB-INF/classes/com.redical/web/servlet/a.txt");
        System.out.println(apath);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





















    }
}
