package com.sjuchat.sjucjava.sjuccommon.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 分区
 * @Author lipeng
 * @Date 2023/9/12 15:27
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "subzone")
@Schema(description = "分区")
public class Subzone {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "分区id")
    private int id;

    @Column(name = "type")
    @Schema(description = "分区类型")
    private String type;

    @Column(name = "description")
    @Schema(description = "分区描述")
    private String description;

    @Column(name = "create_time")
    @Schema(description = "分区创建时间")
    private String createTime;

    @Column(name = "updater")
    @Schema(description = "分区更新者")
    private String updater;

    @Column(name = "update_time")
    @Schema(description = "分区更新时间")
    private String updateTime;

    @Column(name = "status")
    @Schema(description = "分区状态")
    private int status;

    @Column(name = "deprecated")
    @Schema(description = "分区废弃")
    private int deprecated;

    public Subzone() {

    }
}
