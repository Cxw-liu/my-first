package com.briup.cms.bean;
/*
 * 收藏信息表
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;
/**
 * @author LPF
 * @create 2019/11/24 23:35
 */
@Data
@Entity
@Table(name="user_collection")
public class UserCollection implements Serializable {
	//收藏记录Id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	//收藏时间
	private Date collection_date;
	//收藏状态  1-已收藏，2-收藏后取消
	private int state;
	/**
	 * 收藏用户id private int user_id; //收藏资讯id private int article_id;
	 */
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne
	@JoinColumn(name="category_id")
	private Category category;
}
