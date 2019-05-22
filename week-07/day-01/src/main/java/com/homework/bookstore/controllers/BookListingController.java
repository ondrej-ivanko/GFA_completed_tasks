package com.homework.bookstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookListingController extends BookStoreController{

	@RequestMapping(value = "/books-by-author", method = RequestMethod.GET)
	public String showBooks(Model model) {
		model.addAttribute("books", bookStore.getLibrary());
		return "index";
	}

}
