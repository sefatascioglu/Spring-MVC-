package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	public String [] theCourseCode;

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		theCourseCode = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String theCourseCodeOther, ConstraintValidatorContext theCourseCodeConstraint) {
		if (theCourseCodeOther != null) {
			for (String string : theCourseCode) {
				boolean result = theCourseCodeOther.startsWith(string);
				if (result) {
					return true;
				}
			}
		}
		return false;
	}

}
