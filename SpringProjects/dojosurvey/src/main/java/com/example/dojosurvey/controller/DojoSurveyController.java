package com.example.dojosurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DojoSurveyController {
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String results(
			@RequestParam("name") String name, 
			@RequestParam("location") String location, 
			@RequestParam("language") String language,
			@RequestParam(value="comment", required=false) String comment,
			Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "results";
	}
}
