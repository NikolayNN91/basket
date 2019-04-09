package com.example.demo.Config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
public class DataSourseConfig {
	
	@Resource
	private Environment environment;
	
	@Bean
	public DataSource dataSource() {
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(environment.getRequiredProperty("spring.datasource.driver-class-name"));
		driverManagerDataSource.setUrl(environment.getRequiredProperty("spring.datasource.url"));
		driverManagerDataSource.setUsername(environment.getRequiredProperty("spring.datasource.username"));
		driverManagerDataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));
		return driverManagerDataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		 return jdbcTemplate;	
	}
}
