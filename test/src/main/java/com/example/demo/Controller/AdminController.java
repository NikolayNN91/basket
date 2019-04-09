package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.CustomerDAO;
import com.example.demo.DAO.RoomDAO;
import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Room;

@Controller
public class AdminController {
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	RoomDAO roomDAO;

	@GetMapping("/admin/customers")
	public ModelAndView getCustomerList() {
		
		List<Customer> customers = customerDAO.getAllCustomers();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/customers-list");
		modelAndView.addObject("customers", customers);
		
		return modelAndView;
	}
	
	@GetMapping("/admin")
	public ModelAndView getAdminPage() {
	
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/admin-page");		
		return modelAndView;
	}
	
	@GetMapping("/admin/rooms")
	public ModelAndView getRoomList() {
		
		List<Room> rooms = roomDAO.getAllRooms();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/rooms-list");
		modelAndView.addObject("rooms", rooms);
		
		return modelAndView;
	}
}
