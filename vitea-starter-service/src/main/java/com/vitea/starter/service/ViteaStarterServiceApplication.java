package com.vitea.starter.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.vitea.starter.dao.mapper")
public class ViteaStarterServiceApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(ViteaStarterServiceApplication.class, args);
}
}
