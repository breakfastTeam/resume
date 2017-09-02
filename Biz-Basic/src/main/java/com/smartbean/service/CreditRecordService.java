package com.smartbean.service;


import com.smartbean.entity.CreditRecord;
import com.smartbean.enums.CreditOperate;

import javax.transaction.Transactional;

public interface CreditRecordService {

    @Transactional
    CreditRecord save(CreditRecord record);

    CreditRecord save(Long userId, CreditOperate operate);

    CreditRecord save(Long userId, CreditOperate operate, int credits);
}
