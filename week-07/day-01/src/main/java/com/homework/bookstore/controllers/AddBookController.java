package com.homework.bookstore.controllers;

import com.homework.bookstore.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddBookController extends BookStoreController{

	@RequestMapping(value = "/books/add", method = RequestMethod.GET)
	public String addBookForm(Model model, @ModelAttribute(name = "book") Book book) {
		model.addAttribute("book", book);
		return "create";
	}

	@RequestMapping(value = "/books/add", method = RequestMethod.POST)
	public String addBookToLibrary(@ModelAttribute(name = "book") Book book) {
		bookStore.addBook(book);
		return "redirect:/books";
	}
}
