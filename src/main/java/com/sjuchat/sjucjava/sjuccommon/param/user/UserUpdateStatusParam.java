package com.sjuchat.sjucjava.sjuccommon.param.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 用户状态更新请求参数
 * @Author lipeng
 * @Date 2023/9/13 9:17
 */
@Data
@Schema(description = "用户状态更新请求参数")
public class UserUpdateStatusParam {

    @Schema(title = "用户 id")
    private int id;

    @Schema(title = "帐号启用状态：0->禁用；1->启用")
    private int status;

}
