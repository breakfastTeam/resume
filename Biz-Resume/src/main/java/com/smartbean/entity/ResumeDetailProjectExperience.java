package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_resume_detail", catalog = "resume", uniqueConstraints = {})
public class ResumeDetailProjectExperience extends BaseEntity implements java.io.Serializable {

	// Fields
	private String id;
	private DateTime startTime;
	private DateTime endTime;
	private String projectName;
	private String projectDesc;
	private String responsibility;


	// Property accessors
	@Id
	@GeneratedValue(generator = "id")
	@GenericGenerator(name = "id", strategy = "uuid")
	@Column(name = "ID", unique = true, nullable = false, insertable = true, updatable = true, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}


	@Column(name = "start_time")
	public DateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}

	@Column(name = "start_time")
	public DateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(DateTime endTime) {
		this.endTime = endTime;
	}

	@Column(name = "project_name")
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Column(name = "project_desc")
	public String getProjectDesc() {
		return projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	@Column(name = "responsibility")
	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
}