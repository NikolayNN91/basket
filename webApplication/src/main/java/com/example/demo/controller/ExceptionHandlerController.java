package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.exception.NotFoundException;

@ControllerAdvice
public class ExceptionHandlerController {
	
	@ExceptionHandler(NotFoundException.class)
	public ModelAndView handleException(NotFoundException ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error-page");
		modelAndView.addObject("error", ex.getMessage());
		return modelAndView;
	}
	
	
	

}
