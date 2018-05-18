package com.example.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PortfolioController {
        @RequestMapping("/")
        public String home() {
                return "forward:/home.html";
        }
        
        @RequestMapping("/me")
        public String about() {
                return "forward:/aboutme.html";
        }
        
        @RequestMapping("/projects")
        public String projects() {
                return "forward:/portfolio.html";
        }
}