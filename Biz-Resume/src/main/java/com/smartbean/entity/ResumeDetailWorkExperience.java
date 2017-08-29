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
public class ResumeDetailWorkExperience extends BaseEntity implements java.io.Serializable {

	// Fields
	private String id;
	private String companyName;//公司名称
	private DateTime startTime;//开始时间
	private DateTime endTime;  //结束时间
	private String companyType;//公司类型
	private String department; //所在部门
	private String size;       //公司规模
	private String workDesc;   //工作描述


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


	@Column(name = "company_name")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	@Column(name = "company_type")
	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	@Column(name = "department")
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Column(name = "size")
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name = "work_desc")
	public String getWorkDesc() {
		return workDesc;
	}

	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}
}