package com.briup.cms.dao;

import com.briup.cms.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author LPF
 * @create 2019/11/25 13:07
 */
public interface ArticleRepository extends JpaRepository<Article,Integer> {
    /**
     * 通过用户的id查询该用户所有的资讯
     * @param id
     * @return
     */
    public List<Article> findAllByUserArticle_Id(Integer id);
}
