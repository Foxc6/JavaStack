package com.example.hellohuman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloHumanController {
	@RequestMapping("/")
	public String home(Model model, @RequestParam(value="name", required=false) String searchQuery) {
		String name;
		if(searchQuery == null) {
			name = "Human";
		} else {
			name = searchQuery;
		}
		System.out.println(searchQuery);
		model.addAttribute("name", name);
		return "home";
	}

}
