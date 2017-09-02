package com.smartbean.entity;


import com.smartbean.entity.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * SysLogin entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity

@Data
@NoArgsConstructor
public class SysDynamic extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
}
