package com.briup.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LPF
 * @create 2019/11/24 23:55
 */
@Configuration
@EnableSwagger2
public class Swagger {
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.briup.cms.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     * @return
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("看点资讯管理")
                .description("用restful风格写接口")
                .termsOfServiceUrl("http://www.baidu.com")
                .version("1.0")
                .build();
    }
}
