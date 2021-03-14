package com.gjc.web_servlet.web;

import com.gjc.web_servlet.service.DemoService;
import com.gjc.web_servlet.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 通过tomcat部署 war包 exploded
 */
@WebServlet(urlPatterns = "/demo")
public class DemoServlet extends HttpServlet {

    DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(demoService.findAll().toString());
    }
}
