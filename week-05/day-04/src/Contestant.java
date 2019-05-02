public class Contestant implements Comparable<Contestant> {

	private String name;
	private int placement;

	public Contestant(String name) {
		this.name = name;
		this.placement = 0;
	}

	public void setPlacement(int placement) {
		this.placement = placement;
	}

	public String toString() {
		return this.name + " has finished on place: " + this.placement;
	}

	public String getName() {
		return name;
	}

	public int getPlacement() {
		return placement;
	}

	@Override
	public int compareTo(Contestant contestant) {
		if (this.getPlacement() ==  contestant.getPlacement()) {
			return 0;
		} else if (this.getPlacement() < contestant.getPlacement()) {
			return -1;
		} else {
			return 1;
		}
	}
}
