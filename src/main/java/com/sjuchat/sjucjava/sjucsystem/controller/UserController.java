package com.sjuchat.sjucjava.sjucsystem.controller;

import com.alibaba.fastjson2.JSON;
import com.sjuchat.sjucjava.sjuccommon.entity.User;
import com.sjuchat.sjucjava.sjuccommon.param.LoginParam;
import com.sjuchat.sjucjava.sjuccommon.result.CommonResult;
import com.sjuchat.sjucjava.sjuccommon.vo.user.UserInfoVo;
import com.sjuchat.sjucjava.sjucsystem.service.Impl.UserServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @Description 用户控制器
 * @Author lipeng
 * @Date 2023/9/13 14:44
 */
@RestController
@Tag(name = "用户控制器", description = "用户相关接口")
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserServiceImpl userService;

    private final ModelMapper modelMapper = new ModelMapper();

    @PostMapping(value = "/login")
    @Operation(summary = "用户登录接口", description = "用户登录接口")
    public Object login(@RequestBody LoginParam loginParam) {
        User tempUser = userService.findByUsername(loginParam.getUsername());
        if (Objects.isNull(tempUser)) {
            return JSON.toJSON(CommonResult.failed());
        }
        return JSON.toJSON(CommonResult.success());
    }

    /*@PostMapping(value = "/login")
    @Operation(summary = "用户登录接口", description = "用户登录接口")
    public Object login(@RequestBody LoginParam loginParam) {
        User tempUser = userService.findByUsername(loginParam.getUsername());
        if (tempUser == null || !Objects.equals(tempUser.getPassword(), loginParam.getPassword())) {
            return CommonResult.failed();
        }
        return CommonResult.success();
    }*/

    @GetMapping("/getUserInfo")
    @Operation(summary = "获取基本信息", description = "根据用户名获取用户(除密码)基本信息")
    public Object getUserInfo(@RequestParam String username) {
        UserInfoVo userInfoVo = modelMapper.map(userService.findByUsername(username), UserInfoVo.class);
        return JSON.toJSON(userInfoVo);
    }

    /*@GetMapping("/getUserInfo")
    @Operation(summary = "获取基本信息", description = "根据用户名获取用户(除密码)基本信息")
    public CommonResult<UserInfoVo> getUserInfo(@RequestParam String username) {
        UserInfoVo userInfoVo = modelMapper.map(userService.findByUsername(username), UserInfoVo.class);
        return CommonResult.success(userInfoVo);
    }*/


}
