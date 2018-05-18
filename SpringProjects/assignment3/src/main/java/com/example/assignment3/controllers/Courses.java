package com.example.assignment3.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.assignment3.models.Semester;
import com.example.assignment3.models.User;
import com.example.assignment3.services.CourseService;
import com.example.assignment3.services.SemesterService;
import com.example.assignment3.services.UserService;

@Controller
public class Courses {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	private final UserService userService;
	private final CourseService courseService;
	private final SemesterService semesterService;

	public Courses(UserService userService, CourseService courseService, SemesterService semesterService) {
		this.userService = userService;
		this.courseService = courseService;
		this.semesterService = semesterService;
	}
	
	@RequestMapping("/home")
	public String getIdeas(HttpSession session, Model model, SemesterService semesterService, @Valid @ModelAttribute("semester") Semester semester, BindingResult result) {
		// First make sure that a user is logged in to view page
		if (session.getAttribute("user_id") == null) {
			return "redirect:/";
		}

		// Get currently logged-in User
		User user = userService.findUserById((long) session.getAttribute("user_id"));
		model.addAttribute("userName", user.getName());
		model.addAttribute("user", user);
		
		model.addAttribute("courses", courseService.getAll());
		model.addAttribute("semesters", semesterService.getAll());

		return "home.jsp";
	}

}