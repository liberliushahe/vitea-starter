package com.vitea.starter.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vitea.starter.model.Staff;

public interface StaffMapper extends BaseMapper<Staff> {
	
	public boolean login();

}