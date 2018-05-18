package com.example.dojoandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dojoandninjas.models.Ninja;
import com.example.dojoandninjas.services.DojoService;
import com.example.dojoandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninjas")
public class Ninjas {
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	
	public Ninjas(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.getAll());
		return "/ninjas/new.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/ninajs/new.jsp";
		} else {
			Ninja n = ninjaService.createNinja(ninja);
			String dojoId = Long.toString(n.getDojo().getId());
			return "redirect:/dojos/".concat(dojoId);
		}
	}
}