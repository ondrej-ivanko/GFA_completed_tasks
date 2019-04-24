package main.java.music;

public class ElectricGuitar extends StringedInstrument {
	String name = "Electric Guitar";
	int numberOfStrings = 6;

	public ElectricGuitar() {

	}

	public ElectricGuitar(int number) {
		this.numberOfStrings = number;
	}

	@Override
	String sound() {
		return "Twang";
	}

	@Override
	public void play() {
		System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
	}
}
