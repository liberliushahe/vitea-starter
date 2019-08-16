package com.vitea.starter.service.staff;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vitea.starter.dao.mapper.StaffMapper;
import com.vitea.starter.model.Staff;
@RunWith(SpringRunner.class)   
@SpringBootTest
public class StaffServiceTest {
	
	@Autowired
    private StaffMapper userMapper;
	@Test
	public void insert() {
		Staff staff=new Staff();
		staff.setUsername("ligang");
		//userMapper.deleteById(1);
		userMapper.insert(staff);
		//userMapper.updateById(u);
	}
	@Test
	public void selectUserById() {
//		User user=userMapper.selectById(1);
//		System.out.println(user.toString());
//		List<User> userList = userMapper.selectList(null);
//		System.out.println(userList.size());

	}
   
}
