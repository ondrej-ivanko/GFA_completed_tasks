package zoo;

public class Reptile extends Animal {

	String name;

	public Reptile(String name) {
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
		System.out.println(this.name + " eats juicy piece of meat.");
	}


}
