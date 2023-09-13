package com.sjuchat.sjucjava.sjuccommon.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 用户
 * @Author lipeng
 * @Date 2023/9/12 11:17
 */
@Data
@AllArgsConstructor
@Entity
@Table(name = "user")
@Schema(description = "用户")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(title = "用户ID")
    private int id;

    @Column(name = "username")
    @Schema(title = "用户名")
    private String username;

    @Column(name = "password")
    @Schema(title = "密码")
    private String password;

    @Column(name = "role")
    @Schema(title = "角色")
    private String role;

    @Column(name = "email")
    @Schema(title = "邮箱")
    private String email;

    @Column(name = "telephone")
    @Schema(title = "手机号")
    private String telephone;

    @Column(name = "description")
    @Schema(title = "描述")
    private String description;

    @Column(name = "create_time")
    @Schema(title = "创建时间")
    private String createTime;

    @Column(name = "login_time")
    @Schema(title = "登录时间")
    private String loginTime;

    @Column(name = "updater")
    @Schema(title = "更新者")
    private String updater;

    @Column(name = "update_time")
    @Schema(title = "更新时间")
    private String updateTime;

    @Column(name = "status")
    @Schema(title = "启用状态")
    private int status;

    @Column(name = "deprecated")
    @Schema(title = "作废状态")
    private int deprecated;

    public User() {

    }
}
