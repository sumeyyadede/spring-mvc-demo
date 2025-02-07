package com.sumeyyadede.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
    @Value("#{countryOptions}") 
    private Map<String, String> countryOptions;
    
    @Value("#{favoriteLanguageOptions}") 
    private Map<String, String> favoriteLanguageOptions; 

    @Value("#{operatingSystemsOptions}") 
    private Map<String, String> operatingSystemsOptions; 
    
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a student object
		Student theStudent = new Student();
		
		// add student object to the model
		theModel.addAttribute("student", theStudent);
		
		// add the country options to the model 
	    theModel.addAttribute("theCountryOptions", countryOptions);
	    
	    // add the country options to the model 
	    theModel.addAttribute("theFavoriteLanguageOptions", favoriteLanguageOptions);
	   
	    // add the country options to the model 
	    theModel.addAttribute("theOperatingSystemsOptions", operatingSystemsOptions);		
		
	    return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		
		// log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName() + " " + theStudent.getOperatingSystems());
		
		return "student-confirmation";
	}
	
}
