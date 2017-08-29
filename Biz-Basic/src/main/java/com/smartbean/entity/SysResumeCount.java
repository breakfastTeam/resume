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
@Table(name = "t_sys_resume_count", catalog = "resume", uniqueConstraints = {})
public class SysResumeCount extends BaseEntity implements java.io.Serializable {

    // Fields

    private String id;
    private Integer totalResumes;
    private Integer totalVIPs;
    private Integer totalPositions;
    private Integer totalCompanies;


    // Constructors

    /** default constructor */
    public SysResumeCount() {
    }

    /** minimal constructor */
    public SysResumeCount(String id) {
        this.id = id;
    }

    /** full constructor */
    public SysResumeCount(String id, Integer totalResumes, Integer totalVIPs, Integer totalPositions, Integer totalCompanies) {
        this.id = id;
        this.totalCompanies = totalCompanies;
        this.totalPositions = totalPositions;
        this.totalVIPs = totalVIPs;
        this.totalResumes = totalResumes;
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

    @Column(name = "total_resumes", unique = false, nullable = true, insertable = true, updatable = true)
    public Integer getTotalResumes() {
        return totalResumes;
    }

    public void setTotalResumes(Integer totalResumes) {
        this.totalResumes = totalResumes;
    }

    @Column(name = "total_vips", unique = false, nullable = true, insertable = true, updatable = true)
    public Integer getTotalVIPs() {
        return totalVIPs;
    }

    public void setTotalVIPs(Integer totalVIPs) {
        this.totalVIPs = totalVIPs;
    }

    @Column(name = "total_positions", unique = false, nullable = true, insertable = true, updatable = true)
    public Integer getTotalPositions() {
        return totalPositions;
    }

    public void setTotalPositions(Integer totalPositions) {
        this.totalPositions = totalPositions;
    }

    @Column(name = "total_companies", unique = false, nullable = true, insertable = true, updatable = true)
    public Integer getTotalCompanies() {
        return totalCompanies;
    }

    public void setTotalCompanies(Integer totalCompanies) {
        this.totalCompanies = totalCompanies;
    }
}
