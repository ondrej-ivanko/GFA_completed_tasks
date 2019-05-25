package com.application.foxclub.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SavedFoxes {

	private List<Fox> allFoxes;

	public SavedFoxes() {
		this.allFoxes = new ArrayList<>();
		allFoxes.add(new Fox("Donna", "chicken", "water"));
		allFoxes.add(new Fox("Ray", "apples", "beer"));
	}

	public List<Fox> getAllFoxes() {
		return allFoxes;
	}

	public boolean isInList(String name) {
		List<Fox> isPresent = allFoxes.stream().filter(fox -> fox.getName().equals(name)).collect(Collectors.toList());
		if (!isPresent.isEmpty()) {
			return true;
		}
		return false;
	}

	public void addFox(Fox fox) {
		getAllFoxes().add(fox);
	}

	public Fox findFox(String name) {
		for (Fox fox : allFoxes) {
			if (fox.getName().equals(name)) {
				return fox;
			}
		}
		return null;
	}
}
