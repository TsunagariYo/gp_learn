package com.edu.delegatepattern.mvc;

import com.edu.delegatepattern.mvc.controller.MemberController;
import com.edu.delegatepattern.mvc.controller.OrderController;
import com.edu.delegatepattern.mvc.controller.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DispatchServlet
 * @Description
 * @Author Administrator
 * @Date 2020/6/18 0018 15:08
 */
public class DispatchServlet  extends HttpServlet {
    private List<handler> handlerMapper = new ArrayList<handler>();


    @Override
    public void init() throws ServletException {
        Class<MemberController> memberControllerClass = MemberController.class;
        try {
            handlerMapper.add(new handler().
                    setController(memberControllerClass.newInstance()).
                    setMethod(memberControllerClass.getMethod("getMenmberByID")).
                    setUrl("/web/getMenmberByID.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            doDispatch(req,resp);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException, InvocationTargetException, IllegalAccessException {
        String uri = req.getRequestURI();
        String parameter = req.getParameter("mid");
        handler handler =null;
        for (handler h : handlerMapper) {
            if (uri.equals(h.getUrl())){
                handler = h;
                break;
            }
        }
        Object o = handler.getMethod().invoke(handler.getController(), parameter);
        resp.getWriter().write(o.toString());

    }
    class handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
