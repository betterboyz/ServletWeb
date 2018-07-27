package com.dsz.servlet.config;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author dsz
 * @date 18/06/03
 */
public class ServletConfigDemo1 extends HttpServlet {
/*  private ServletConfig config;

  public void init(ServletConfig config) throws ServletException {
    this.config = config;
  }*/

  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   /* //从web.xml文件中获取配置文件信息
    String encoding = config.getInitParameter("encoding");*/

    String encoding = super.getInitParameter("encoding");
    System.out.println(encoding);

  }

  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
  }
}
