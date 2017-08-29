package com.smartbean.service.impl;

import com.smartbean.dao.ResumeDao;
import com.smartbean.entity.Resume;
import com.smartbean.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("resumeService")
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Autowired(required = false)
    private ResumeDao resumeDao;

    @Override
    public Resume findOne(String id) {
        return resumeDao.findOne(id);
    }

    @Override
    public Page<Resume> find(Resume resume, Pageable pageable) {
        return resumeDao.findAll(resume, pageable);
    }

    @Override
    public List<Resume> findAll(Resume resume) {
        return resumeDao.findAll(resume);
    }
}
