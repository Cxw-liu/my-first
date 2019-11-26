package com.briup.cms.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;
/**
 * @author LPF
 * @create 2019/11/24 23:35
 */
/*
 * 点赞信息表
 */
@Data
@Entity
@Table(name="user_like")
public class UserLike implements Serializable {
	//点赞记录ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	//点赞时间
	private Date like_date;
	//点赞状态，1-以点赞，2-点赞后取消
	private int state;
	/**
	 * //点赞用户ID private int user_id; //点赞资讯ID private int article_id;
	 */
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
