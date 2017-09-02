package com.smartbean.service;

import com.smartbean.dtos.SearchParam;
import com.smartbean.entity.ResumeDetail;

import java.util.List;

/**
 *
 */
public interface ResumeDetailService {

    public ResumeDetail save(ResumeDetail resumeDetail);

    public List<ResumeDetail> save(List<ResumeDetail> resumeDetails);

    List<ResumeDetail> query(SearchParam searchParam);
}
