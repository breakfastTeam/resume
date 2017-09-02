package com.smartbean.utils;

import lombok.Data;

@Data
public class JsonResult<T> {

    private T obj;//返回的实体数据
    private boolean success;//返回是否成功的标示
    private String code;//报文编码
    private String message;//返回成功或失败的提示信息

    public JsonResult(boolean success) {
        this.success = success;
    }
    public JsonResult(boolean success, T obj) {
        this.success = success;
        this.obj = obj;
    }

    public static JsonResult<?> success() {
        return new JsonResult(true);
    }

    public static <T> JsonResult<T> success(T obj) {
        return new JsonResult(true, obj);
    }
}
