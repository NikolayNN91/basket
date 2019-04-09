package com.example.demo.Interceptor;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.demo.Entity.Account;
import com.example.demo.Service.AccountManager;

public class AuthInterceptor implements HandlerInterceptor {
	
	@Autowired
	private AccountManager accountManager;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		Account currentAccount = accountManager.getAccount();
		if(Objects.isNull(currentAccount)) {
			response.sendRedirect("/authorization");
			return false;
		}
		return true;
	}

}

