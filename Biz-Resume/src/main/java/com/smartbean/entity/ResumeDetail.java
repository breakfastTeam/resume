package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_resume_detail", catalog = "resume", uniqueConstraints = {})
public class ResumeDetail extends BaseEntity implements java.io.Serializable {

	// Fields
	private String id;
	private String name;   //姓名
	private String mobile; //电话
	private String email;  //电子邮件
	private String avatar; //头像
	private String liveAddress;//居住地
	private String workingYears;//工作年限
	private String gender;      //性别
	private DateTime birthday;
	private String workState;   //状态
	private String isRecommend; //是否推荐
	private String homeCity;    //户籍所在地
	private String QQ;
	private String IDCode;      //证件号
	private String links;      //个人主页
	private double nowSalary;  //现在收入
	private String intentCity; //期望工作城市
	private String intentWork;  //期望工作职能
	private String intentIndustry;//期望行业
	private String arrivalTime;   //到岗时间
	private String selfEvaluation;//自我评价
	private double hopeSalaryLow;//最低薪资标准
	private double hopeSalaryHigh;//最高薪资标准
	private String face;            //政治面貌
	private String hunyin;          //婚姻状态
	private List<ResumeDetailEducationExperience> resumeDetailEducationExperiences;
	private List<ResumeDetailProjectExperience> resumeDetailProjectExperiences;
	private List<ResumeDetailSkills> resumeDetailSkills;
	private List<ResumeDetailWorkExperience> resumeDetailWorkExperiences;



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

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "mobile")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "avatar")
	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "live_address")
	public String getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(String liveAddress) {
		this.liveAddress = liveAddress;
	}

	@Column(name = "working_years")
	public String getWorkingYears() {
		return workingYears;
	}

	public void setWorkingYears(String workingYears) {
		this.workingYears = workingYears;
	}

	@Column(name = "gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "birthday")
	public DateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(DateTime birthday) {
		this.birthday = birthday;
	}

	@Column(name = "work_state")
	public String getWorkState() {
		return workState;
	}

	public void setWorkState(String workState) {
		this.workState = workState;
	}

	@Column(name = "is_recommend")
	public String getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}

	@Column(name = "home_city")
	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	@Column(name = "QQ")
	public String getQQ() {
		return QQ;
	}

	public void setQQ(String QQ) {
		this.QQ = QQ;
	}

	@Column(name = "ID_Code")
	public String getIDCode() {
		return IDCode;
	}

	public void setIDCode(String IDCode) {
		this.IDCode = IDCode;
	}

	@Column(name = "links")
	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	@Column(name = "now_salary")
	public double getNowSalary() {
		return nowSalary;
	}

	public void setNowSalary(double nowSalary) {
		this.nowSalary = nowSalary;
	}

	@Column(name = "intent_city")
	public String getIntentCity() {
		return intentCity;
	}

	public void setIntentCity(String intentCity) {
		this.intentCity = intentCity;
	}

	@Column(name = "intent_work")
	public String getIntentWork() {
		return intentWork;
	}

	public void setIntentWork(String intentWork) {
		this.intentWork = intentWork;
	}

	@Column(name = "intent_industry")
	public String getIntentIndustry() {
		return intentIndustry;
	}

	public void setIntentIndustry(String intentIndustry) {
		this.intentIndustry = intentIndustry;
	}

	@Column(name = "arrival_time")
	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Column(name = "self_evaluation")
	public String getSelfEvaluation() {
		return selfEvaluation;
	}

	public void setSelfEvaluation(String selfEvaluation) {
		this.selfEvaluation = selfEvaluation;
	}

	@Column(name = "hope_salary_low")
	public double getHopeSalaryLow() {
		return hopeSalaryLow;
	}

	public void setHopeSalaryLow(double hopeSalaryLow) {
		this.hopeSalaryLow = hopeSalaryLow;
	}

	@Column(name = "hope_salary_high")
	public double getHopeSalaryHigh() {
		return hopeSalaryHigh;
	}

	public void setHopeSalaryHigh(double hopeSalaryHigh) {
		this.hopeSalaryHigh = hopeSalaryHigh;
	}

	@Column(name = "face")
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	@Column(name = "hunyin")
	public String getHunyin() {
		return hunyin;
	}

	public void setHunyin(String hunyin) {
		this.hunyin = hunyin;
	}

	public List<ResumeDetailEducationExperience> getResumeDetailEducationExperiences() {
		return resumeDetailEducationExperiences;
	}

	public void setResumeDetailEducationExperiences(List<ResumeDetailEducationExperience> resumeDetailEducationExperiences) {
		this.resumeDetailEducationExperiences = resumeDetailEducationExperiences;
	}

	public List<ResumeDetailProjectExperience> getResumeDetailProjectExperiences() {
		return resumeDetailProjectExperiences;
	}

	public void setResumeDetailProjectExperiences(List<ResumeDetailProjectExperience> resumeDetailProjectExperiences) {
		this.resumeDetailProjectExperiences = resumeDetailProjectExperiences;
	}

	public List<ResumeDetailSkills> getResumeDetailSkills() {
		return resumeDetailSkills;
	}

	public void setResumeDetailSkills(List<ResumeDetailSkills> resumeDetailSkills) {
		this.resumeDetailSkills = resumeDetailSkills;
	}

	public List<ResumeDetailWorkExperience> getResumeDetailWorkExperiences() {
		return resumeDetailWorkExperiences;
	}

	public void setResumeDetailWorkExperiences(List<ResumeDetailWorkExperience> resumeDetailWorkExperiences) {
		this.resumeDetailWorkExperiences = resumeDetailWorkExperiences;
	}
}