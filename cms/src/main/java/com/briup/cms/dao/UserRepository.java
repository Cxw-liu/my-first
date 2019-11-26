package com.briup.cms.dao;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LPF
 * @create 2019/11/25 13:07
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    /**
     * 通过用户的账户名查找用户。
     * @param account
     * @return
     */
    User findByAccount(String account);

    /**
     * 通过账号和密码查询用户
     * @param account
     * @param password
     * @return
     */
    User findByAccountAndPassword(String account,String password);
}
