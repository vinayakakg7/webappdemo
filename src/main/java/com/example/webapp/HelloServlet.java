package com.example.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try {
            PrintWriter out = response.getWriter();
            
            out.println("<!DOCTYPE html>"); // Add the DOCTYPE declaration
            out.println("<html lang=\"en\">"); // Add the lang attribute
            out.println("<head>");
            out.println("<title>Hello Servlet</title>"); // Add the title element
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome to my Web App</h1>");
            out.println("<p>Click the button below to see a greeting from the server</p>");
            out.println("<form action=\"hello\" method=\"get\">");
            out.println("<button type=\"submit\">Say Hello</button>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            // Handle the exception here
            e.printStackTrace();
        }
    }
}
