package com.sjuchat.sjucjava.sjuccommon.vo.comment;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @Description 评论信息返回参数
 * @Author lipeng
 * @Date 2023/9/13 9:42
 */
@Data
@Schema(description = "评论信息返回参数")
public class CommentInfoVo {

    @Schema(description = "评论内容")
    private String textdata;

    @Schema(description = "创建者")
    private String creater;

    @Schema(description = "创建时间")
    private String createTime;

}
