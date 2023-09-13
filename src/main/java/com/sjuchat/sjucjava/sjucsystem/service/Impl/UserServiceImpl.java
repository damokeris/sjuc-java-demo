package com.sjuchat.sjucjava.sjucsystem.service.Impl;

import com.sjuchat.sjucjava.sjuccommon.entity.User;
import com.sjuchat.sjucjava.sjucsystem.repository.UserRepository;
import com.sjuchat.sjucjava.sjucsystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description 用户服务接口实现
 * @Author lipeng
 * @Date 2023/9/13 9:58
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

}
