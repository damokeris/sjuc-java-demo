package com.sjuchat.sjucjava.sjucsystem.repository;

import com.sjuchat.sjucjava.sjuccommon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description 用户数据操作层接口
 * @Author lipeng
 * @Date 2023/9/13 9:48
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}
