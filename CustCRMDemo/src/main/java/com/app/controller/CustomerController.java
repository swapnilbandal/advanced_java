package com.app.controller;
import com.app.entity.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomer(Model theModel) {
		List<Customer> theCustomers = customerService.getCustomers();
		theModel.addAttribute("customers",theCustomers);
		return "listCustomer";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		Customer theCustomer=new Customer();
		model.addAttribute("customer",theCustomer);
		return "customerForm";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
		
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model theModel) {
		Customer theCustomer=customerService.getCustomers(theId);
		theModel.addAttribute("customer",theCustomer);
		return "customerForm";
	}

}
