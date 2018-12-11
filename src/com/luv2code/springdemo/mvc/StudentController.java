package com.luv2code.springdemo.mvc;

import java.util.Map;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	

	@RequestMapping("/showFormStudent")
	public String showFormStudent(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		theModel.addAttribute("options", countryOptions);
		// theModel.addAttribute("countryPairList",student.getCountryOptionPairList());
		return "student-form";
	}

	@RequestMapping("/confirmeStudent")
	public String confirmedStudent(@ModelAttribute("student") Student student) {

		return "confirmedStudent";

	}

}
