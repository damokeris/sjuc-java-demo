package com.sjuchat.sjucjava.sjuccommon.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 评论
 * @Author lipeng
 * @Date 2023/9/12 15:35
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "comment")
@Schema(description = "评论")
public class Comment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "评论id")
    private int id;

    @Column(name = "textdata")
    @Schema(description = "评论内容")
    private String textdata;

    @Column(name = "creater")
    @Schema(description = "创建者")
    private String creater;

    @Column(name = "create_time")
    @Schema(description = "创建时间")
    private String createTime;

    @Column(name = "message_id")
    @Schema(description = "留言id")
    private String messageId;

    @Column(name = "deprecated")
    @Schema(description = "是否删除")
    private boolean deprecated;

    public Comment() {

    }
}
