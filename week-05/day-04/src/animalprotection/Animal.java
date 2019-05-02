package animalprotection;

public class Animal{

	String ownerName;
	boolean isHealthy;
	int healCost;

	public Animal(String name) {
		this.ownerName = name;
		this.isHealthy = false;
	}

	public void heal() {
		this.isHealthy = true;
	}

	public boolean adoptable() {
		if (isHealthy) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.isHealthy) {
			return this.getClass().getSimpleName() + " is healthy and adoptable.";
		}
		return this.getClass().getSimpleName() + " is not healthy (" + this.healCost + "€), and not adoptable.";
	}
}
