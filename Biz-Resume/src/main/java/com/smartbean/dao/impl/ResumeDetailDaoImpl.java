package com.smartbean.dao.impl;

import com.smartbean.dao.ResumeDao;
import com.smartbean.dao.ResumeDetailDao;
import com.smartbean.entity.Resume;
import com.smartbean.entity.ResumeDetail;
import com.smartbean.repository.ResumeDetailRepository;
import com.smartbean.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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
