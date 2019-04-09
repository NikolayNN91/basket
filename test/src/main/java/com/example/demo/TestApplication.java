package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.Interface.ServiceInterface;

	
	@SpringBootApplication
	public class TestApplication {
		

		public static void main(String[] args) {
			/*ServiceInterface service = */SpringApplication.run(TestApplication.class, args);/*.getBean(ServiceInterface.class);

			service.service();*/
	
			
		}
	}
