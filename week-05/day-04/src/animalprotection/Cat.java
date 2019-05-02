package animalprotection;

import java.util.Random;

public class Cat extends Animal {

	public Cat(String ownerName) {
		super(ownerName);
		this.healCost = (new Random().nextInt(7));
	}

	public String toString() {
		return super.toString();
	}
}
