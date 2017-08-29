package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_resume_detail", catalog = "resume", uniqueConstraints = {})
public class ResumeDetailEducationExperience extends BaseEntity implements java.io.Serializable {

	// Fields
	private String id;
	private DateTime startTime;//开始时间
	private DateTime endTime;//结束时间
	private String universityName;//学校名称
	private String majorName;//专业名称
	private String majorDesc;//专业描述
	private String degree;//学历

	private ResumeDetail resumeDetail;


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

	@Column(name = "end_time")
	public DateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(DateTime endTime) {
		this.endTime = endTime;
	}

	@Column(name = "university_name")
	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Column(name = "major_name")
	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	@Column(name = "major_desc")
	public String getMajorDesc() {
		return majorDesc;
	}

	public void setMajorDesc(String majorDesc) {
		this.majorDesc = majorDesc;
	}

	@Column(name = "degree")
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "resume_id", referencedColumnName = "ID", insertable = false, updatable = false, nullable = true)
	@NotFound(action= NotFoundAction.IGNORE)
	public ResumeDetail getResumeDetail() {
		return resumeDetail;
	}

	public void setResumeDetail(ResumeDetail resumeDetail) {
		this.resumeDetail = resumeDetail;
	}
}