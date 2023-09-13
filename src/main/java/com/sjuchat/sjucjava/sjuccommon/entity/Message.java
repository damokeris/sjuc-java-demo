package com.sjuchat.sjucjava.sjuccommon.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 留言
 * @Author lipeng
 * @Date 2023/9/12 15:33
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "message")
@Schema(description = "留言")
public class Message {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "留言id")
    private int id;

    @Column(name = "title")
    @Schema(description = "留言标题")
    private String title;

    @Column(name = "textdata")
    @Schema(description = "留言内容")
    private String textdata;

    @Column(name = "creater")
    @Schema(description = "创建者")
    private String creater;

    @Column(name = "create_time")
    @Schema(description = "创建时间")
    private String createTime;

    @Column(name = "type")
    @Schema(description = "留言类型")
    private String type;

    @Column(name = "deprecated")
    @Schema(description = "是否删除")
    private boolean deprecated;

    public Message() {

    }
}
