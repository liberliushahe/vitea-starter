package com.vitea.starter.config.nacos;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
//自动注册服务
//@Configuration
public class NacosRegisterConfiguration {

	@Value("${server.port}")
	private int serverPort;

	@Value("${spring.application.name}")
	private String applicationName;

	@NacosInjected
	private NamingService namingService;

	@PostConstruct
	public void registerInstance() throws NacosException {
		namingService.registerInstance(applicationName, "127.0.0.1", serverPort, "DEFAULT");
	}
}

