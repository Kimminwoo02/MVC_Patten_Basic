package com.example.hellosevlet.basic.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet(name ="responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //[status-line]
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);

        //[response-headers]
        response.setHeader("Content-Type","text/plain=utf-8");
        response.setHeader("Cache-Control","no-cache, no-store,must-revalidate");
        response.setHeader("Pragma","no-cache");
        response.setHeader("my-header","hello");

        //header의 편의 메서드
        //getContent(response);

        PrintWriter writer = response.getWriter();
        writer.println("안녕하세요");


    }

    private static void getContent(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }

    private void cookie(HttpServletResponse response){
        Cookie cookie = new Cookie("myCookie","good");
        cookie.setMaxAge(600);
        response.addCookie(cookie);
    }

    private void redirect(HttpServletResponse response) throws IOException{
//        response.setStatus(HttpServletResponse.SC_FOUND);
//        response.setHeader("Location","/basic/hello-for.html");
        response.sendRedirect("/basic/hello-form.html");// 이거 한줄이면 된다.
    }
}
