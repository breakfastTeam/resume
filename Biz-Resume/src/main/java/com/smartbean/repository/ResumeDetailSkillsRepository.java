package com.smartbean.repository;

import com.smartbean.entity.ResumeDetail;
import com.smartbean.entity.ResumeDetailSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by qingfeilee on 2015/4/17.
 */
public interface ResumeDetailSkillsRepository extends CrudRepository<ResumeDetailSkills, Long> {

}
