package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerController {

	
	@InitBinder
	private void initBinder(WebDataBinder dataBinding) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinding.registerCustomEditor(String.class, ste);
	}
	
	
	@RequestMapping("/showCustomer")
	private String showCustomer(Model theModel) {
		theModel.addAttribute(new Customer());
		return "customer-form";
	}
	
	
	@RequestMapping("/confirmCustomer")
	private String confirmCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult br ) {
		
		System.out.println(br);
		
		System.out.println("\n\n\n");
		
		if (br.hasErrors()) {
			return "customer-form";
		}
		else {
			return "confirm-customer";
		}
	}
}
