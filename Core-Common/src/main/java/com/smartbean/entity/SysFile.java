package com.smartbean.entity;

import com.smartbean.entity.base.BaseEntity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * TSysFile entity.
 *
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_sys_file", catalog = "dfpv", uniqueConstraints = {})
public class SysFile extends BaseEntity implements java.io.Serializable {

    // Fields

    private String id;
    private String fileType;
    private String path;
    private String fileName;
    private String originalName;

    // Constructors

    /** default constructor */
    public SysFile() {
    }

    /** minimal constructor */
    public SysFile(String id) {
        this.id = id;
    }

    /** full constructor */
    public SysFile(String id, String path, String status, Date createTime,String fileName,
                   String originalName,String fileType,
                   String createBy) {
        this.id = id;
        this.path = path;
        this.fileName = fileName;
        this.originalName = originalName;
        this.fileType = fileType;
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
    @Column(name = "PATH", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    @Column(name = "FILE_TYPE", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    public String getFileType() {
        return this.fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Column(name = "FILE_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Column(name = "ORIGINAL_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 64)
    public String getOriginalName() {
        return this.originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

}
