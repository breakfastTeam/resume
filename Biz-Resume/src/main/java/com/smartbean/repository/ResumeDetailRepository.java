package com.smartbean.repository;

import com.smartbean.entity.ResumeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by qingfeilee on 2015/4/17.
 */
public interface ResumeDetailRepository extends JpaRepository<ResumeDetail, Long>, JpaSpecificationExecutor<ResumeDetail> {

    ResumeDetail findFirstByUserIdOrMobile(Long userId, String mobile);

    List<ResumeDetail> findByNameOrMobileOrEmailOrderByCreateTimeDesc(String name, String mobile, String email);
}
