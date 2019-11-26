package com.briup.cms.service;

import com.briup.cms.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author LPF
 * @create 2019/11/25 13:13
 */
@Service
public interface IUserService {
    /**
     *添加用户
     * @param user
     * @return User
     */
    User addUser(User user) throws Exception;

    /**
     * 删除用户
     * @return User
     */
    User deleteUser();

    /**
     * 更新用户
     * @param user
     * @return User
     */
    User updateUser(User user);

    /**
     * 通过用户的账号和密码查找用户。
     * @param account
     * @param password
     * @return
     * @throws Exception
     */
    User selectUserByAccountAndPassword(String account,String password) throws Exception;
}
