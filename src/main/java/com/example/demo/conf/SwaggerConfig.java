package com.example.demo.conf;

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
 * @Api：修饰整个类，描述Controller的作用

 @ApiOperation：描述一个类的一个方法，或者说一个接口

 @ApiParam：单个参数描述

 @ApiModel：用对象来接收参数

 @ApiProperty：用对象接收参数时，描述对象的一个字段
 */

@Configuration

public class SwaggerConfig {
@Bean
public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.modules.sys.controller"))
                .paths(PathSelectors.any())
                .build();
}


private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
            .title("新后台管理系统")
            .description("RESTful APIs")
            .termsOfServiceUrl("https://gitee.com/qinjianping")
            .version("1.0")
            .build();
    }
}

