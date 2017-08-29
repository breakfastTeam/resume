package com.smartbean.constants;

import org.joda.time.DateTime;

import java.io.File;

/**
 * Created by qingfeilee on 2015/4/21.
 */
public class Constants {

    public static final String USER_ID = "USER_ID";

    public static final String SHOP_ID = "SHOP_ID";

    public static final String USER_AVATAR_PATH = "upload"+ File.separator+"user"+ File.separator + DateTime.now().toString("yyyy-MM-dd") +File.separator+"avatar";

    public static final String USER_EXCEL_PATH = "upload"+ File.separator+"user"+ File.separator + DateTime.now().toString("yyyy-MM-dd") +File.separator+"excel";

}
