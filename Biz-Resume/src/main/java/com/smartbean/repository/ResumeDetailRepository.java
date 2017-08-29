package com.smartbean.repository;

import com.smartbean.entity.Resume;
import com.smartbean.entity.ResumeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by qingfeilee on 2015/4/17.
 */
public interface ResumeDetailRepository extends JpaRepository<ResumeDetail, String>, JpaSpecificationExecutor<ResumeDetail> {

}
