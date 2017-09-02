package com.smartbean.entity.base;

import com.smartbean.utils.ExecutionContext;
import org.springframework.data.domain.AuditorAware;

/**
 * Created by qingfeilee on 2015/4/25.
 */
public class AuditableUser implements AuditorAware<String> {

    @Override
    public String getCurrentAuditor() {
        return ExecutionContext.getUserName();
    }
}
