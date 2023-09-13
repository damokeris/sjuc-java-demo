package com.sjuchat.sjucjava.sjuccommon.vo.message;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 留言信息返回参数
 * @Author lipeng
 * @Date 2023/9/13 9:40
 */
@Data
@Schema(title = "留言信息返回参数")
public class MessageInfoVo {

    @Schema(description = "留言标题")
    private String title;

    @Schema(description = "留言内容")
    private String textdata;

    @Schema(description = "创建者")
    private String creater;

    @Schema(description = "创建时间")
    private String createTime;

}
