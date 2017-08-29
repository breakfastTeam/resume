package com.smartbean.enums;

/**
 * Created by felix on 8/28/17.
 */
public enum CompanyTypeEnum {


    WAIZI_OUMEI("waiziOumei", "1", "外资（欧美）"),
    WAIZI_FEIOUMEI("waiziFeioumei", "2",  "外资（非欧美）"),
    HEIZI("hezi", "3", "合资"),
    GUOQI("guoqi", "4",  "国企"),
    MINYING("minying", "5",  "民营公司"),
    SHANGSHI("shangshi", "6",  "上市公司"),
    CHUANGYE("chuangye", "7",  "创业公司"),
    WAIQI("waiqi", "8",  "外企代表处"),
    ZHENGFU("zhengfu", "9",  "政府机关"),
    SHIYE("shiye", "10",  "事业单位"),
    FEIYINGLI("feiyingli", "11",  "非营利机构");


    /**
     * 返回结果枚举构造方法
     *
     * @param code        结果码
     * @param dbValue      数据库存入短整型值
     * @param description 结果描述
     */
    CompanyTypeEnum(String code, String dbValue, String description) {
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
    public static CompanyTypeEnum get(String code) {
        if ("".equals(code) || code == null) {
            throw new RuntimeException("编码不存在！");
        }
        CompanyTypeEnum[] list = values();
        for (CompanyTypeEnum customerType : list) {
            if (code.equals(customerType.getCode().toString())) {
                return customerType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "CompanyTypeEnum{" +
                "code=" + code +
                ", dbValue=" + dbValue +
                ", description='" + description + '\'' +
                '}';
    }
}