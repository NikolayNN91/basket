package com.example.demo.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Exception.NotFoundException;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NotFoundException.class)
	public ModelAndView handleNotFoundException(NotFoundException ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error-page");
		modelAndView.addObject("error", ex.getMessage());
		return modelAndView;
	}	
	
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error-page");
		modelAndView.addObject("error", "Что-то пошло не так, обратитесь в службу технической поддержки.");
		modelAndView.addObject("stackTrace", ex.getMessage());
		return modelAndView;
	}
	


}
