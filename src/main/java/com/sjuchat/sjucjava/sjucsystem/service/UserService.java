package com.sjuchat.sjucjava.sjucsystem.service;


import com.sjuchat.sjucjava.sjuccommon.entity.User;

/**
 * @Description 用户服务接口
 * @Author lipeng
 * @Date 2023/9/13 9:56
 */
public interface UserService {

    User findByUsername(String username);

}
