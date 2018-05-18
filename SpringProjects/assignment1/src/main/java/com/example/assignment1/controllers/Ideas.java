package com.example.assignment1.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.assignment1.models.Idea;
import com.example.assignment1.models.User;
import com.example.assignment1.services.IdeaService;
import com.example.assignment1.services.UserService;

@Controller
public class Ideas {
	private final IdeaService ideaService;
	private final UserService userService;
	
	public Ideas(IdeaService ideaService, UserService userService) {
		this.ideaService = ideaService;
		this.userService = userService;
	}
	
	@RequestMapping("/bright_ideas")
	public String getIdeas(HttpSession session, @ModelAttribute("idea") Idea idea, Model model) {
		model.addAttribute("ideas", ideaService.getAll());
		User user =  userService.findUserById((long) session.getAttribute("user_id"));
		// System.out.println(user);
		model.addAttribute("userName", user.getName());
		if(session.getAttribute("user_id") == null) {
			return "redirect:/";
		}
		return "bright_ideas.jsp";
	}
	
	@RequestMapping("/add_idea")
	public String addIdea(@Valid @ModelAttribute("idea") Idea idea, HttpSession session, BindingResult result, Model model) {
		ideaService.createIdea(idea, session);
		return "redirect:/bright_ideas";
	}

}