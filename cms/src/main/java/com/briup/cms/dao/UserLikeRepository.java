package com.briup.cms.dao;

import com.briup.cms.bean.User;
import com.briup.cms.bean.UserLike;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LPF
 * @create 2019/11/25 13:07
 */
public interface UserLikeRepository extends JpaRepository<UserLike,Integer> {
}
