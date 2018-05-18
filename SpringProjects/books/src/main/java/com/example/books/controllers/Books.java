package com.example.books.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.books.models.Book;
import com.example.books.services.BookService;
@Controller
public class Books {
	private final BookService bookService;
	
	public Books(BookService bookService) {
		this.bookService = bookService;
	}
	// Index Route
    @RequestMapping("/books")
    public String books(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "books";
    }
    
    // Show One Route
    @RequestMapping("/books/{id}")
    public String findBookById(Model model, @PathVariable("id") Long id) {
        Book book = bookService.findBookById(id);
        model.addAttribute("book", book);
        return "showBook";
    }
    
    // GET ROUTE Add New
    @RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "newBook";
    }
    
    // POST ROUTE Add New
    @PostMapping("/books/new")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "newBook";
        }else{
        		bookService.addBook(book);
            return "redirect:/books";
        }
    }
    
    // GET ROUTE Edit Existing
    @RequestMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBookById(id);
        if (book != null){
            model.addAttribute("book", book);
            return "editBook";
        }else{
            return "redirect:/books";
        }
    }
    
    // POST ROUTE Edit Existing
    @PostMapping("/books/edit/{id}")
    public String updateBook(@Valid @ModelAttribute("book") Book book, BindingResult result, @PathVariable("id") Long id) {
        if (result.hasErrors()) {
            return "editBook.jsp";
        }else{
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }
    
    // Delete Route
    @RequestMapping(value="/books/delete/{id}")
    public String destroyBook(@PathVariable("id") Long id) {
        bookService.destroyBook(id);
        return "redirect:/books";
    }
}