package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import org.hibernate.annotations.*;
import org.joda.time.DateTime;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Parameter;
import javax.persistence.Table;
import java.util.Date;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_resume", catalog = "resume", uniqueConstraints = {})
public class Resume implements java.io.Serializable {

	// Fields
	private Integer id;
	private String content;
	private DateTime createTime;
	private Integer resumeId;


	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
			parameters = { @org.hibernate.annotations.Parameter(name = "databaseZone", value = "Asia/Shanghai"),
					@org.hibernate.annotations.Parameter(name = "javaZone", value = "jvm")})
	@Column(name = "create_time")
	public DateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(DateTime createTime) {
		this.createTime = createTime;
	}

	@Column(name = "resume_id")
	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}
}