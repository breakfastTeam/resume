package com.smartbean.entity.base;

import lombok.Data;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * Created by qingfeilee on 2015/4/25.
 */

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class, AuditableUser.class})
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity implements java.io.Serializable {

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    @CreatedDate
    private DateTime createTime;

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    @LastModifiedDate
    private DateTime lastModifiedTime;

    @CreatedBy
    private Long createBy;

    @LastModifiedBy
    private Long lastModifiedBy;

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    @LastModifiedDate
    private DateTime optionTime;

    private String status;

    @Transient
    private String createTimeStr;
    @Transient
    private String lastModifiedTimeStr;
}
