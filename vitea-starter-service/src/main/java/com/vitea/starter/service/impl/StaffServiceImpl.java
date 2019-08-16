package com.vitea.starter.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vitea.starter.api.StaffService;
import com.vitea.starter.dao.mapper.StaffMapper;
import com.vitea.starter.model.Staff;
@Service(version="1.0.0")
public class StaffServiceImpl extends ServiceImpl<StaffMapper,Staff>  implements StaffService {
	@Autowired
    private StaffMapper userMapper;
	@Override
	public String login(String username, String password) {
		userMapper.login();
		return "hello login success";
	}
}
