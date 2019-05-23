package com.application.fox.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SavedFoxes {

	private List<Fox> allFoxes;

	public SavedFoxes() {
		this.allFoxes = new ArrayList<>();
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
}
