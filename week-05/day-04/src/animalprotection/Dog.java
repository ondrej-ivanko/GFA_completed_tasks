package animalprotection;

public class Dog extends Animal{

	public Dog(String ownerName) {
		super(ownerName);
		this.healCost = (int)(1 + Math.random() * 8);
	}

	public String toString() {
		return super.toString();
	}
}
