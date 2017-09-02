package com.smartbean.repository;

import com.smartbean.entity.SysResumeCount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by qingfeilee on 2015/5/13.
 */
public interface ResumeCountRepository extends JpaRepository<SysResumeCount, String> {
}
