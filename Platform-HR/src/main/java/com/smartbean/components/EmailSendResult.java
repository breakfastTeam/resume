package com.smartbean.components;

import lombok.Data;

/**
 * @author longkai.zlk
 * @email zhaolongkai3k@gmail.com
 * @createTime 2017/9/2
 */
@Data
public class EmailSendResult {
    private Boolean result;
    private Integer statusCode;
    private String message;
    private Object info;
}
