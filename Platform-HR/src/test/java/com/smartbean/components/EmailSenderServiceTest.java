package com.smartbean.components;

import com.alibaba.fastjson.JSON;
import com.smartbean.config.EmailSendConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailSenderServiceTest {

    @Autowired
    private EmailSenderService emailSenderService;
    @Autowired
    private EmailSendConfig emailSendConfig;

    @Test
    public void sendRegisterCodeEmail() {
        String xsmtpapi = new EmailParamBuild("zhaolongkai2012@163.com", "kkk", "abc123").toString();
        System.out.println(xsmtpapi);
        System.out.println(emailSendConfig.getFromName());
        Call<EmailSendResult> test = emailSenderService.sendRegisterCodeEmail(EmailParamBuild.Template.VERIFICATION_CODE_EMAIL.name(), xsmtpapi);
        try {
            Response<EmailSendResult> execute = test.execute();
            System.out.println(execute.isSuccessful());
            System.out.println(execute.body());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
