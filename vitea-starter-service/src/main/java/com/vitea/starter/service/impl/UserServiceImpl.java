package com.vitea.starter.service.impl;

import java.util.List;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.vitea.starter.api.user.UserService;
import com.vitea.starter.dao.mapper.UserMapper;
import com.vitea.starter.model.User;
@Service(version="1.0.0")
public class UserServiceImpl  implements UserService {
	@Autowired
    private UserMapper userMapper;
	@Override
	public String login(String username, String password) {
		return "hello login success";
	}
	@Override
	public int saveUser(User user) {
		User u=userMapper.selectById(1);
		System.out.println(u.toString());
		return 0;
	}
	@Override
	public int updateUser(User user) {
		return userMapper.insert(user);
	}
	@Override
	public int deleteUserById(Long id) {
		return userMapper.deleteById(id);
	}
	//@Override
	//public List<User> selectAllUser() {
	//	return userMapper.selectUser();
	//}
	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
