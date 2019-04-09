package com.example.demo.interceptor;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.demo.dto.User;
import com.example.demo.service.UserManager;

public class AuthInterceptor implements HandlerInterceptor {
	
	@Autowired
	private UserManager userManager;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		User currentUser = userManager.getUser();
		if(Objects.isNull(currentUser)) {
			response.sendRedirect("/authorization");
			return false;
		}
		return true;
	}

}

