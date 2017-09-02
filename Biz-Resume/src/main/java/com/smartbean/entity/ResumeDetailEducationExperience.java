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
public class ResumeDetailEducationExperience extends BaseEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long resumeDetailId;
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
			parameters = { @org.hibernate.annotations.Parameter(name = "databaseZone", value = "Asia/Shanghai"),
					@org.hibernate.annotations.Parameter(name = "javaZone", value = "jvm")})
	private DateTime startTime;//开始时间
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
			parameters = { @org.hibernate.annotations.Parameter(name = "databaseZone", value = "Asia/Shanghai"),
					@org.hibernate.annotations.Parameter(name = "javaZone", value = "jvm")})
	private DateTime endTime;//结束时间
	private String universityName;//学校名称
	private String majorName;//专业名称
	private String majorDesc;//专业描述
	private String degree;//学历

}