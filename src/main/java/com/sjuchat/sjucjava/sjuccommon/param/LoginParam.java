package com.sjuchat.sjucjava.sjuccommon.param;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 登录请求参数
 * @Author lipeng
 * @Date 2023/9/13 8:33
 */
@Data
@Schema(description = "登录请求参数")
public class LoginParam {

    /**
     * 用户名
     */
    @Schema(description = "用户名")
    private String username;

    /**
     * 密码
     */
    @Schema(description = "密码")
    private String password;

}
