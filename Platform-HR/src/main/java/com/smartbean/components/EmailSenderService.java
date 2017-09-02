package com.smartbean.components;

import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
public interface EmailSenderService {

    String ACCEPT = "ACCEPT: */*";

    @POST("sendtemplate")
    @FormUrlEncoded
    @Headers({ACCEPT})
    Call<EmailSendResult> sendRegisterCodeEmail(@Field("templateInvokeName") String templateName,
                                                @Field("xsmtpapi") String xsmtpapi);
}
