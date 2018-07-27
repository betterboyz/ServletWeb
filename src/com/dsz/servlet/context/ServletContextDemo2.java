package com.dsz.servlet.context;

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
@WebServlet(name = "ServletContextDemo2", urlPatterns = {"/contextDemo2"})
public class ServletContextDemo2 extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String name = (String) this.getServletContext().getAttribute("name");
    System.out.println(name);
  }
}
