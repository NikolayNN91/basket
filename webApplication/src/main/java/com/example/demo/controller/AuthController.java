package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AuthController {

	
	@GetMapping("/authorization")
	public ModelAndView getAuthorizathionPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("authorization");
		return modelAndView;
	}
	
	@GetMapping("/logout")
	public ModelAndView loguot(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("authorization");
		
		request.getSession().invalidate();
		
		return modelAndView;
	}
	
	@GetMapping("/home")
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home-page");
		return modelAndView;
	}
	
	@GetMapping("/admin")
	public ModelAndView getAdminPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin-page");
		return modelAndView;
	}

}
