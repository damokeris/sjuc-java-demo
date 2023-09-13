package com.sjuchat.sjucjava.sjuccommon.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 回复
 * @Author lipeng
 * @Date 2023/9/12 15:38
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "reply")
@Schema(description = "回复")
public class Reply {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "回复id")
    private int id;

    @Column(name = "textdata")
    @Schema(description = "回复内容")
    private String textdata;

    @Column(name = "creater")
    @Schema(description = "创建者")
    private String creater;

    @Column(name = "create_time")
    @Schema(description = "创建时间")
    private String createTime;

    @Column(name = "comment_id")
    @Schema(description = "评论id")
    private String  commentId;

    @Column(name = "deprecated")
    @Schema(description = "是否废弃")
    private boolean deprecated;

    public Reply() {

    }
}
