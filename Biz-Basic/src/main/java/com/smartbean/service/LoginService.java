package com.smartbean.service;

import com.smartbean.entity.SysLogin;

/**
 * 手机端应用登录调用内部处理接口
 * Created by Administrator on 2015/9/13.
 */
public interface LoginService {
    /**
     * 用户登录
     * */
    public SysLogin login(String loginName, String password);

    /**
     * 根据登录主键获取登录账号
     * **/
    public SysLogin findOne(String loginId);


    /**
     * 保存用户信息
     * Felix
     * 2015-04-18
     * **/
    public SysLogin save(SysLogin sysLogin);



    /**
     * 根据用户名查询login
     * By GuoKun
     * 2015/5/12
     */
    public boolean isLoginNameExist(String loginName);
}
