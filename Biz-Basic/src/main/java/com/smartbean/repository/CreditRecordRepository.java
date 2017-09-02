package com.smartbean.repository;

import com.smartbean.entity.CreditRecord;
import com.smartbean.entity.SysDynamic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by qingfeilee on 2015/5/13.
 */
public interface CreditRecordRepository extends CrudRepository<CreditRecord, Long> {
}
