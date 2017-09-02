package com.smartbean.config;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.smartbean.components.EmailSenderService;
import lombok.Getter;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@EnableWebMvc
@EnableAutoConfiguration
@EnableSpringHttpSession
@EnableConfigurationProperties(EmailSendConfig.class)
public class WebConfig {

    @Autowired
    private EmailSendConfig emailSendConfig;

    @Bean
    EmailSenderService emailSenderService() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor())
                .addInterceptor(new EmailSendInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(emailSendConfig.getDomain())
                .client(client)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(EmailSenderService.class);
    }

    private class EmailSendInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request originalRequest = chain.request();
            Request request;
            String method = originalRequest.method();
            Headers headers = originalRequest.headers();
            HttpUrl modifiedUrl = originalRequest.url().newBuilder()
                    .addEncodedQueryParameter("apiUser", emailSendConfig.getApiUser())
                    .addEncodedQueryParameter("apiKey", emailSendConfig.getApiKey())
                    .addEncodedQueryParameter("from", emailSendConfig.getFrom())
                    .addEncodedQueryParameter("fromName", emailSendConfig.getFromName())
                    .build();
            request = originalRequest.newBuilder().url(modifiedUrl).build();
            return chain.proceed(request);
        }
    }
}
