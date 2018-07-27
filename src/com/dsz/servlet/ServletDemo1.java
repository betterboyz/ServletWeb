package com.dsz.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author dsz
 * @date 18/06/03
 */
public class ServletDemo1 implements Servlet {
  @Override
  public void init(ServletConfig servletConfig) throws ServletException {
    //初始化
    System.out.println("*************init执行了*************");

  }

  @Override
  public ServletConfig getServletConfig() {
    return null;
  }

  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    System.out.println("*************service执行了*************");
  }

  @Override
  public String getServletInfo() {
    return null;
  }

  @Override
  public void destroy() {
    System.out.println("*************destroy执行了*************");
  }
}
