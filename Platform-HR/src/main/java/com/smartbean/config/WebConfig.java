package com.smartbean.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@EnableWebMvc
@EnableAutoConfiguration
@EnableSpringHttpSession
public class WebConfig {
}
