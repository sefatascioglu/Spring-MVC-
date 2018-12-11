package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	
	@NotNull(message = "*")
	@Size(min=1, message="*")
	private String firstName;

	
	private String lastName;
	
	
	@Min(value = 0)
	@Max(value = 10)
	@NotNull(message = "* ")
	private Integer freePass;
	
	
	@Pattern(regexp = "(^[a-zA-Z0-9]{5})")
	private String postalCode;
	
	
	@CourseCode(value = {"LUV", "BIL"} , message = "must stast with LUV or BIL")
	private String courseCode;

	
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getFreePass() {
		return freePass;
	}

	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
