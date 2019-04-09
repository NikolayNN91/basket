package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.Interceptor.AdminInterceptor;
import com.example.demo.Interceptor.AuthInterceptor;
import com.example.demo.Interceptor.UserNameAwareInterceptor;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	
	@Bean
	public AuthInterceptor authInterceptor() {
		return new AuthInterceptor();
		
	}
	
	@Bean
	public AdminInterceptor adminInterceptor() {
		return new AdminInterceptor();
		
	}
	
	@Bean
	public UserNameAwareInterceptor userNameAwareInterceptor() {
		return new UserNameAwareInterceptor();
		
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authInterceptor()).addPathPatterns("/**").excludePathPatterns("/authorization", "/logout", "/registration", "/accessDenied", "/error-page",  "/css/**");
		registry.addInterceptor(adminInterceptor()).addPathPatterns("/**").excludePathPatterns("/home", "/authorization", "/logout", "/registration", "/accessDenied", "/error-page",  "/css/**");
		registry.addInterceptor(userNameAwareInterceptor()).addPathPatterns("/**").excludePathPatterns("/authorization", "/logout", "/registration", "/accessDenied", "/error-page",  "/css/**");
	}

}
