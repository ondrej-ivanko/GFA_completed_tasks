package animalprotection;

public class Main {

	public static void main(String[] args) {
		Animal cat = new Cat("Darren");
		Animal parrot = new Parrot("Sonny");
		Animal dog = new Dog("Bitch Lesbian");
		AnimalShelter paradise = new AnimalShelter();
		paradise.rescue(parrot);
		paradise.rescue(dog);
		paradise.rescue(cat);
		paradise.earnDonation(10);
		paradise.addAdopter("Karl");
		paradise.addAdopter("Simone");
		paradise.heal();
		paradise.findNewOwner();

	}
}
