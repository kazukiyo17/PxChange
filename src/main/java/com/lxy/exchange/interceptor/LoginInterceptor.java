package com.lxy.exchange.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
 
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // ִ����ϣ�����ǰ����        
    }
 
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // �ڴ�������У�ִ������        
    }
 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        // �����ص�ִ��ǰ���أ��������true��ִ�����ص��Ĳ��������سɹ���
        // ����false��ִ������
        HttpSession session = request.getSession();
//        String url = request.getRequestURI(); // ��ȡ��¼��uri������ǲ��������ص�    
        //if(session.getAttribute("_CURRENT_USER")!=null || url.indexOf("home.action")!=-1 || url.indexOf("login.action")!=-1) {
        if(session.getAttribute("_CURRENT_USER")!=null) {
            // ��¼�ɹ�������
            return true;
        }else {
            // ���غ�����¼ҳ��
            response.sendRedirect(request.getContextPath()+"/items/itemlist.do");
            return false;
        }
    }
}
