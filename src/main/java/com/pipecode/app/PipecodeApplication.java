package com.pipecode.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.pipecode.swagger.SwaggerConfig;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


@SpringBootApplication
@ComponentScan(basePackages = {"hello","com.pipecode.controller", "com.pipecode.services", "com.pipecode.repository"})
@EntityScan("com.pipecode.model")
@EnableJpaRepositories("com.pipecode.repository")
@Import(SwaggerConfig.class)
public class PipecodeApplication implements WebMvcConfigurer {

	private static Logger LOG = LoggerFactory.getLogger(PipecodeApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PipecodeApplication.class, args);
		LOG.info("Aplicación CRUD de Productos");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("swagger-ui.html")
		.addResourceLocations("classpath:/META-INF/resources/");

	}

}
