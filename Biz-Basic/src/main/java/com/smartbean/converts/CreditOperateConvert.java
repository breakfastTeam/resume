package com.smartbean.converts;

import com.smartbean.enums.CreditOperate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class CreditOperateConvert implements AttributeConverter<CreditOperate, String> {

    public CreditOperate convertToEntityAttribute(String dbData) {
        switch (dbData) {
            case "SIGN" : return CreditOperate.SIGN;
            case "UPLOAD" : return CreditOperate.UPLOAD;
            default : throw new RuntimeException("枚举值不存在CreditOperate:" + dbData);
        }
    }

    public String convertToDatabaseColumn(CreditOperate attribute) {
        if(attribute != null){
            return attribute.name();
        } else {
            throw new RuntimeException("CreditOperate不能为空");
        }
    }
}