package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Data
@NoArgsConstructor
public class ResumeDetail extends BaseEntity {

	// Fields

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;   //姓名
	private String mobile; //电话
	private String email;  //电子邮件
	private String avatar; //头像
	private String liveAddress;//居住地
	private String workingYears;//工作年限
	private String gender;      //性别
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentDateTime",
			parameters = { @org.hibernate.annotations.Parameter(name = "databaseZone", value = "Asia/Shanghai"),
					@org.hibernate.annotations.Parameter(name = "javaZone", value = "jvm")})
	private DateTime birthday;
	private String workState;   //状态
	private String isRecommend; //是否推荐
	private String homeCity;    //户籍所在地
	private String qq;
	private String idCode;      //证件号
	private String links;      //个人主页
	private Double nowSalary;  //现在收入
	private String intentCity; //期望工作城市
	private String intentWork;  //期望工作职能
	private String intentIndustry;//期望行业
	private String arrivalTime;   //到岗时间
	private String selfEvaluation;//自我评价
	private Double hopeSalaryLow;//最低薪资标准
	private Double hopeSalaryHigh;//最高薪资标准
	private String face;            //政治面貌
	private String hunyin;          //婚姻状态

	@Transient
	private List<ResumeDetailEducationExperience> resumeDetailEducationExperiences;
	@Transient
	private List<ResumeDetailProjectExperience> resumeDetailProjectExperiences;
	@Transient
	private List<ResumeDetailSkills> resumeDetailSkills;
	@Transient
	private List<ResumeDetailWorkExperience> resumeDetailWorkExperiences;
}