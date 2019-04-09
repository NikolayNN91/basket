package com.example.demo.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Account;
import com.example.demo.Service.AccountManager;

public class UserNameAwareInterceptor implements HandlerInterceptor {

    @Autowired
    private AccountManager accountManager;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        Account currentAccount = accountManager.getAccount();

//        modelAndView.addObject("userName", currentUser.getLogin());
//        modelAndView.addObject("currentUserRole", currentUser.getRole());
    }

}
