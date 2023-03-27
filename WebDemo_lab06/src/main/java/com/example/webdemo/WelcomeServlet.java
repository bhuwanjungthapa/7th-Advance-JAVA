package com.example.webdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WelcomeServlet", value = "/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        Cookie[] theCookies = request.getCookies();

        String user = null;
        if (theCookies != null) {
            for (Cookie tempCookie : theCookies) {
                if ("app.username".equals(tempCookie.getName())) {
                    user = tempCookie.getValue();
                    break;
                }
            }
        }
        out.print("Welcome , Hello" + user);
    }
}
