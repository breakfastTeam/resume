package com.smartbean.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "sendCloud.email")
public class EmailSendProperties {

    private String domain;
    private String apiUser;
    private String apiKey;
    private String from;
    private String fromName;
}
