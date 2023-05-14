package com.example.contactmanagement.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api()
	{
		return new Docket(DocumentationType.SWAGGER_2)
					.apiInfo(getInfo())
					.select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
					.build();
	}

	private ApiInfo getInfo() {
		// TODO Auto-generated method stub
		return new ApiInfo("Contact Manager", "Simple Contact Manager which Manages the Contacts", "1.0", "Terms of Service", new Contact("Saurabh Mishra", "https://www.linkedin.com/in/saurabh751/", "abcsaurabhxyz3@gmail.com"), "Licenses of API", "API License URL",Collections.emptyList());
	}
	
	
	
}
