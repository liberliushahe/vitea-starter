package com.vitea.starter.api;

import com.baomidou.mybatisplus.extension.service.IService;
import com.vitea.starter.model.Staff;

/**
 * 用户操作接口
 * @author liushahe
 *
 */
public interface StaffService extends IService<Staff>{
	
	/**
	 * 登录方法
	 * @param username
	 * @param password
	 * @return
	 */
	String login(String username,String password);


}
