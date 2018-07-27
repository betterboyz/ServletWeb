package com.dsz.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 模板方法设计模式
 *
 * @author dsz
 * @date 18/06/03
 */
public class ServletDemo3 extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("ServletDemo3已经执行");
  }
}
