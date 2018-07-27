package com.dsz.servlet.context;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author dsz
 * @date 18/06/03
 */
@WebServlet(name = "servletContextDemo1", urlPatterns = {"/contextDemo1"})
public class ServletContextDemo1 extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("servletContext执行了");
    ServletContext application = this.getServletContext();
    application.setAttribute("name", "tom");

  }
}
