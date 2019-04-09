package com.example.demo.Controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.RoomClassDAO;
import com.example.demo.DAO.RoomDAO;
import com.example.demo.Entity.Room;
import com.example.demo.Service.AccountManager;
import com.example.demo.Service.Service;

@Controller
public class HomeController {
	
	@Autowired
	AccountManager accountManager;
	
	@Autowired
	RoomClassDAO roomClassDAO;
	
	@Autowired
	Service service;
	
	@Autowired
	RoomDAO roomDAO;
	
	@GetMapping("/home")
	public ModelAndView getHomePage() {
		ModelAndView modelAndView = new ModelAndView();
		
		List<Room> rooms = roomDAO.getAllRooms();
		
		modelAndView.setViewName("home-page");
		modelAndView.addObject("helloPhrase", "Здравствуйте, ");
		modelAndView.addObject("userName", service.getUserNameByAccount(accountManager.getAccount()));
		modelAndView.addObject("rooms", rooms);
		return modelAndView;
	}
	
	@PostMapping("/home")
	public ModelAndView homeRequest(@ModelAttribute(value="roomClass") String roomClass, @ModelAttribute(value="numberOfSeats") int numberOfSeats, @ModelAttribute(value="price") int price) {
		ModelAndView modelAndView = new ModelAndView();
		if(Objects.isNull(roomClassDAO.getRoomClass(roomClass))&&roomClass==roomClassDAO.getRoomClass(roomClass)) {
			modelAndView.addObject("roomClass", roomClass);
		} else {
			modelAndView.addObject("error", "По вашему запросу нет свободных комнат");			
	}
		return modelAndView;
}}
