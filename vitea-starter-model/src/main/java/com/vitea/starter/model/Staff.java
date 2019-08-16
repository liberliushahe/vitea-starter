package com.vitea.starter.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户实体
 * 
 * @author liushahe
 *
 */
@Data
@TableName(value = "vitea_system_user")
public class User extends Model<User>{

	private static final long serialVersionUID = -1684023110161814082L;
	public User() {
		
	}
	public User(Long id,String username,String password) {};
	@TableId(value ="id",type = IdType.AUTO)//指定自增策略
	private Long id;
	/**
	 * 用户名
	 */
    //@TableField(value="username")
	private String username;
	/**
	 * 密码
	 */
    //@TableField(value ="password")
	private String password;
	

}
