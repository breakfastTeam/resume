package com.smartbean.entity.base;

import com.smartbean.entity.base.listener.BaseEntityListener;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created by qingfeilee on 2015/4/25.
 */

@MappedSuperclass
@EntityListeners(BaseEntityListener.class)
public class BaseEntity {

    private DateTime createTime;
    private DateTime lastModifiedTime;
    private String createBy;
    private String lastModifiedBy;
    private DateTime optionTime;
    private String status;
    @Transient
    private String createTimeStr;

    @Transient
    private String lastModifiedTimeStr;



    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
            @Parameter(name = "javaZone", value = "jvm")})
	@Column(name = "CREATE_TIME")
    public DateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    @Column(name = "CREATE_BY", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Column(name = "LAST_MODIFIED_BY")
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    @Column(name = "LAST_MODIFIED_TIME")
    public DateTime getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public void setLastModifiedTime(DateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
            parameters = { @Parameter(name = "databaseZone", value = "Asia/Shanghai"),
                    @Parameter(name = "javaZone", value = "jvm")})
    @Column(name = "OPTION_TIME")
    public DateTime getOptionTime() {
        return this.optionTime;
    }

    public void setOptionTime(DateTime optionTime) {
        this.optionTime = optionTime;
    }

    @Column(name = "STATUS")
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Transient
    public String getCreateTimeStr() {
        if(this.createTime!=null)
            return this.createTime.toString("yyyy-MM-dd HH:mm:ss");
        else
            return null;
    }

    @Transient
    public void setCreateTimeStr(String createTimeStr) {
        if(this.createTime!=null)
            this.createTimeStr = this.createTime.toString("yyyy-MM-dd HH:mm:ss");
        else
            this.createTimeStr = null;

    }
    @Transient
    public String getLastModifiedTimeStr() {
        if(this.lastModifiedTime!=null)
            return this.lastModifiedTime.toString("yyyy-MM-dd HH:mm:ss");
        else
            return null;
    }

    @Transient
    public void setLastModifiedTimeStr(String lastModifiedTimeStr) {
        if(this.lastModifiedTime!=null)
            this.lastModifiedTimeStr = this.lastModifiedTime.toString("yyyy-MM-dd HH:mm:ss");
        else

            this.lastModifiedTimeStr = null;
    }
}
