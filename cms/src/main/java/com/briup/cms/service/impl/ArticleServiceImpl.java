package com.briup.cms.service.impl;

import com.briup.cms.bean.Article;
import com.briup.cms.dao.ArticleRepository;
import com.briup.cms.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LPF
 * @create 2019/11/26 16:44
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private ArticleRepository dao;
    @Override
    public List<Article> selectArticleByUser_id(Integer user_id) {
        return dao.findAllByUserArticle_Id(user_id);
    }
}
