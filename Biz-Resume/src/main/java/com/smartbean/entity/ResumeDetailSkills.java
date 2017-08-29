package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_resume_detail", catalog = "resume", uniqueConstraints = {})
public class ResumeDetailSkills extends BaseEntity implements java.io.Serializable {

	// Fields
	private String id;
	private String skillName;
	private Integer score;


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

	@Column(name = "skill_name")
	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Column(name = "score")
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}