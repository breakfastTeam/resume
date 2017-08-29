package com.smartbean.entity.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 日志工具类
 * Created by Administrator on 2015/11/10.
 */
public class LoggerHelper {
    private static final Logger logger;

    static {
        logger = Logger.getLogger("CarShop");
        logger.setLevel(Level.ALL);
    }

    public static void log(String info, Level level, Throwable ex) {
        logger.log(level, info, ex);
    }
}
