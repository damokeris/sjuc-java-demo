package com.sjuchat.sjucjava.sjuccommon.param.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 新增用户请求参数
 * @Author lipeng
 * @Date 2023/9/13 8:38
 */
@Data
@Schema(description = "新增用户请求参数")
public class UserAddParam {

    @Schema(title = "用户名")
    private String username;

    @Schema(title = "密码")
    private String password;

    @Schema(title = "角色")
    private String role;

    @Schema(title = "邮箱")
    private String email;

    @Schema(title = "手机号")
    private String telephone;

    @Schema(title = "描述")
    private String description;

}
