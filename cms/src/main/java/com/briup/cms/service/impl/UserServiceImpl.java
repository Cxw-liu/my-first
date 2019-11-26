package com.briup.cms.service.impl;

import com.briup.cms.bean.User;
import com.briup.cms.dao.UserRepository;
import com.briup.cms.service.IUserService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author LPF
 * @create 2019/11/25 13:19
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository dao;
    @Override
    public User addUser(User user) throws Exception {
       /*
       保证新添加的用户唯一
        */
        User addUserSuccess=null;
        //1.通过新添加用户的用户名称查找用户。
        User UserByAccount = dao.findByAccount(user.getNickname());
        //2.做判断
        if (UserByAccount==null){
            addUserSuccess = dao.save(user);
        }else {
            /*
            其他的验证会在前端进行验证。
             */
            throw new Exception("用户已存在！");
        }

        return addUserSuccess;
    }

    @Override
    public User deleteUser() {
        return null;
    }

    @Override
    public User updateUser(User user) {
        User updateUser = dao.save(user);
        return updateUser;
    }

    @Override
    public User selectUserByAccountAndPassword(String account, String password) throws Exception {
        User UserByNicknameAndPassword = dao.findByAccountAndPassword(account, password);
        if (UserByNicknameAndPassword==null){
            throw new Exception("用户不存在或密码错误！");
        }
        return UserByNicknameAndPassword;
    }
}
