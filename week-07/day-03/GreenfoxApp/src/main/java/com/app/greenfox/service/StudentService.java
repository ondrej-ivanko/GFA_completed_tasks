package com.app.greenfox.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("Normal service")
public class StudentService implements StudentServiceInt {

	ArrayList<String> names;

	public StudentService() {
		names = new ArrayList<>();
		names.add("Sanyi");
		names.add("Lilla");
		names.add("John");
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


}