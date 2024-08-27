package org.ohgiraffers.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static String name = "쿠로미";
    private static int password = 111;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginName = req.getParameter("name");
        String loginPassword = req.getParameter("password");

        StringBuilder errorPage = new StringBuilder();
        errorPage.append("<h1>Login Error</h1>");

        PrintWriter out = resp.getWriter();
        out.println(errorPage);


        if(!loginName.equals(name) || !loginPassword.equals(password)){
            out.println(errorPage);
            out.flush();
            out.close();
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("name: " + name);
        System.out.println("password: " + password);
    }
}
