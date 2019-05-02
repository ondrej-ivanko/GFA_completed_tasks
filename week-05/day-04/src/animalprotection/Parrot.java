package animalprotection;

public class Parrot extends Animal{

	public Parrot(String ownerName) {
		super(ownerName);
		super.healCost = (int)(4 + Math.random() * 11);
	}

	public String toString() {
		return super.toString();
	}
}
