package com.sjuchat.sjucjava.sjuccommon.param.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 用户修改密码请求参数
 * @Author lipeng
 * @Date 2023/9/13 9:10
 */
@Data
@Schema(description = "用户修改密码请求参数")
public class UserUpdatePwdParam {

    /** 用户 id */
    @Schema(title = "用户 id", type = "Long")
    private int id;

    /** 旧密码 */
    @Schema(title = "旧密码")
    private String oldpassword;

    /** 新密码 */
    @Schema(title = "新密码")
    private String newpassword;

}
