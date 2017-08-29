package com.smartbean.service.impl;

import com.smartbean.entity.SysLogin;
import com.smartbean.entity.SysResumeCount;
import com.smartbean.repository.ResumeCountRepository;
import com.smartbean.service.LoginService;
import com.smartbean.service.ResumeCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 手机端应用登录调用内部处理接口实现类
 * Created by Administrator on 2015/9/13.
 */
@Service("resumeCountService")
@Transactional
public class ResumeCountServiceImpl implements ResumeCountService {

    @Autowired(required = false)
    private ResumeCountRepository resumeCountRepository;


    @Override
    public SysResumeCount getResumeTotalCount() {
        List<SysResumeCount> sysResumeCounts = resumeCountRepository.findAll();
        if(sysResumeCounts != null && sysResumeCounts.size()>0){
            return sysResumeCounts.get(0);
        } else {
            SysResumeCount resumeCount = new SysResumeCount();
            resumeCount.setTotalCompanies(0);
            resumeCount.setTotalResumes(0);
            resumeCount.setTotalPositions(0);
            resumeCount.setTotalVIPs(0);
            resumeCountRepository.save(resumeCount);
            return resumeCount;
        }

    }
}
