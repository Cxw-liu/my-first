package com.briup.cms.web.controller;

import com.briup.cms.bean.User;
import com.briup.cms.service.impl.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LPF
 * @create 2019/11/25 13:23
 */
@RestController
@Api(value="用户管理类")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    /**
     * 注册
     * @param user
     * @return User
     */
    @PostMapping("/register")
    @ApiOperation(value = "新增一个用户",notes = "新增之后返回对象")
    @ApiImplicitParam(name="user",value = "用户对象")
    public User register(User user){
        User addUserSuccess = null;
        try {
            addUserSuccess = userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  addUserSuccess;
    }

    /**
     * 登陆
     * @param account
     * @param password
     * @return
     */
    @PostMapping("/login/{account}/{password}")
    @ApiOperation(value="验证一个用户",notes = "验证后返回对象")
    @ApiImplicitParams({
            @ApiImplicitParam(name="account",value="账号",required=true,paramType ="path"),
            @ApiImplicitParam(name="password",value="密码",required=true,paramType ="path")
    })
    public User login(@PathVariable String account, @PathVariable String password){
        System.out.println(account);
        System.out.println(password);
        User loginUser = null;
        try {
            loginUser = userService.selectUserByAccountAndPassword(account, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  loginUser;
    }

    /**
     * 更新个人信息
     * @param user
     * @return
     */
    @PostMapping("/updateUser")
    @ApiOperation(value="修改当前登陆的用户的信息")
    @ApiImplicitParam(name="user",value = "修改登陆用户信息的实体对象")
    public User UpdateUser(User user){
        User updateUser = userService.updateUser(user);
        return updateUser;
    }
}
