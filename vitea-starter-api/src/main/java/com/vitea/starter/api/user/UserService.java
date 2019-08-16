package com.vitea.starter.api.user;

import java.util.List;

import com.vitea.starter.model.User;

/**
 * 用户操作接口
 * @author liushahe
 *
 */
public interface UserService{
	
	/**
	 * 登录方法
	 * @param username
	 * @param password
	 * @return
	 */
	String login(String username,String password);
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	int saveUser(User user);
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	int deleteUserById(Long id);
	/**
	 * 查询用户
	 * @return
	 */
	List<User> selectAllUser();

}
