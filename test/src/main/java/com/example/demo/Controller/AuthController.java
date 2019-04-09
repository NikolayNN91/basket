package com.example.demo.Controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.AccountDAO;
import com.example.demo.DAO.RoomDAO;
import com.example.demo.Entity.Account;
import com.example.demo.Entity.Customer;
import com.example.demo.Service.AccountManager;
import com.example.demo.Service.Service;


@Controller
public class AuthController {
	
	@Autowired
	AccountDAO accountDAO;
	
	@Autowired
	RoomDAO roomDAO;
	
	@Autowired
	Service service;
	
	@Autowired
	AccountManager accountManager;

	
	@GetMapping("/authorization")
	public ModelAndView getAuthorizathionPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("authorization");
		return modelAndView;
	}
	
	@GetMapping("/logout")
	public ModelAndView loguot(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/authorization");
		
		request.getSession().invalidate();
		
		return modelAndView;
	}
	
	
	
	@GetMapping("/accessDenied")
	public ModelAndView accessDenied() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("error-page");
		modelAndView.addObject("error", "В доступе отказано!");
		return modelAndView;
	}
	
	@GetMapping("/registration")
	public ModelAndView getRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
	@PostMapping("/registration")
	public ModelAndView registrationUser(@Validated Account account, Customer customer, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			modelAndView.addObject("error", result.getAllErrors());
		} else {
			service.addUser(account, customer);
			modelAndView.setViewName("redirect:/authorization");
				
		}
		return modelAndView;
	}
			
	@PostMapping("/authorization")
	public ModelAndView getPage(@ModelAttribute(value="login") String login, @ModelAttribute(value="password") String password) {
		
		ModelAndView modelAndView = new ModelAndView();
		Account account = accountDAO.getAccountByLogin(login);		
		
		if(!Objects.isNull(account)) {
			if(Objects.equals(account.getPassword(), password)) {
				
				accountManager.setAccount(account);
				if(account.isAdmin()==1) {
					modelAndView.setViewName("redirect:/admin");
				} else {
					modelAndView.setViewName("redirect:/home");
				}
				
			} else {
				modelAndView.addObject("error", "Неверный логин или пароль!");
				modelAndView.setViewName("/authorization");
			}
				
		} else {
			modelAndView.addObject("error", "Пользователя с таким логином не существует!");
			modelAndView.setViewName("/authorization");
		}


		return modelAndView;
	}

}
