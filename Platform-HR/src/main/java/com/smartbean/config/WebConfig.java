package com.smartbean.config;

import com.smartbean.components.EmailSenderService;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@Configuration
@EnableSpringDataWebSupport
@EnableSpringHttpSession
public class WebConfig extends WebMvcConfigurerAdapter {


}
