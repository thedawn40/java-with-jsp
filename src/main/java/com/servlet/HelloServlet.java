package com.servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloServlet
 */
@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // RequestDispatcher dispacther = req.getRequestDispatcher("hello.jsp");
        // dispacther.forward(req, resp);
        resp.getWriter().println("hello");

    }
    
}