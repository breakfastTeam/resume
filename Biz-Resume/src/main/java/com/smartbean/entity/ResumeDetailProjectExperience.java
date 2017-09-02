package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Data
@NoArgsConstructor
public class ResumeDetailProjectExperience extends BaseEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long resumeDetailId;

	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
			parameters = { @org.hibernate.annotations.Parameter(name = "databaseZone", value = "Asia/Shanghai"),
					@org.hibernate.annotations.Parameter(name = "javaZone", value = "jvm")})
	private DateTime startTime;

	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
			parameters = { @org.hibernate.annotations.Parameter(name = "databaseZone", value = "Asia/Shanghai"),
					@org.hibernate.annotations.Parameter(name = "javaZone", value = "jvm")})
	private DateTime endTime;
	private String projectName;
	private String projectDesc;
	private String responsibility;
}