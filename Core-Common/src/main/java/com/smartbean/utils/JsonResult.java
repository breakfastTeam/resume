package com.smartbean.utils;

import lombok.Data;

@Data
public class JsonResult {

    private Object obj;//返回的实体数据
    private boolean success;//返回是否成功的标示
    private String code;//报文编码
    private String message;//返回成功或失败的提示信息

    public JsonResult(boolean success) {
        this.success = success;
    }

    public static JsonResult success() {
        return new JsonResult(true);
    }
}
