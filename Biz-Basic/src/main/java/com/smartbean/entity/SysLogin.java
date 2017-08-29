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
@Table(name = "t_sys_login", catalog = "resume", uniqueConstraints = {})
public class SysLogin extends BaseEntity implements java.io.Serializable {

    // Fields

    private String id;
    private String email;
    private String mobilePhone;
    private String loginName;
    private String password;

    // Constructors

    /** default constructor */
    public SysLogin() {
    }

    /** minimal constructor */
    public SysLogin(String id) {
        this.id = id;
    }

    /** full constructor */
    public SysLogin(String id, String loginName, String password){
        this.id = id;
        this.loginName = loginName;
        this.password = password;

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

    @Column(name = "EMAIL", unique = false, nullable = true, insertable = true, updatable = true, length = 128)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name = "mobile_phone", unique = false, nullable = true, insertable = true, updatable = true, length = 16)
    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }



    @Column(name = "LOGIN_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Column(name = "PASSWORD", unique = false, nullable = true, insertable = true, updatable = true, length = 32)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
