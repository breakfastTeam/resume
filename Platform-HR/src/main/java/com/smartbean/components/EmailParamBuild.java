package com.smartbean.components;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@Data
public class EmailParamBuild {

    @AllArgsConstructor
    enum Template{

        VERIFICATION_CODE_EMAIL("验证码邮件模板");

        private String desc;
    }

    private List<String> to;
    private Map<String, List<String>> sub;

    EmailParamBuild(String to, String name, String verificationCode) {
        this.to = Lists.newArrayList(to);
        this.sub = new HashMap<String, List<String>>(){{
            put("%name%", Lists.newArrayList(name));
            put("%verificationCode%", Lists.newArrayList(verificationCode));
        }};
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
