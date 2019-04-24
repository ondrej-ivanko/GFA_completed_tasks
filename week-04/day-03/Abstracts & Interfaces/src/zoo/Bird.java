package zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {

	String name;

	public Bird(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public String breed() {
		return "laying eggs";
	}

	@Override
	public void eat() {
		System.out.println(this.name + " eats insects and smaller animals.");
	}

	@Override
	public void land() {

	}

	@Override
	public void takeoff() {

	}

	@Override
	public void fly() {

	}
}
