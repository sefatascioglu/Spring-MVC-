package com.luv2code.springdemo.mvc;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	
	private Map<String, String> countryOptionPairList;
	
	private String favoriteLanguages;
	
	private String[] operatingSystem;
	
	private Map<String, String> osList;
	
	
	public Student() {
		radioButtonList = new HashMap<>();
		
		osList = new HashMap<>();
		
		radioButtonList.put("Java", "Java");
		
		osList.put("Windows", "Windows");
		osList.put("Linux", "Linux");
		osList.put("Debian", "Debian");
		
	}

	
	
	public Map<String, String> getOsList() {
		return osList;
	}



	public void setOsList(Map<String, String> osList) {
		this.osList = osList;
	}


	private Map<String, String> radioButtonList;
	
	
	
	public Map<String, String> getRadioButtonList() {
		return radioButtonList;
	}


	public void setRadioButtonList(Map<String, String> radioButtonList) {
		this.radioButtonList = radioButtonList;
	}


	public String getFavoriteLanguages() {
		return favoriteLanguages;
	}


	public void setFavoriteLanguages(String favoriteLanguages) {
		this.favoriteLanguages = favoriteLanguages;
	}



	public Map<String, String> getCountryOptionPairList() {
		return countryOptionPairList;
	}


	public void setCountryOptionPairList(Map<String, String> countryOptionPairList) {
		this.countryOptionPairList = countryOptionPairList;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
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



	public String[] getOperatingSystem() {
		return operatingSystem;
	}



	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	
	
	

}
