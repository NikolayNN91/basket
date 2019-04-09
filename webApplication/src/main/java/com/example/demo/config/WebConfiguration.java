package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.interceptor.AuthInterceptor;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	
	@Bean
	public AuthInterceptor authInterceptor() {
		System.out.println("Config");
		return new AuthInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("Config2");
		registry.addInterceptor(authInterceptor()).addPathPatterns("/**").excludePathPatterns("/authorization", "/home", "/registration", "/admin", "/css/**");
		System.out.println("Config3");
	}

}
