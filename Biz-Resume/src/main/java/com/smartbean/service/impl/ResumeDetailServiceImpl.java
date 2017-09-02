package com.smartbean.service.impl;

import com.smartbean.dao.ResumeDetailDao;
import com.smartbean.entity.ResumeDetail;
import com.smartbean.service.ResumeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("resumeDetailService")
@Transactional
public class ResumeDetailServiceImpl implements ResumeDetailService {

    @Autowired(required = false)
    private ResumeDetailDao resumeDetailDao;


    @Override
    public ResumeDetail save(ResumeDetail resumeDetail) {
        return resumeDetailDao.save(resumeDetail);
    }

    @Override
    public List<ResumeDetail> save(List<ResumeDetail> resumeDetails) {
        return resumeDetailDao.save(resumeDetails);
    }
}
