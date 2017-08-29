package com.smartbean.entity.base.listener;

import com.smartbean.entity.base.BaseEntity;
import com.smartbean.constants.Constants;
import com.smartbean.enums.DataStatus;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by qingfeilee on 2015/4/25.
 */
@Component
public class BaseEntityListener {
//   @Autowired
//   OperateLogRepository operateLogRepository;

    /***
     * 更新前
     * **/
    @PreUpdate
    public void preUpdate(BaseEntity baseEntity) {
        DateTime currentDateTime = DateTime.now();
        baseEntity.setLastModifiedTime(currentDateTime);
        /*baseEntity.setLastModifiedBy((String)this.getSession().getAttribute(Constants.USER_ID));*/
        String lastModifiedBy = "";
        if(this.getSession() != null){//兼容在调度中session的场景
            lastModifiedBy = (String)this.getSession().getAttribute(Constants.USER_ID);
        }
        baseEntity.setLastModifiedBy(lastModifiedBy);
    }
    /**
     * 持久化前
     * **/
    @PrePersist
    public void prePersist(BaseEntity baseEntity) {
        DateTime currentDateTime = DateTime.now();
        baseEntity.setCreateTime(currentDateTime);
        baseEntity.setLastModifiedTime(currentDateTime);
        /*baseEntity.setCreateBy((String)this.getSession().getAttribute(Constants.USER_ID));
        baseEntity.setLastModifiedBy((String) this.getSession().getAttribute(Constants.USER_ID));*/
        String createBy = "";
        if(this.getSession() != null){//兼容在调度中session的场景
            createBy = (String)this.getSession().getAttribute(Constants.USER_ID);
        }
        baseEntity.setCreateBy(createBy);
        baseEntity.setLastModifiedBy(createBy);
        if(StringUtils.isBlank(baseEntity.getStatus())){
            baseEntity.setStatus(DataStatus.ACTIVE.getDBValue());
        }
    }

    /**
     * 删除前
     * **/
    @PreRemove
    public void preMove(BaseEntity baseEntity) {

    }

    /**
     * 加载完
     * **/
    @PostLoad
    public void postLoad(BaseEntity baseEntity) {
//        DateTime currentDateTime = DateTime.now();
//        baseEntity.setOptionTime(currentDateTime);
    }



    /**
     * 获取当前session
     * **/
    public HttpSession getSession() {
        HttpServletRequest request = null;
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if(servletRequestAttributes != null){
            request = servletRequestAttributes.getRequest();
        }

        return request != null ? request.getSession() : null;
    }
}
