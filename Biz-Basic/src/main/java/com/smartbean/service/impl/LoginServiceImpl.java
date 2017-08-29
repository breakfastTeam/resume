package com.smartbean.service.impl;

import com.smartbean.entity.SysLogin;
import com.smartbean.repository.LoginRepository;
import com.smartbean.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 手机端应用登录调用内部处理接口实现类
 * Created by Administrator on 2015/9/13.
 */
@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired(required = false)
    private LoginRepository loginRepository;

    @Override
    public SysLogin login(String loginName, String password) {
        return loginRepository.findByLoginNameAndPassword(loginName, password);
    }

    @Override
    public SysLogin findOne(String loginId) {
        return loginRepository.findOne(loginId);
    }

    @Override
    public SysLogin save(SysLogin sysLogin) {
        return loginRepository.save(sysLogin);
    }

    @Override
    public boolean isLoginNameExist(String loginName) {
        SysLogin sysLogin = loginRepository.findByLoginName(loginName);
        if(sysLogin != null){
            return true;
        }else{
            return false;
        }
    }
}
