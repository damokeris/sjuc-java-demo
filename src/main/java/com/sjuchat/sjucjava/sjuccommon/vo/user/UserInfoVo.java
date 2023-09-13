package com.sjuchat.sjucjava.sjuccommon.vo.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 用户信息返回参数
 * @Author lipeng
 * @Date 2023/9/13 9:35
 */
@Data
@Schema(title = "用户信息返回参数")
public class UserInfoVo {

    @Schema(title = "用户名")
    private String username;

    @Schema(title = "角色")
    private String role;

    @Schema(title = "邮箱")
    private String email;

    @Schema(title = "手机号")
    private String telephone;

    @Schema(title = "描述")
    private String description;

    @Schema(title = "创建时间")
    private String createTime;

}
