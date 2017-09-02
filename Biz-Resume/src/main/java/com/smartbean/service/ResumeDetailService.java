package com.smartbean.service;

import com.smartbean.entity.ResumeDetail;

import java.util.List;

/**
 *
 */
public interface ResumeDetailService {

    public ResumeDetail save(ResumeDetail resumeDetail);

    public List<ResumeDetail> save(List<ResumeDetail> resumeDetails);

}
