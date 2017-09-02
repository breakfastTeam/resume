package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ResumeDetailSkills extends BaseEntity {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long resumeDetailId;
	private String skillName;
	private Integer score;

}