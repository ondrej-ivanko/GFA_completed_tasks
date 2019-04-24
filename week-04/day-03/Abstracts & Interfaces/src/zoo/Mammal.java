package zoo;

public class Mammal extends Animal{

	String name;

	public Mammal(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	public String breed() {
		return "pushing miniature versions out";
	}

	@Override
	public void eat() {
		System.out.println(this.name + " eats juicy meat.");
	}
}
