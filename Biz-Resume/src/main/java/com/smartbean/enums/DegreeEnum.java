package com.smartbean.enums;

/**
 * Created by felix on 8/28/17.
 */
public enum DegreeEnum {

    JUNIOR_COLLEGE("junior_college", "1", "高中/中专"),
    HIGH_SCHOOL("high_school", "2",  "高中"),
    UNDERGRADUATE("undergraduate", "3", "本科"),
    MASTER("master", "4", "研究生"),
    DOCTOR("doctor", "5", "博士"),
    MBA("mba", "6", "MBA");





    /**
     * 返回结果枚举构造方法
     *
     * @param code        结果码
     * @param dbValue      数据库存入短整型值
     * @param description 结果描述
     */
    DegreeEnum(String code, String dbValue, String description) {
        this.code = code;
        this.dbValue = dbValue;
        this.description = description;
    }

    /**
     * code
     */
    private String code;

    /**
     * 数据库保存的对应值
     */
    private String dbValue;
    /**
     * 描述
     */
    private String description;

    /**
     *
     * @return 代码
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
     * @return 描述
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
    public static DegreeEnum get(String code) {
        if ("".equals(code) || code == null) {
            throw new RuntimeException("编码不存在！");
        }
        DegreeEnum[] list = values();
        for (DegreeEnum customerType : list) {
            if (code.equals(customerType.getCode().toString())) {
                return customerType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "JobStateEnum{" +
                "code=" + code +
                ", dbValue=" + dbValue +
                ", description='" + description + '\'' +
                '}';
    }
}