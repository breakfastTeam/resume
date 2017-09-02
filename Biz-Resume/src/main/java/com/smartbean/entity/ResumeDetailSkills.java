package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * ShopInfo entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Data
@NoArgsConstructor
public class ResumeDetailSkills extends BaseEntity {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long resumeDetailId;
	private String skillName;
	private Integer score;

}