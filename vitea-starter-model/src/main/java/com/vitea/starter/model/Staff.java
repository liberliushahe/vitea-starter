package com.vitea.starter.model;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户实体
 * 
 * @author liushahe
 *
 */
@Data
@TableName(value = "vitea_system_staff")
@ApiModel(value="Staff对象", description="")
public class Staff implements Serializable{

	private static final long serialVersionUID = -1684023110161814082L;
	public Staff() {
		
	}
	public Staff(Long id,String username,String password) {};
	@TableId(value ="id",type = IdType.AUTO)//指定自增策略
    @ApiModelProperty(value = "唯一标识，主键")
	private Long id;
	/**
	 * 用户名
	 */
    @TableField(value="username")
    @ApiModelProperty(value = "用户名")
	private String username;
	/**
	 * 密码
	 */
    @TableField(value ="password")
    @ApiModelProperty(value = "密码")
	private String password;
    
    @ApiModelProperty(value = "是否逻辑删除（true：删除；false：正常（默认））")
    @TableLogic
    private Boolean isDelete;
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
	
   
}
