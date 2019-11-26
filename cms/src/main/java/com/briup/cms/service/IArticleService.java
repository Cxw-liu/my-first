package com.briup.cms.service;

import com.briup.cms.bean.Article;

import java.util.List;

/**
 * @author LPF
 * @create 2019/11/26 16:39
 */
public interface IArticleService {
    /**
     * 通过用户的id查找该用户下所有的资讯
     * @param user_id
     * @return
     */
    public List<Article> selectArticleByUser_id(Integer user_id);
}
