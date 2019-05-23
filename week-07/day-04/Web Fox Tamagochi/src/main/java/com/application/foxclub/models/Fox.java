package com.application.fox.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {

	private SavedFoxes foxes;

	private String name;
	private List<String> tricks;
	private int food;
	private int drink;

	public Fox(String name) {
		this.name = name;
		this.tricks = new ArrayList<>();
		this.food = 0;
		this.drink = 0;
		foxes = new SavedFoxes();
	}

	public Fox(String name, int food, int drink) {
		this.name = name;
		this.tricks = new ArrayList<>(Arrays.asList("Fence jumping", "Roller-skatting", "Chasing tails"));
		this.food = food;
		this.drink = drink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTricks() {
		return tricks;
	}

	public void setTricks(List<String> tricks) {
		this.tricks = tricks;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getDrink() {
		return drink;
	}

	public void setDrink(int drink) {
		this.drink = drink;
	}

	public void addFox(Fox fox) {
		foxes.getAllFoxes().add(fox);
	}

	public int amountOfTricks() {
		return getTricks().size();
	}
}
