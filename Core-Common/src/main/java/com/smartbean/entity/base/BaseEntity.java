package com.smartbean.entity.base;

import com.smartbean.entity.base.listener.BaseEntityListener;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ListIndexBase;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created by qingfeilee on 2015/4/25.
 */

@MappedSuperclass
@EntityListeners(BaseEntityListener.class)
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntity implements java.io.Serializable {

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    private DateTime createTime;

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    private DateTime lastModifiedTime;

    private String createBy;

    private String lastModifiedBy;

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    private DateTime optionTime;

    private String status;


    @Transient
    private String createTimeStr;
    @Transient
    private String lastModifiedTimeStr;
}
