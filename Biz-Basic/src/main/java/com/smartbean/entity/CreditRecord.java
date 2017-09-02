package com.smartbean.entity;

import com.smartbean.converts.CreditOperateConvert;
import com.smartbean.entity.base.BaseEntity;
import com.smartbean.enums.CreditOperate;
import com.sun.xml.internal.rngom.parse.host.Base;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 积分记录表
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@Entity
@Data
@NoArgsConstructor
public class CreditRecord extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private Integer credits;
    @Convert(converter = CreditOperateConvert.class)
    private CreditOperate operate;

    public CreditRecord(Long userId, CreditOperate operate) {
        this.userId = userId;
        this.credits = operate.getCredits();
        this.operate = operate;
    }
}
