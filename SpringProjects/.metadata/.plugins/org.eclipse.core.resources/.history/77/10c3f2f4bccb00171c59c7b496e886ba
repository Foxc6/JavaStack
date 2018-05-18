package com.example.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.productsandcategories.models.CategoriesProducts;
import com.example.productsandcategories.models.Product;
import com.example.productsandcategories.services.CategoryService;
import com.example.productsandcategories.services.ProductService;

@Controller
@RequestMapping("/products")
public class Products {
	private final ProductService productService;
	private final CategoryService categoryService;
	
	public Products(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
	@RequestMapping("/new")
	public String newProduct(@ModelAttribute("product") Product products) {
		return "/products/new.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "/products/new.jsp";
		} else {
			Product prod = productService.createProduct(product);
			String prodId = Long.toString(prod.getId());
			return "redirect:/products/".concat(prodId);
		}
	}
	
	@RequestMapping("/{id}")
	public String showProduct(@ModelAttribute("catProd") CategoriesProducts catProd, @PathVariable("id") Long id, Model model) {
		Product product = productService.getProduct(id);
		model.addAttribute("product", product);
		model.addAttribute("categories", categoryService.availableCategories(product));
		return "/products/show.jsp";
	}
	
	@RequestMapping(value="/addCategory", method=RequestMethod.POST)
	public String addCategory(@ModelAttribute("catProd") CategoriesProducts catProd) {
		categoryService.addCategory(catProd);
		String prodId = Long.toString(catProd.getProduct().getId());
		return "redirect:/products/".concat(prodId);
	}	

}
