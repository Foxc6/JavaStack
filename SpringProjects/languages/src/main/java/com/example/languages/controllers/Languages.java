package com.example.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.languages.models.Language;
import com.example.languages.services.LanguageService;
@Controller
public class Languages {
	private final LanguageService languageService;
	
	public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	// Index Route
    @RequestMapping("/languages")
    public String languages(Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "languages";
    }
    
    // Show One Route
    @RequestMapping("/languages/{id}")
    public String findLanguageById(Model model, @PathVariable("id") Long id) {
        Language language = languageService.findLanguageById(id);
        model.addAttribute("language", language);
        return "showLanguage";
    }
    
    // GET ROUTE Add New
    @RequestMapping("/languages/new")
    public String newBook(@ModelAttribute("language") Language language) {
        return "newLanguage";
    }
    
    // POST ROUTE Add New
    @PostMapping("/languages/new")
    public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "newLanguage";
        }else{
        		languageService.addLanguage(language);
            return "redirect:/languages";
        }
    }
    
    // GET ROUTE Edit Existing
    @RequestMapping("/languages/edit/{id}")
    public String editLanguage(@PathVariable("id") Long id, Model model) {
        Language language = languageService.findLanguageById(id);
        if (language != null){
            model.addAttribute("language", language);
            return "editLanguage";
        }else{
            return "redirect:/languages";
        }
    }
    
    // POST ROUTE Edit Existing
    @PostMapping("/languages/edit/{id}")
    public String updateLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
            return "editLanguage.jsp";
        }else{
            languageService.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    
    // Delete Route
    @RequestMapping(value="/languages/delete/{id}")
    public String destroyLanguage(@PathVariable("id") Long id) {
        languageService.destroyLanguage(id);
        return "redirect:/languages";
    }
}
