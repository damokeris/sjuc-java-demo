package com.sjuchat.sjucjava.sjuccommon.result;

import com.sjuchat.sjucjava.sjuccommon.constant.MessageConstants;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @Description 泛型通用返回对象
 * @Author lipeng
 * @Date 2023/9/12 16:39
 */
@Schema(description = "泛型通用返回对象")
@Component
public class CommonResult<T> {

    /** 状态码 */
    private int code;

    /** 消息 */
    private String message;

    /** 数据对象 */
    private T data;

    /**
     * 初始化一个新创建的 CommonResult 对象，使其表示一个空消息。
     */
    public CommonResult() {
    }

    /**
     * 初始化一个新创建的 CommonResult 对象
     * @param code 状态码
     * @param message 消息提示
     * @param data 数据对象
     */
    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功封装方法
     * @return 成功消息
     */
    public static CommonResult success() {
        return success(MessageConstants.SUCCESS);
    }

    /**
     * 成功封装方法
     * @param message 消息提示
     * @return 成功消息
     */
    public static <T> CommonResult<T> success(String message) {
        return new CommonResult<>(HttpStatus.OK.value(), message, null);
    }

    /**
     * 成功封装方法
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(HttpStatus.OK.value(), MessageConstants.SUCCESS, data);
    }

    /**
     * 成功封装方法
     * @param message 消息提示
     * @param data 数据对象
     * @return 成功消息
     */
    public static <T> CommonResult<T> success(String message, T data) {
        return new CommonResult<T>(HttpStatus.OK.value(), message, data);
    }

    /**
     * 失败封装方法
     * @return 错误消息
     */
    public static CommonResult failed() {
        return failed(MessageConstants.ERROR);
    }

    /**
     * 失败封装方法
     * @param message 消息提示
     * @return 错误消息
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<T>(HttpStatus.INTERNAL_SERVER_ERROR.value(), message, null);
    }

    /**
     * 失败封装方法
     * @param message 消息提示
     * @param data 数据对象
     * @return 错误消息
     */
    public static <T> CommonResult<T> failed(String message, T data) {
        return new CommonResult<T>(HttpStatus.INTERNAL_SERVER_ERROR.value(), message, data);
    }

    /**
     * 失败封装方法
     * @param data 数据对象
     * @return 错误消息
     */
    public static <T> CommonResult<T> failed(T data) {
        return new CommonResult<T>(HttpStatus.INTERNAL_SERVER_ERROR.value(), MessageConstants.ERROR, data);
    }

    /**
     * 失败封装方法
     * @param code 数据对象
     * @param message 消息提示
     * @return 错误消息
     */
    public static <T> CommonResult<T> failed(int code, String message) {
        return new CommonResult<T>(HttpStatus.INTERNAL_SERVER_ERROR.value(), message, null);
    }

    /**
     * 失败封装方法
     * @param code 数据对象
     * @param message 消息提示
     * @param data 数据对象
     * @return 错误消息
     */
    public static <T> CommonResult<T> failed(int code, String message, T data) {
        return new CommonResult<T>(code, message, data);
    }

}
