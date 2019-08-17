package com.vitea.starter.dto;


import lombok.Data;
/**
 * json数据返回封装类
 * @author liushahe
 * 200 成功
 * 201 失败
 * 202 出现异常
 */
@Data
public class JsonResult {
	private int code;
	private String msg;
	private Object data;
}
