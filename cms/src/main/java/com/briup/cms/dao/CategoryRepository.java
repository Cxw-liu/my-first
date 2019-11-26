package com.briup.cms.dao;

import com.briup.cms.bean.Article;
import com.briup.cms.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LPF
 * @create 2019/11/25 13:07
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
