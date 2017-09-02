package com.smartbean.dao.impl;

import com.smartbean.dao.ResumeDetailDao;
import com.smartbean.entity.ResumeDetail;
import com.smartbean.repository.ResumeDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository("resumeDetailDao")
@Transactional
public class ResumeDetailDaoImpl implements ResumeDetailDao {

    @Autowired
    ResumeDetailRepository resumeDetailRepository;


    @Override
    public ResumeDetail save(ResumeDetail resumeDetail) {
        return resumeDetailRepository.save(resumeDetail);
    }

    @Override
    public List<ResumeDetail> save(List<ResumeDetail> resumeDetails) {
        return resumeDetailRepository.save(resumeDetails);
    }
}
