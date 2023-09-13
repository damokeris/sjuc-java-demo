CREATE TABLE
    `comment`
(
    `id`          int         NOT NULL AUTO_INCREMENT COMMENT '评论id',
    `textdata`    text        NULL COMMENT '内容',
    `creater`     varchar(32) NULL COMMENT '创建者',
    `create_time` date        NULL COMMENT '创建时间',
    `message_id`  int         NULL COMMENT '归属留言',
    `deprecated`  int         NULL     DEFAULT 0 COMMENT '逻辑删除',
    PRIMARY KEY (`id`)
);

CREATE TABLE
    `message`
(
    `id`          int         NOT NULL AUTO_INCREMENT COMMENT '留言id',
    `title`       varchar(64) NOT NULL COMMENT '标题',
    `textdata`    text        NOT NULL COMMENT '内容',
    `creater`     varchar(32) NULL COMMENT '创建者',
    `create_time` date        NULL COMMENT '创建时间',
    `type`        varchar(16) NULL COMMENT '分区',
    `deprecated`  int         NULL     DEFAULT 0 COMMENT '逻辑删除',
    PRIMARY KEY (`id`)
);

CREATE TABLE
    `reply`
(
    `id`          int         NOT NULL AUTO_INCREMENT COMMENT '回复id',
    `textdata`    text        NULL COMMENT '内容',
    `creater`     varchar(32) NULL COMMENT '创建者',
    `create_time` date        NULL COMMENT '创建时间',
    `comment_id`  int         NULL COMMENT '归属评论',
    `deprecated`  int         NULL     DEFAULT 0 COMMENT '逻辑删除',
    PRIMARY KEY (`id`)
);

CREATE TABLE
    `subzone`
(
    `id`          int         NOT NULL AUTO_INCREMENT COMMENT '分区id',
    `type`        varchar(16) NOT NULL COMMENT '分区-en',
    `description` varchar(32) NOT NULL COMMENT '分区-cn',
    `create_time` date        NULL COMMENT '创建时间',
    `updater`     varchar(32) NULL COMMENT '更新者',
    `update_time` date        NULL COMMENT '更新时间',
    `status`      int         NOT NULL DEFAULT 0 COMMENT '启用状态',
    `deprecated`  int         NOT NULL DEFAULT 1 COMMENT '逻辑删除',
    PRIMARY KEY (`id`)
);

CREATE TABLE
    `user`
(
    `id`          int         NOT NULL AUTO_INCREMENT COMMENT '用户id',
    `username`    varchar(32) NOT NULL COMMENT '账号(用户名)',
    `password`    varchar(32) NOT NULL COMMENT '密码',
    `role`        varchar(32) NOT NULL COMMENT '角色',
    `email`       varchar(32) NULL COMMENT '邮箱',
    `telephone`   varchar(16) NULL COMMENT '电话',
    `description` varchar(64) NULL COMMENT '简介',
    `create_time` date        NULL COMMENT '创建时间',
    `login_time`  date        NULL COMMENT '最后登录时间',
    `updater`     varchar(32) NULL COMMENT '更新者',
    `update_time` date        NULL COMMENT '更新时间',
    `status`      int         NOT NULL DEFAULT 1 COMMENT '启用状态',
    `deprecated`  int         NOT NULL DEFAULT 0 COMMENT '逻辑删除',
    PRIMARY KEY (`id`)
);

INSERT INTO sjuchat.user (id, username, password, role, email, telephone, description, create_time, login_time, updater, update_time, status, deprecated) VALUES (2, 'test', '123456', 'admin', null, null, null, null, null, null, null, 1, 1);
