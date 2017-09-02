package com.smartbean.repository;

import com.smartbean.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by qingfeilee on 2015/4/17.
 */
public interface ResumeRepository extends JpaRepository<Resume, String>, JpaSpecificationExecutor<Resume> {

}
