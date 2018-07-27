package com.dsz.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * 适配器模式
 *
 * @author dsz
 * @date 18/06/03
 */
public class ServletDemo2 extends GenericServlet {
  @Override
  public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
    System.out.println("ServletDemo2已经执行");
  }
}
