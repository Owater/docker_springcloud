package com.owater;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
public class ServiceAApplication {

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.owater"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder().title("Spring Boot Sample REST APIs")
				.description("The APIs here demonstrate creating a service built with Spring Boot")
				.license("MIT")
				.licenseUrl("http://opensource.org/licenses/MIT")
				.contact(new Contact("Owater", "http://githu.com/Owater", "1006340261@qq.com"))
				.version("1.0")
				.build();

		return apiInfo;
	}

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
}
