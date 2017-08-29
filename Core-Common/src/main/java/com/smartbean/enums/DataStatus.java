package com.smartbean.enums;


/**
 * Created by felix on 9/15/15.
 * 定义系统数据的删除状态和激活状态
 */
public enum DataStatus {

    /**
     * 关闭
     */
    ACTIVE("active", "ACTIVE", "激活"),

    /**
     * 激活
     */
    DELETE("delete","DELETED", "删除");


    /**
     * 返回结果枚举构造方法
     *
     * @param code        结果码
     * @param dbValue      数据库存入短整型值
     * @param description 结果描述
     */
    DataStatus(String code, String dbValue, String description) {
        this.code = code;
        this.dbValue = dbValue;
        this.description = description;
    }

    /**
     * 店铺状态code
     */
    private String code;

    /**
     * 数据库保存的对应值
     */
    private String dbValue;
    /**
     * 店铺状态描述
     */
    private String description;

    /**
     * 获得店铺状态代码
     *
     * @return 店铺状态代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取数据中存入的对应短整型值
     * @return
     */
    public String getDBValue() {
        return dbValue;
    }

    /**
     * 获得店铺状态描述
     *
     * @return 店铺状态描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 通过code得到返回结果对象
     *
     * @param code 结果码
     * @return 结果枚举对象
     */
    public static DataStatus get(String code) {
        if ("".equals(code) || code == null) {
            throw new RuntimeException("状态码不存在！");
        }
        DataStatus[] list = values();
        for (DataStatus dataStatus : list) {
            if (code.equals(dataStatus.getCode().toString())) {
                return dataStatus;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DataStatus{" +
                "code=" + code +
                ", dbValue=" + dbValue +
                ", description='" + description + '\'' +
                '}';
    }
}
