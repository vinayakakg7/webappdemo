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
    
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Hello Servlet</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hello, World!</h1>");
    out.println("</body>");
    out.println("</html>");
} catch (IOException e) {
    // Handle the exception here
    log.error("Error writing response", e);
    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
}
}

}
