package com.app.greenfox.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Qualifier("List of student from file.")
public class StudentServiceInFileImpl implements StudentServiceInt {
	private List<String> names;

	public StudentServiceInFileImpl() {
		names = listOfNames();
	}

	public List<String> findAll() {
		return names;
	}

	public void save(String student) {
		names.add(student);
	}

	public int count() {
		return names.size();
	}

	public String isPresent(String student) {
		if (names.contains(student)) {
			return student + " is in the list";
		}
		return student + " is not in the list";
	}

	public List<String> listOfNames() {
		Path file = Paths.get("names.txt");
		List<String> students = new ArrayList<>();
		try {
			students = Files.readAllLines(file);
		} catch (IOException ex) {
			System.out.println("File not readable or not exist.");
		}
		return students;
	}

	public List<String> saveStudent(String student) {
		Path file = Paths.get("names.txt");
		List<String> students = getNames();
		try {
			students.add(student);
			Files.write(file, students);
		} catch (IOException ex) {
			System.out.println("File not editable or does not exist.");
		}
		return students;
	}

	public List<String> getNames() {
		return names;
	}
}