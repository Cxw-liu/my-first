package com.briup.cms.bean;
/*
 * 资讯
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
/**
 * @author LPF
 * @create 2019/11/24 23:35
 */
@Data
@Entity
public class Article implements Serializable {
	/**
	资讯编号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	/**
	 * 资讯标题
	 */
	private String title;
	/**
	 * 摘要
	 */
	private String summary;
	/**
	资讯内容，数据量较大
	 */
	private String content;
	/**
	 * 发布日期
	 */
	private Date releaseDate;
	/**
	 * 	阅读量
	 */
	private int clickTimes;
	/**
	 * 背景音乐地址
	 */
	private String backgroundMusicUrl;
	/**
	封面图片地址，地址以逗号隔开，最多三个
	 */
	private String pictureUrls;
	/**
	 * 	视频地址
	 */
	private String videoUrl;
	/**
	资讯类型，0-图文资讯。1-视频资讯。
	 */
	private int type;
	/**
	 * 资讯状态，0:未审核，1:已审核通过，2:审核不通过，3:被举报后审核为不通过，4:已删除
	 */
	private int state;
	/**
	 * 多的一方，维护方
	 * 发布用户ID private int user_id;
	 * 栏目ID private int category_id;
	 */
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER)//设置了级联增/改/刷新
	@JoinColumn(name="user_id")
    private User userArticle;
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER)//设置了级联增/改/刷新
	@JoinColumn(name="category_id")
	private Article category;

	/**
	 * 点赞，收藏，举报   1---1

	@OneToOne
	private UserLike userlike;
	@OneToOne
	private UserCollection userCollection;
	@OneToOne
	private UserReport userReport;
	 */
}
