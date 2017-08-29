package com.smartbean.entity;


import com.smartbean.entity.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * SysLogin entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sys_dynamic", catalog = "resume", uniqueConstraints = {})
public class SysDynamic extends BaseEntity implements java.io.Serializable {

    // Fields

    private String id;
    private String content;


    // Constructors

    /** default constructor */
    public SysDynamic() {
    }

    /** minimal constructor */
    public SysDynamic(String id) {
        this.id = id;
    }

    /** full constructor */
    public SysDynamic(String id, String content) {
        this.id = id;
        this.content = content;
    }

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

    @Column(name = "content", unique = false, nullable = true, insertable = true, updatable = true, length = 256)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
