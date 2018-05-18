package com.example.loginregistration.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.loginregistration.models.User;
import com.example.loginregistration.services.UserService;

@Controller
public class MainController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	private final UserService userService;
	
	public MainController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping("/")
	public String home(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	@PostMapping("/register/user")
	public String userHandler(@RequestParam("c_password") String c_password, @Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if(result.hasErrors() || session.getAttribute("user_id") != null) {
			return "index.jsp";
		} else {
			System.out.println(user);
			userService.saveUser(user, c_password, session);
			if(session.getAttribute("user_id") != null) {
				return "redirect:/dashboard";
			} else {
				return "index.jsp";
			}
		}
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("/login/user")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session) {
		if(userService.login(email, password, session)) {
			return "redirect:/dashboard";
		}
		return "redirect:/";
	}

}