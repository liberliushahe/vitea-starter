/*******************************************************************************
 * Copyright (C) 2019 liushahe
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.vitea.starter.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * swagger配置类
 * @author liushahe
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig{
    @Bean
    public Docket createUserRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
     .apiInfo(ApiInfo())
     .groupName("用户管理")
     .select()
     .apis(RequestHandlerSelectors.basePackage("com.vitea.starter.controller.user"))
     .paths(PathSelectors.any())
     .build();
    } 
    @Bean
    public Docket createSystemRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
     .apiInfo(ApiInfo())
     .groupName("系统管理")
     .select()
     .apis(RequestHandlerSelectors.basePackage("com.vitea.starter.controller.system"))
     .paths(PathSelectors.any())
     .build();
    } 
    private ApiInfo ApiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")
                .description("接口文档")
                .version("1.0.0")
                .termsOfServiceUrl("")
                .license("liushahe")
                .licenseUrl("http://www.viteastarter.com")
                .build();
    }

}
