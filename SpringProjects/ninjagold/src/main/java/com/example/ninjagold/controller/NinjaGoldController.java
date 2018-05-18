package com.example.ninjagold.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
	@RequestMapping("/")
	public String home(HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		if(gold == null) {
			session.setAttribute("gold", 0);
		}
		return "home";
	}
	
	@RequestMapping("/process")
	public String process(@RequestParam("building") String building, HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		int newGold;
		switch(building) {
		case "farm": newGold = (int) (Math.random()*6+1);
		break;
		case "house": newGold = (int) (Math.random()*10+1);
		break;
		case "castle": newGold = (int) (Math.random()*20+1);
		break;
		default: newGold=0;
		}
		
		session.setAttribute("gold", gold + newGold);
		
		return "redirect:/";
	}

}
