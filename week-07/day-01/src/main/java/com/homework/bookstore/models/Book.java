package com.homework.bookstore.models;

public class Book {

	private static int nextId = 0;
	private int id;
	private String title;
	private String author;
	private int releaseYear;

	public Book(String title, String author, int releaseYear) {
		this.id = nextId++;
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getReleaseYear() {
		return releaseYear;
	}
}

