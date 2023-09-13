package com.sjuchat.sjucjava.sjuccommon.param.message;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 新增留言请求参数
 * @Author lipeng
 * @Date 2023/9/13 9:25
 */
@Data
@Schema(description = "新增留言请求参数")
public class MessageAddParam {

    @Schema(description = "留言标题")
    private String title;

    @Schema(description = "留言内容")
    private String textdata;

    @Schema(description = "创建者")
    private String creater;

    @Schema(description = "留言类型")
    private String type;

}
