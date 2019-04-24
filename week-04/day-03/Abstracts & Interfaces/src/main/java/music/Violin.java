package main.java.music;

public class Violin extends StringedInstrument {
	String name = "Violin";
	int numberOfStrings = 4;

	public Violin() {

	}

	public Violin(int number) {
		this.numberOfStrings = number;
	}

	@Override
	String sound() {
		return "Screech";
	}

	@Override
	public void play() {
		System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
	}
}
