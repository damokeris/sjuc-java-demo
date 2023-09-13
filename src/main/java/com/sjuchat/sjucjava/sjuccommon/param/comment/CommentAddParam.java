package com.sjuchat.sjucjava.sjuccommon.param.comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 新增评论请求参数
 * @Author lipeng
 * @Date 2023/9/13 9:32
 */
@Data
@Schema(description = "新增评论请求参数")
public class CommentAddParam {

    @Schema(description = "评论内容")
    private String textdata;

    @Schema(description = "创建者")
    private String creater;

    @Schema(description = "留言id")
    private String messageId;

}
