package com.briup.cms.bean;

import javax.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LPF
 * @create 2019/11/24 23:35
 */
/*
 * 栏目
 */
@Data
@Entity
public class Category implements Serializable {
	//栏目Id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//栏目的名称 
	private String name;
	//栏目描述信息
	private String description;
	//父栏目ID
	private int parent_id;
	/**
	 * 一方，被维护方。对应多个资讯
	 */
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
	private List<Article> articleList=new ArrayList<>();
}
