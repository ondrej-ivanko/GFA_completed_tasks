package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	List<Animal> allAnimals = setsAnimals();
	int freespace = 2;

	public List<Animal> setsAnimals() {
		List<Animal> createdAnimals = new ArrayList<>();
		Animal pig = new Animal();
		createdAnimals.add(pig);
		Animal goose = new Animal();
		createdAnimals.add(goose);
		Animal duck = new Animal();
		createdAnimals.add(duck);
		Animal goat = new Animal();
		createdAnimals.add(goat);
		return createdAnimals;
	}

	public void breed(Animal newAnimal) {
		if (freespace > allAnimals.size())
		newAnimal = new Animal();
		this.freespace -= 1;
	}

	public void slaughter(List<Animal> allAnimals) {
		Animal leastHungry = null;
		for (int i = 0; i < allAnimals.size() - 1; i++) {
			if (allAnimals.get(i).hunger < allAnimals.get(i + 1).hunger) {
				leastHungry = allAnimals.get(i);
			} else {
				leastHungry = allAnimals.get(i + 1);
			}
		}
		allAnimals.remove(leastHungry);
	}
}
