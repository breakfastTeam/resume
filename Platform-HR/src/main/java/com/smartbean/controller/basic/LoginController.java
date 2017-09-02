package com.smartbean.controller.basic;

import com.smartbean.entity.SysLogin;
import com.smartbean.service.LoginService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by felix on 8/19/17.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public ModelAndView findOne(@RequestParam String loginName, @RequestParam String password, Session session){

        ModelAndView mv = new ModelAndView();

        String md5Pass = DigestUtils.md5Hex(password);
        SysLogin login = loginService.login(loginName, md5Pass);
        if(login == null) {
            mv.addObject("tips", "登录名或密码不正确");
            mv.setViewName("jumpLogin");
        }
        boolean hasLogin = login == null ? false : true;
        boolean isLogin = false;

        if (hasLogin) {
            session.setAttribute("loginId", login.getId());
            mv.setViewName("index");
        }
        return mv;
    }

    @ResponseBody
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public ModelAndView findAll(@RequestParam String loginName,
                              @RequestParam String email,
                              @RequestParam String password){
        ModelAndView mv = new ModelAndView();

        if(StringUtils.isBlank(loginName) || StringUtils.isBlank(email) || StringUtils.isBlank(password)){
            mv.addObject("tips", "登录账号、邮箱、密码不能为空！");
            mv.setViewName("jumpRegister");
        }else {
            boolean isExist = loginService.isLoginNameExist(loginName);
            if (isExist) {
                mv.addObject("tips", "该用户名已经存在");
                mv.setViewName("jumpRegister");
            } else {
                SysLogin sysLogin = new SysLogin();
                sysLogin.setEmail(email);
                sysLogin.setLoginName(loginName);
                String md5Pass = DigestUtils.md5Hex(password);
                sysLogin.setPassword(md5Pass);
                loginService.save(sysLogin);
                mv.setViewName("jumpLogin");
            }
        }
        return mv;
    }
}
