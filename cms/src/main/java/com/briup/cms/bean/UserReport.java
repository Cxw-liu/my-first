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
 * 举报信息表
 */
@Data
@Entity
@Table(name="user_report")
public class UserReport implements Serializable {
	//举报记录id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	//举报时间
	private Date report_date;
	//举报类型
	private String report_type;
	//举报信息内容
	private String report_content;
	//举报处理状态1：已举报未处理，2,3,4,5,6：第(n-1次)举报已处理，即>1就表示已经处理了
	private int state;
	//处理时间
	private Date process_date;
	//处理内容
	private String process_content;
	/*
	 * //收藏用户的id private int user_id; //收藏资讯的id private int article_id;
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
