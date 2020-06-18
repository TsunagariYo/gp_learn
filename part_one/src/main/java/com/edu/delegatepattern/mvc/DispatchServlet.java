package com.edu.delegatepattern.mvc;

import com.edu.delegatepattern.mvc.controller.MemberController;
import com.edu.delegatepattern.mvc.controller.OrderController;
import com.edu.delegatepattern.mvc.controller.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName DispatchServlet
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 15:08
 */
public class DispatchServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatch(req,resp);
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String parameter = req.getParameter("mid");
        if ("getMenmberByID".equals(uri)){
            new MemberController().getMenmberByID(parameter);
        }else if ("getOrderByID".equals(uri)){
            new OrderController().getOrderByID(parameter);
        }else if ("logout".equals(uri)){
            new SystemController().logout(parameter);
        }else {
            resp.getWriter().write("404 not found");
        }
    }
}
