package com.homework.bookstore.controllers;

import com.homework.bookstore.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Controller
public class BookByIdController extends BookStoreController{

	@RequestMapping(path = "/books/{id}/details", method = RequestMethod.GET)
	public String showBookById(Model model, @PathVariable(name = "id") int id) {
		List<Book> search = bookStore.getLibrary().stream().filter(book -> book.getId() == id).collect(toList());
		if (search == null) {
			model.addAttribute("error", "No book found");
		} else {
			model.addAttribute("book", search.get(0));
		}
		return "bookById";
	}
}
