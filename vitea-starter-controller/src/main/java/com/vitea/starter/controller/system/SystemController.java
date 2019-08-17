package com.vitea.starter.controller.system;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.vitea.starter.api.SystemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "/system", tags = "系统管理")
@RestController
@RequestMapping("/api")
public class SystemController {

	@Reference(version = "1.0.0")
	private SystemService systemService;

	@ApiOperation(value = "获取系统信息", notes = "通过请求参数获取客户信息", response = JSONObject.class)
	@RequestMapping(value = "/v1/system/get", method = { RequestMethod.GET })
	public String userInfo() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}

	@ApiOperation(value = "增加字典", notes = "通过参数增加字典", response = JSONObject.class)
	@RequestMapping(value = "/v1/dictionary/save", method = { RequestMethod.POST })
	public String saveDictionary() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}
	@ApiOperation(value = "修改字典", notes = "通过参数增加字典", response = JSONObject.class)
	@RequestMapping(value = "/v1/dictionary/modify", method = { RequestMethod.POST })
	public String modifyDictionary() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}
	@ApiOperation(value = "删除字典", notes = "通过参数删除字典(逻辑删除)", response = JSONObject.class)
	@RequestMapping(value = "/v1/dictionary/delete", method = { RequestMethod.POST })
	public String addDictionary() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}

	@ApiOperation(value = "增加菜单", notes = "通过参数增加菜单", response = JSONObject.class)
	@RequestMapping(value = "/v1/menu/add", method = { RequestMethod.POST })
	public String addMenu() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}
	@ApiOperation(value = "修改菜单", notes = "通过参数增加菜单", response = JSONObject.class)
	@RequestMapping(value = "/v1/menu/modify", method = { RequestMethod.POST })
	public String modifyMenu() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}
	@ApiOperation(value = "删除菜单", notes = "通过参数增加菜单", response = JSONObject.class)
	@RequestMapping(value = "/v1/menu/delete", method = { RequestMethod.GET })
	public String deleteMenu() {
		JSONObject object = new JSONObject();
		object.put("id", "20180081");
		object.put("name", "liushahe");
		object.put("age", "23");
		object.put("address", "china");
		object.put("card", "6020201010201202X");
		return object.toJSONString();
	}
}
