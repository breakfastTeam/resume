package com.smartbean.service.impl;

import com.smartbean.entity.Resume;
import com.smartbean.repository.ResumeRepository;
import com.smartbean.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("resumeService")
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Autowired(required = false)
    private ResumeRepository resumeRepository;

    @Override
    public Resume findOne(Long id) {
        return resumeRepository.findOne(id);
    }
}
