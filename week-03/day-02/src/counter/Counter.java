package counter;

public class Counter {
	int counter;

	public Counter() {

	}

	public Counter(int value) {
		this.counter = value;
	}

	public void add() {
		this.counter++;
	}
	public void add(int number) {
		this.counter += number;
	}
	public int get() {
		return this.counter;
	}

	public void reset() {
		this.counter = 0;
	}
}
