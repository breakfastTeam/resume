package com.smartbean.service.impl;

import com.smartbean.entity.CreditRecord;
import com.smartbean.entity.SysLogin;
import com.smartbean.enums.CreditOperate;
import com.smartbean.repository.CreditRecordRepository;
import com.smartbean.service.CreditRecordService;
import com.smartbean.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@Service
public class CreditRecordServiceImpl implements CreditRecordService {

    @Autowired
    private CreditRecordRepository creditRecordRepository;
    @Autowired
    private LoginService loginService;

    @Override
    @Transactional
    public CreditRecord save(CreditRecord record) {
        return creditRecordRepository.save(record);
    }

    @Override
    public CreditRecord save(Long userId, CreditOperate operate) {
        SysLogin user = loginService.findFirstByUserId(userId);
        if (user != null) {
            user.setCredit(user.getCredit() + operate.getCredits());
            loginService.save(user);
            CreditRecord record = this.save(new CreditRecord(userId, operate));
            return record;
        }else{
            throw new RuntimeException("用户不存在");
        }
    }

    @Override
    public CreditRecord save(Long userId, CreditOperate operate, int credits) {
        SysLogin user = loginService.findFirstByUserId(userId);
        if (user != null) {
            user.setCredit(user.getCredit() + credits);
            loginService.save(user);
            CreditRecord record = this.save(new CreditRecord(userId, operate));
            return record;
        }else{
            throw new RuntimeException("用户不存在");
        }
    }
}
