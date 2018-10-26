package com.cq.springboot.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author: 陈强
 * @Date: 2018/10/26 15:38
 * @Version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfigure {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cq.springboot.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfo("Spring Boot API接口说明", "接口文档，不懂请教chenqiang718@sina.com", "1.0", "https://github.com/chenqiang718", "程序猿CQ And WL", "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
    }
}
