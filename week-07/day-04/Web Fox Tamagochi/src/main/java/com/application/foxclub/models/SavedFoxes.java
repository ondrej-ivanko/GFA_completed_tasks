package com.application.foxclub.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SavedFoxes {

	private List<Fox> allFoxes;
	List<String> tricks = new ArrayList<>(Arrays.asList("fencing", "flying", "sprinting"));

	private Fox currentFox = null;

	public SavedFoxes() {
		this.allFoxes = new ArrayList<>();
		allFoxes.add(new Fox("Donna", "chicken", "water"));
		allFoxes.add(new Fox("Ray", "apples", "beer"));
	}

	public Fox getCurrentFox() {
		return currentFox;
	}

	public void setCurrentFox(Fox currentFox) {
		this.currentFox = currentFox;
	}

	public List<Fox> getAllFoxes() {
		return allFoxes;
	}

	public List<String> getTricks() {
		return tricks;
	}

	public void setTricks(List<String> tricks) {
		this.tricks = tricks;
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
