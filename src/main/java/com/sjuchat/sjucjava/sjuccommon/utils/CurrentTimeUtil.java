package com.sjuchat.sjucjava.sjuccommon.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description 获取当前时间工具类
 * @Author lipeng
 * @Date 2023/9/12 15:46
 */
@Component
public class CurrentTimeUtil {
    private static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd";

    /**
     * 获取当前时间接口(以yyyy-MM-dd格式)
     *
     * @return 当前时间
     */
    public static String getCurrentDateTime() {
        return getCurrentDateTime(DEFAULT_DATE_TIME_FORMAT);
    }

    /**
     *  获取当前时间实现奶方法(以指定格式)
     *
     * @param format 给定的格式
     * @return 当前时间
     */
    public static String getCurrentDateTime(String format) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return now.format(formatter);
    }

}
