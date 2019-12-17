package com.shanghai.unicom.micro.smartcrud.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //此为 controller 的包路径
                .apis(RequestHandlerSelectors.basePackage("com.shanghai.unicom.micro.smartcrud.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("smartcrud API 文档")
//                .contact(new Contact("jianweipeng","http://www.baidu.com",""))
//                .description("smartcrud API 网关接口，http://localhost:18080")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();
    }
}