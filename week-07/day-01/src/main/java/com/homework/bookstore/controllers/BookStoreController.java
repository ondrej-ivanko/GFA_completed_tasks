package com.homework.bookstore.controllers;

import com.homework.bookstore.models.Book;
import com.homework.bookstore.models.BookStore;

public class BookStoreController {

	BookStore bookStore = new BookStore();

	public BookStore getBookStore() {
		return bookStore;
	}

	public void addBook(Book book) {
		getBookStore().addBook(book);
	}
}
