package com.vitea.starter.controller.staff;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.vitea.starter.api.StaffService;
import com.vitea.starter.model.Staff;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "/user", tags = "用户管理")
@RestController
@RequestMapping("/api")
public class StaffController {

	@Reference(version = "1.0.0")
	private StaffService userService;

	@ApiOperation(value = "获取用户信息", notes = "通过请求参数获取客户信息", response = JSONObject.class)
	@RequestMapping(value = "/v1/user/get", method = { RequestMethod.GET })
	public String userInfo() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}

	@ApiOperation(value = "用户登录", notes = "通过请求参数登录系统", response = JSONObject.class)
	@RequestMapping(value = "/v1/user/login", method = { RequestMethod.GET })
	public String userLogin() {
		//String s = userService.login("222", "22");
		//System.out.println(s);
		Staff st=userService.getById(3);
		return st.toString();
	}
	@ApiOperation(value = "保存用户", notes = "通过请求参数保存用户", response = JSONObject.class)
	@RequestMapping(value = "/v1/user/save", method = { RequestMethod.GET })
	public String saveUser() {
		Staff user=new Staff(1L,"we","hello");
		boolean s = userService.save(user);
		
		return "保存用户"+s;
	}
	@ApiOperation(value = "修改用户", notes = "通过请求参数修改用户", response = JSONObject.class)
	@RequestMapping(value = "/v1/user/update", method = { RequestMethod.GET })
	public String updateUser(Staff user) {
		Staff user1=new Staff(1L,"we","hello");
		boolean s = userService.updateById(user1);
		return "修改用户"+s;
	}

}
