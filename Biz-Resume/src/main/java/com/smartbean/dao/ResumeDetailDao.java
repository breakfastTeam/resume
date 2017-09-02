package com.smartbean.dao;

import com.smartbean.entity.ResumeDetail;

import java.util.List;


public interface ResumeDetailDao {
    ResumeDetail save(ResumeDetail resumeDetail);

    List<ResumeDetail> save(List<ResumeDetail> resumeDetails);
}
