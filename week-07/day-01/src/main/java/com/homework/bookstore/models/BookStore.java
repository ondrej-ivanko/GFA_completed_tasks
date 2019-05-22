package com.homework.bookstore.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookStore {

	private List<Book> library = new ArrayList<>();

	public void addBook(Book book) {
		library.add(book);
	}

	public List<Book> getLibrary() {
		return library;
	}

	public List<Book> filterBooksByAuthor(String author) {
		return library.stream()
				       .filter(book -> book.getAuthor().equals(author))
				       .collect(Collectors.toList());
	}
}
