package com.smartbean.interceptor;

import com.smartbean.constants.Constants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by qingfeilee on 2015/4/21.
 */
public class SysInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contextPath = request.getContextPath();

        String redirectUrl = "http://" + request.getServerName() //服务器地址
                + ":"
                + request.getServerPort()
                + request.getContextPath();

        String url = request.getServletPath().toString();
        HttpSession session = request.getSession();
        String loginId = (String) session.getAttribute("loginId");
        String[] noFilters = new String[]{""};//对外接口可以取消过滤
//        if (StringUtils.isBlank(loginId)) {
//            if (!url.contains("/login")
//                    && !url.contains("/test")
//                    && !url.contains("/application")
//                    && !url.contains("/uploadBusinessLicence")
//                    && !url.contains("/uploadIDCard")
//                    && !url.contains("/apply")
//                    && !url.contains("/deleteDoc")
//                    && !url.contains("/checkedAPPID")
//                    && !url.contains("/checkedLoginName")
//                    && !url.contains("/findChildren")
//                    && !url.contains("/upload/weixin")
//                    && !url.contains("/upload/user")
//                    && !url.contains("/jumpOut")
//                    && !url.contains("/baidu/ueditor")){
//                request.getRequestDispatcher("/jumpOut?&redirectUrl="+redirectUrl+"/login").forward(request, response);
//            }
//        } else {
//            if (url.equals("/")) {
//                request.getRequestDispatcher(contextPath + "/login").forward(request, response);
//            }
//        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

    private boolean isAjaxRequest(HttpServletRequest request) {
        String header = request.getHeader("X-Requested-With");
        boolean isAjax = "XMLHttpRequest".equals(header) ? true : false;
        return isAjax;
    }
}
