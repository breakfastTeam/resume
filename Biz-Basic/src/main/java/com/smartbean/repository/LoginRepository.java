package com.smartbean.repository;

import com.smartbean.entity.SysLogin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qingfeilee on 2015/5/13.
 */
public interface LoginRepository extends JpaRepository<SysLogin, Long> {

    public SysLogin findByLoginName(String loginName);

    public SysLogin findByLoginNameAndPassword(String loginName, String password);

    public SysLogin findById(Long loginId);
}
