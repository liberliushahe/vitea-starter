package com.vitea.starter.service.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vitea.starter.dao.mapper.UserMapper;
import com.vitea.starter.model.User;
@RunWith(SpringRunner.class)   
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
    private UserMapper userMapper;
	@Test
	public void insert() {
		User u=new User(1L,"1","333");
		userMapper.insert(u);
		//userMapper.updateById(u);
	}
	@Test
	public void selectUserById() {
		User user=userMapper.selectById(1);
		System.out.println(user.toString());
		List<User> userList = userMapper.selectList(null);
		System.out.println(userList.size());

	}
   
}
