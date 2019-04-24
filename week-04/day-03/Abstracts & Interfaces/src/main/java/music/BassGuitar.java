package main.java.music;

public class BassGuitar extends StringedInstrument {
	String name = "Bass Guitar";
	int numberOfStrings = 4;

	public BassGuitar() {

	}

	public BassGuitar(int number) {
		this.numberOfStrings = number;
	}

	@Override
	String sound() {
		return "Duum-duum-duum";
	}

	@Override
	public void play() {
		System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
	}
}
