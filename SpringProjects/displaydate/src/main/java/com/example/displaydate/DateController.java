package com.example.displaydate;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		model.addAttribute("date", dateFormat.format(date));
		return "date";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		model.addAttribute("time", timeFormat.format(time));
		return "time";
	}
	

}
