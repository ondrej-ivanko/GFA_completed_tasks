package com.homework.bookstore.controllers;

import com.homework.bookstore.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BooksByAuthorController extends BookStoreController {

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String listByAuthor(Model model, @RequestParam(name = "author", required = false) String author) {
		List<Book> queriedBooks;
		if (author != null) {
			queriedBooks = bookStore.filterBooksByAuthor(author);
		} else {
			queriedBooks = bookStore.getLibrary();
		}
		model.addAttribute("book", queriedBooks);
		return "index";
	}

}
