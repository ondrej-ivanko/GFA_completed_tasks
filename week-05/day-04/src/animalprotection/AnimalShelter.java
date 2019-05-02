package animalprotection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter implements Healable{

	List<Animal> allAnimals = new ArrayList<>();
	List<String> allAdopters = new ArrayList<>();
	int budget;

	public AnimalShelter() {
		this.budget = 50;
	}

	public int rescue(Animal animal) {
		allAnimals.add(animal);
		return allAnimals.size();
	}

	public int heal() {
		int healed = 0;
		for (Animal animal : allAnimals) {
			if (!animal.isHealthy & getBudget() > animal.healCost) {
				this.setBudget(getBudget()  - animal.healCost);
				animal.heal();
				healed = healed + 1;
			}
		}
		return healed;
	}

	public void addAdopter(String name) {
		allAdopters.add(name);
	}

	public void findNewOwner() {
		if (!allAnimals.isEmpty() & !allAdopters.isEmpty()) {
			Animal toAdopt = allAnimals.get(new Random().nextInt(allAnimals.size()));
			if (toAdopt.adoptable()) {
				allAnimals.remove(toAdopt);
				allAdopters.remove(new Random().nextInt(allAdopters.size()));
			}
		}
	}

	public int earnDonation(int amount) {
		setBudget(getBudget() + amount);
		return getBudget();
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Budget: " + getBudget() + "€,\n" + "There are " + allAnimals.size() + "animal(s) and " + allAdopters.size() +
					   " potential adopters\n" + allAnimals.iterator().toString()+ "\n";
	}
}
