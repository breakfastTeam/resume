package com.smartbean.service;

import com.smartbean.entity.Resume;
import com.smartbean.entity.ResumeDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 *
 */
public interface ResumeDetailService {

    public ResumeDetail save(ResumeDetail resumeDetail);

    public List<ResumeDetail> save(List<ResumeDetail> resumeDetails);

}
