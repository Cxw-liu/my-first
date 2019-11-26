package com.briup.cms.bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
/*
 * 用户表
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @author LPF
 * @create 2019/11/24 23:35
 */

@Data
@Entity
@ApiModel(description="用户对象模型")
public class User implements Serializable {
	//户的id,主键，自动增加。
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(value="用户的id")
	private Integer id;
	//用户的昵称
	@ApiModelProperty(value="用户的昵称")
	private String nickname;
	//登录账号
	@ApiModelProperty(value="登陆账号")
	private String account;
	//登录密码
	@ApiModelProperty(value="登陆密码")
	private String password;
	@ApiModelProperty(value="用户角色，0代表管理员，1代表普通用户")
	//用户角色，0代表管理员，1代表普通用户
	private String role;
	//用户头像的url
	@ApiModelProperty(value="用户头像的url")
	private String image;
	/**
	 *	一的一方,被维护方,和资讯表一对多的关系
	 */
    @OneToMany(mappedBy = "userArticle",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Article> articleList = new ArrayList<Article>();
	/**
	 * 点赞，收藏，举报   1---1
	 *

	@OneToOne
	private UserLike userlike;
	@OneToOne
	private UserCollection userCollection;
	@OneToOne
	private UserReport userReport;
*/
}
